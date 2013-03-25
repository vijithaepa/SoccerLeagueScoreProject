package com.vijitha.soccer.presentation;

import com.vijitha.soccer.entity.Team;
import com.vijitha.soccer.exception.ValidationException;
import com.vijitha.soccer.service.TeamService;
import com.vijitha.soccer.service.TeamServiceImpl;
import com.vijitha.soccer.util.Extractor;
import com.vijitha.soccer.util.FileHandler;
import com.vijitha.soccer.util.TeamFileExtractor;
import com.vijitha.soccer.util.TeamFileHandler;

/**
 * Presentation delegate class for UI layer.
 * 
 * @author Vijitha epa
 * 
 */
public class TeamFinder {

	private FileHandler handler;
	private Extractor<Team> extractor;
	private TeamService teamService;

	public String findTeamsForSmallestDiff(String fileName) {

		handler = new TeamFileHandler(fileName);
		extractor = new TeamFileExtractor(handler);
		teamService = new TeamServiceImpl(extractor);
		String result = teamService.getSmallerDiffOfAandF();
		if (null == result || result.isEmpty())
			throw new ValidationException("File not found on the specified location OR invalied data on the file.");
		return teamService.getSmallerDiffOfAandF();

	}

}
