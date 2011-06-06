package com.ynotscript.trackme.api.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ynotscript.trackme.api.exception.TrackUtilException;
import com.ynotscript.trackme.api.util.TrackUtil;

public class TrackUtilTest {

	final static String TRACK_ID_GOOD = "12345-myWonderFullApply-3.0";
	
	@Test
	public void trackIdGoodTest() throws TrackUtilException {
			assertTrue(12345 == TrackUtil.getPartnerIdFromTrackId(TRACK_ID_GOOD));
			assertEquals("myWonderFullApply", TrackUtil.getApplicationIdFromTrackId(TRACK_ID_GOOD));
			assertEquals("3.0", TrackUtil.getApplicationVersionFromTrackId(TRACK_ID_GOOD));
	}
}
