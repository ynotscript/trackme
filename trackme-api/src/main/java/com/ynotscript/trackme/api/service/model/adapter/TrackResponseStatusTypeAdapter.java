package com.ynotscript.trackme.api.service.model.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.ynotscript.trackme.api.service.model.Status;

public class TrackResponseStatusTypeAdapter extends XmlAdapter<String, Status> {

	@Override
	public final String marshal(final Status status) throws Exception {
		return status.name();
	}

	@Override
	public final Status unmarshal(final String value) throws Exception {
		for (Status status : Status.values()) {
			if (status.name().equals(value)) {
				return status;
			}
		}
		return null;
	}

}
