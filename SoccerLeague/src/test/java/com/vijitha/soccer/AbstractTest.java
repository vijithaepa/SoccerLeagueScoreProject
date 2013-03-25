package com.vijitha.soccer;

import static org.testng.Assert.assertEquals;

public class AbstractTest {
	public final <T> void assertActualAndExpected(T actual, T expected) {
		assertEquals(actual, expected);
	}
}
