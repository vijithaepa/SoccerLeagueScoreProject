package com.vijitha.soccer.exception;

/**
 * Exception class which handles the validation exceptions as runtime.
 * 
 * @author Vijitha epa
 * 
 */
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 2659834301418572821L;

	public ValidationException() {
		super();
	}

	public ValidationException(String errorMessage) {
		super(errorMessage);
	}

}
