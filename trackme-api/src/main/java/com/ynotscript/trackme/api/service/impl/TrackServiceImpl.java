package com.ynotscript.trackme.api.service.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.ynotscript.trackme.api.db.ibatis.models.Application;
import com.ynotscript.trackme.api.db.ibatis.models.Handset;
import com.ynotscript.trackme.api.db.ibatis.models.Partner;
import com.ynotscript.trackme.api.exception.TrackManagerException;
import com.ynotscript.trackme.api.exception.TrackUtilException;
import com.ynotscript.trackme.api.manager.TrackManager;
import com.ynotscript.trackme.api.service.TrackService;
import com.ynotscript.trackme.api.service.model.Status;
import com.ynotscript.trackme.api.service.model.TrackRequest;
import com.ynotscript.trackme.api.service.model.TrackResponse;
import com.ynotscript.trackme.api.util.TrackUtil;

@WebService(endpointInterface = "com.ynotscript.trackme.api.service.TrackService")
public class TrackServiceImpl implements TrackService {

	private static final Logger LOGGER = Logger
			.getLogger(TrackServiceImpl.class);

	private TrackManager trackManager;

	@Override
	public TrackResponse track(TrackRequest request) {
		TrackResponse response = getInitialResponse();
		try {
			Partner partner = retrievePartner(request);
			if (null != partner) {
				Application app = retrieveOrCreateApplication(request, partner);
				Handset handset = retrieveOrCreateHandset(request);
				track(app, handset, partner);
				updateResponse(response);
			}
		} catch (Exception e) {
			LOGGER.error("TrackServiceImpl - track", e);
		}
		return response;
	}

	private TrackResponse getInitialResponse() {
		TrackResponse response = new TrackResponse();
		response.setStatus(Status.KO);
		return response;
	}

	private Partner retrievePartner(TrackRequest request)
			throws TrackManagerException, TrackUtilException {
		String trackId = request.getTrackId();
		Integer partnerId = TrackUtil.getPartnerIdFromTrackId(trackId);
		return getTrackManager().retrievePartner(partnerId);
	}

	private Application retrieveOrCreateApplication(TrackRequest request,
			Partner partner) throws TrackManagerException, TrackUtilException {
		String trackId = request.getTrackId();
		Integer partnerId = partner.getPartnerId();
		String appId = TrackUtil.getApplicationIdFromTrackId(trackId);
		String appVersion = TrackUtil.getApplicationVersionFromTrackId(trackId);
		Application app = getTrackManager().retrieveApplication(appId,
				appVersion, partnerId);
		if (null == app) {
			app = getTrackManager().createUnknownApplication(appId, appVersion,
					partnerId);
		}
		return app;
	}

	private Handset retrieveOrCreateHandset(TrackRequest request)
			throws TrackManagerException {
		String handsetId = request.getHandsetId();
		Handset handset = getTrackManager().retrieveHandset(handsetId);
		if (null == handset) {
			handset = getTrackManager().createUnknownHandset(handsetId);
		}
		return handset;
	}

	private void track(Application app, Handset handset, Partner partner)
			throws TrackManagerException {
		getTrackManager().track(app, handset, partner);
	}

	private void updateResponse(TrackResponse response) {
		response.setStatus(Status.OK);
	}

	/**
	 * @param newTrackManager
	 *            the trackManager to set
	 */
	public void setTrackManager(TrackManager newTrackManager) {
		this.trackManager = newTrackManager;
	}

	/**
	 * @return the trackManager
	 */
	public TrackManager getTrackManager() {
		return trackManager;
	}

}
