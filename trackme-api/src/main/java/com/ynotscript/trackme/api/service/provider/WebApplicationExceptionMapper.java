package com.ynotscript.trackme.api.service.provider;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.ynotscript.trackme.api.service.model.Status;
import com.ynotscript.trackme.api.service.model.TrackResponse;

@Provider
public class WebApplicationExceptionMapper extends
		org.apache.cxf.jaxrs.impl.WebApplicationExceptionMapper {

	@Override
	public Response toResponse(WebApplicationException ex) {
		super.toResponse(ex);
		TrackResponse response = new TrackResponse();
		response.setStatus(Status.KO);
		return Response.status(200).type(MediaType.APPLICATION_JSON)
				.entity(response).build();
	}

}
