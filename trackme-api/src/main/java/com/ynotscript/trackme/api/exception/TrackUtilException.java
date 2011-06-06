package com.ynotscript.trackme.api.exception;

public class TrackUtilException extends Exception {

	/**
	 * Default SerialID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TrackUtilException() {
		super();
	}

	/**
	 * Constructor with a message and a cause.
	 * 
	 * @param message
	 *            the concerned message.
	 * @param cause
	 *            the concerned cause;
	 */
	public TrackUtilException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with a message.
	 * 
	 * @param message
	 *            the concerned message.
	 */
	public TrackUtilException(final String message) {
		super(message);
	}

	/**
	 * Constructor with a cause.
	 * 
	 * @param cause
	 *            the concerned cause.
	 */
	public TrackUtilException(final Throwable cause) {
		super(cause);
	}

}
