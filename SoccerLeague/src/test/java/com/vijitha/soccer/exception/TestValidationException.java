package com.vijitha.soccer.exception;

import static junit.framework.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;

@Test
public class TestValidationException extends AbstractTest {

	private ValidationException validationException;

	public void shouldCreateExceptionWithoutParams() {
		validationException = new ValidationException();
		assertNotNull(validationException);
	}

	public void shouldCreateExceptionWithMessage() {
		String errorMessage = "Runtime Error";
		validationException = new ValidationException(errorMessage);
		assertNotNull(validationException);
		assertActualAndExpected(validationException.getMessage(), errorMessage);
	}

}
