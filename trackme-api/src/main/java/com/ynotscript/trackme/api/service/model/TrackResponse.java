package com.ynotscript.trackme.api.service.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.ynotscript.trackme.api.service.model.adapter.TrackResponseStatusTypeAdapter;

@XmlRootElement(name = "trackresponse")
public class TrackResponse {

	@XmlTransient
	protected Status status;

	public final void setStatus(final Status status) {
		this.status = status;
	}

	@XmlJavaTypeAdapter(TrackResponseStatusTypeAdapter.class)
	public Status getStatus() {
		return status;
	}

}
