package com.ynotscript.trackme.api.service.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ynotscript.trackme.api.service.TrackService;
import com.ynotscript.trackme.api.service.model.Status;
import com.ynotscript.trackme.api.service.model.TrackRequest;

//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext-test.xml")
public class TrackServiceImplTest {

	@Autowired
	@Qualifier("trackService")
	private TrackService service;

	@Test
	public void track() {
		TrackRequest request = new TrackRequest();
		request.setTrackId("1-myWonderFullAppli-3.1");
		request.setHandsetId("123456789");
		assertTrue(service.track(request).getStatus() == Status.OK);
	}
}
