package com.ynotscript.trackme.api.exception;

public class TrackManagerException extends Exception {

	/**
	 * Default SerialID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TrackManagerException() {
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
	public TrackManagerException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with a message.
	 * 
	 * @param message
	 *            the concerned message.
	 */
	public TrackManagerException(final String message) {
		super(message);
	}

	/**
	 * Constructor with a cause.
	 * 
	 * @param cause
	 *            the concerned cause.
	 */
	public TrackManagerException(final Throwable cause) {
		super(cause);
	}
}
