package com.vijitha.soccer.util;

import java.io.File;
import java.util.List;

import com.vijitha.soccer.exception.ValidationException;

/**
 * Abstract {@link File} handler to read and the content as {@link List} of
 * {@link String} lines.
 * 
 * @author vijitha.
 * 
 */
public abstract class FileHandler {

	protected File file;

	public FileHandler(String fileName) {
		file = new File(fileName);
		if (!file.exists())
			throw new ValidationException("File not found on the specified location.");
	}

	/**
	 * Finalise events before exit.
	 */
	abstract void close();

	/**
	 * File read process.
	 * 
	 * @return
	 */
	abstract List<String> readFile();

}
