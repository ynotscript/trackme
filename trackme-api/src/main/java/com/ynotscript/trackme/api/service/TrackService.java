package com.ynotscript.trackme.api.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ynotscript.trackme.api.service.model.TrackRequest;
import com.ynotscript.trackme.api.service.model.TrackResponse;

@WebService
public interface TrackService {
	 
	@POST
	@WebMethod
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) 
	TrackResponse track(TrackRequest request);
	
}
