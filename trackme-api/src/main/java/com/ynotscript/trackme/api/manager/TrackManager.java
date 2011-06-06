package com.ynotscript.trackme.api.manager;

import com.ynotscript.trackme.api.db.ibatis.models.Application;
import com.ynotscript.trackme.api.db.ibatis.models.Handset;
import com.ynotscript.trackme.api.db.ibatis.models.Partner;
import com.ynotscript.trackme.api.exception.TrackManagerException;

public interface TrackManager {

	Partner retrievePartner(Integer partnerId) throws TrackManagerException;

	Application retrieveApplication(String appId, String appVersion,
			Integer partnerId) throws TrackManagerException;

	Application createUnknownApplication(String appId, String appVersion, Integer partnerId)
			throws TrackManagerException;

	Handset retrieveHandset(String handsetId) throws TrackManagerException;

	Handset createUnknownHandset(String handsetId) throws TrackManagerException;

	void track(Application app, Handset handset, Partner partner)
			throws TrackManagerException;

}
