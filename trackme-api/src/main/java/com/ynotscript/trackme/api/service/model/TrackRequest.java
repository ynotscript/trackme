package com.ynotscript.trackme.api.service.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The request of a Track.
 */
@XmlRootElement(name = "trackrequest")
public class TrackRequest {

	/**
	 * The handsetId.
	 */
	private String handsetId;

	/**
	 * The trackId.
	 */
	private String trackId;

	/**
	 * To set the handsetId.
	 * 
	 * @param newHandsetId
	 *            the new handsetId.
	 */
	public final void setHandsetId(final String newHandsetId) {
		this.handsetId = newHandsetId;
	}

	/**
	 * To get the handsetId.
	 * 
	 * @return the handsetId.
	 */
	@XmlElement(name = "handsetId", required = true)
	public final String getHandsetId() {
		return handsetId;
	}

	/**
	 * @param newTrackId
	 *            the trackId to set
	 */
	public void setTrackId(String newTrackId) {
		this.trackId = newTrackId;
	}

	/**
	 * @return the trackId
	 */
	@XmlElement(name = "trackId", required = true)
	public String getTrackId() {
		return trackId;
	}

}
