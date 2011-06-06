package com.ynotscript.trackme.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ynotscript.trackme.api.exception.TrackUtilException;

public class TrackUtil {

	private final static Pattern TRACK_ID_PATTERN = Pattern
			.compile("(\\p{Alnum}+)-(\\p{Alnum}+)-(\\p{Alnum}+\\.\\p{Alnum}+)");

	public final static Integer getPartnerIdFromTrackId(String trackId)
			throws TrackUtilException {
		Matcher m = TRACK_ID_PATTERN.matcher(trackId);
		if (!m.find()) {
			throw new TrackUtilException("Doesn't match the pattern");
		}
		try {
			String pIdStr = m.group(1);
			return Integer.parseInt(pIdStr);
		} catch (Exception e) {
			throw new TrackUtilException("Doesn't match the pattern");
		}
	}

	public final static String getApplicationIdFromTrackId(String trackId)
			throws TrackUtilException {
		Matcher m = TRACK_ID_PATTERN.matcher(trackId);
		if (!m.find()) {
			throw new TrackUtilException("Doesn't match the pattern");
		}
		return m.group(2);
	}

	public static String getApplicationVersionFromTrackId(String trackId)
			throws TrackUtilException {
		Matcher m = TRACK_ID_PATTERN.matcher(trackId);
		if (!m.find()) {
			throw new TrackUtilException("Doesn't match the pattern");
		}
		return m.group(3);
	}

}
