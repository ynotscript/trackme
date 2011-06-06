package com.ynotscript.trackme.api.manager.impl;

import java.util.List;

import com.ynotscript.trackme.api.db.ibatis.daos.ApplicationDAO;
import com.ynotscript.trackme.api.db.ibatis.daos.HandsetDAO;
import com.ynotscript.trackme.api.db.ibatis.daos.HandsetHasApplicationDAO;
import com.ynotscript.trackme.api.db.ibatis.daos.PartnerDAO;
import com.ynotscript.trackme.api.db.ibatis.models.Application;
import com.ynotscript.trackme.api.db.ibatis.models.ApplicationExample;
import com.ynotscript.trackme.api.db.ibatis.models.Handset;
import com.ynotscript.trackme.api.db.ibatis.models.HandsetExample;
import com.ynotscript.trackme.api.db.ibatis.models.HandsetHasApplication;
import com.ynotscript.trackme.api.db.ibatis.models.Partner;
import com.ynotscript.trackme.api.exception.TrackManagerException;
import com.ynotscript.trackme.api.manager.TrackManager;

public class TrackManagerImpl implements TrackManager {

	private PartnerDAO partnerDAO;

	private ApplicationDAO applicationDAO;

	private HandsetDAO handsetDAO;

	private HandsetHasApplicationDAO handsetHasApplicationDAO;

	@Override
	public Partner retrievePartner(Integer partnerId)
			throws TrackManagerException {
		Partner partner = null;
		try {
			partner = getPartnerDAO().selectByPrimaryKey(partnerId);
		} catch (Exception e) {
			throw new TrackManagerException("retrievePartner", e);
		}
		return partner;
	}

	@Override
	public Application retrieveApplication(String appId, String appVersion,
			Integer partnerId) throws TrackManagerException {
		Application app = null;
		try {
			ApplicationExample example = new ApplicationExample();
			example.createCriteria().andApplicationPartnerIdEqualTo(appId)
					.andPartnerIdEqualTo(partnerId)
					.andVersionEqualTo(appVersion);
			List<Application> apps = getApplicationDAO().selectByExample(
					example);
			if (null != apps && apps.size() > 0) {
				app = apps.get(0);
			}
		} catch (Exception e) {
			throw new TrackManagerException("retrieveApplication", e);
		}
		return app;
	}

	@Override
	public Application createUnknownApplication(String appId,
			String appVersion, Integer partnerId) throws TrackManagerException {
		try {
			Application record = new Application();
			record.setApplicationPartnerId(appId);
			record.setName("unknown");
			record.setOperatingSystemId(0);
			record.setPartnerId(partnerId);
			record.setVersion(appVersion);
			getApplicationDAO().insert(record);
			return record;
		} catch (Exception e) {
			throw new TrackManagerException("createUnknownApplication", e);
		}
	}

	@Override
	public Handset retrieveHandset(String handsetId)
			throws TrackManagerException {
		Handset handset = null;
		try {
			HandsetExample example = new HandsetExample();
			example.createCriteria().andHandsetPartnerIdEqualTo(handsetId);
			List<Handset> handsets = getHandsetDAO().selectByExample(example);
			if (null != handsets && handsets.size() > 0) {
				handset = handsets.get(0);
			}
		} catch (Exception e) {
			throw new TrackManagerException("retrieveHandset", e);
		}
		return handset;
	}

	@Override
	public Handset createUnknownHandset(String handsetId)
			throws TrackManagerException {
		try {
			Handset record = new Handset();
			record.setHandsetPartnerId(handsetId);
			getHandsetDAO().insert(record);
			return record;
		} catch (Exception e) {
			throw new TrackManagerException("createUnknownHandset", e);
		}
	}

	@Override
	public void track(Application app, Handset handset, Partner partner)
			throws TrackManagerException {
		try {
			Integer applicationId = app.getIdApplication();
			Integer handsetId = handset.getHandsetId();
			HandsetHasApplication hha = getHandsetHasApplicationDAO()
					.selectByPrimaryKey(applicationId, handsetId);
			if (null == hha) {
				hha = new HandsetHasApplication();
				hha.setApplicationId(applicationId);
				hha.setHandsetId(handsetId);
				hha.setNumberOfUse(1);
				getHandsetHasApplicationDAO().insert(hha);
			} else {
				hha.setNumberOfUse(hha.getNumberOfUse() + 1);
				getHandsetHasApplicationDAO().updateByPrimaryKey(hha);
			}
		} catch (Exception e) {
			throw new TrackManagerException("track", e);
		}
	}

	/**
	 * @param partnerDAO
	 *            the partnerDAO to set
	 */
	public void setPartnerDAO(PartnerDAO partnerDAO) {
		this.partnerDAO = partnerDAO;
	}

	/**
	 * @return the partnerDAO
	 */
	public PartnerDAO getPartnerDAO() {
		return partnerDAO;
	}

	/**
	 * @param applicationDAO
	 *            the applicationDAO to set
	 */
	public void setApplicationDAO(ApplicationDAO applicationDAO) {
		this.applicationDAO = applicationDAO;
	}

	/**
	 * @return the applicationDAO
	 */
	public ApplicationDAO getApplicationDAO() {
		return applicationDAO;
	}

	/**
	 * @param handsetDAO
	 *            the handsetDAO to set
	 */
	public void setHandsetDAO(HandsetDAO handsetDAO) {
		this.handsetDAO = handsetDAO;
	}

	/**
	 * @return the handsetDAO
	 */
	public HandsetDAO getHandsetDAO() {
		return handsetDAO;
	}

	/**
	 * @param handsetHasApplicationDAO
	 *            the handsetHasApplicationDAO to set
	 */
	public void setHandsetHasApplicationDAO(
			HandsetHasApplicationDAO handsetHasApplicationDAO) {
		this.handsetHasApplicationDAO = handsetHasApplicationDAO;
	}

	/**
	 * @return the handsetHasApplicationDAO
	 */
	public HandsetHasApplicationDAO getHandsetHasApplicationDAO() {
		return handsetHasApplicationDAO;
	}

}
