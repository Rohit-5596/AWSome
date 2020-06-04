package com.ta.backend.exception;

public class EmployerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployerException() {
		super();
	}

	public EmployerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmployerException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployerException(String message) {
		super(message);
	}

	public EmployerException(Throwable cause) {
		super(cause);
	}

}
