package com.vijitha.soccer.util;

import static junit.framework.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;

@Test
public class TestFileHandler extends AbstractTest {

	private FileHandler handler;
	// This need to be change in case the test dat file changed.
	private int teamSizeInFile = 27;

	@Before
	public void setUp() throws Exception {
		String fileName = "football.dat";
		handler = new TeamFileHandler(fileName);
	}

	public void shouldReturnStringList() throws Exception {
		List<String> actualList = handler.readFile();
		assertNotNull(actualList);
		assertActualAndExpected(actualList.size(), teamSizeInFile);
	}
}
