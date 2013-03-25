package com.vijitha.soccer.util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vijitha.soccer.exception.ValidationException;

public class TeamFileHandler extends FileHandler {
	public TeamFileHandler(String fileName) {
		super(fileName);
	}

	@Override
	void close() {
		// TODO : finalizing
	}

	/**
	 * Helper method which will return {@Link List} of {@link String}s by
	 * reading the assigned file.
	 */
	@Override
	List<String> readFile() {
		Scanner sc;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new ValidationException("File not found on the specified location.");
		}
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
			lines.add(sc.nextLine());
		}
		return lines;
	}
}
