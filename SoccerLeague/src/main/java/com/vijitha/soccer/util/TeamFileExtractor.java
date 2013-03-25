package com.vijitha.soccer.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vijitha.soccer.entity.Team;

public class TeamFileExtractor implements Extractor<Team> {

	private FileHandler handler;
	// constants used to located(place holders) the values in a single line.
	public static final int COLUMN_TEAM_NAME = 2;
	public static final int COLUMN_PLAYED = 3;
	public static final int COLUMN_WON = 4;
	public static final int COLUMN_LOST = 5;
	public static final int COLUMN_DRAWN = 6;
	public static final int COLUMN_SCORED_FOR = 7;
	public static final int COLUMN_SCORED_AGAINST = 9;
	public static final int COLUMN_POINTS = 10;

	public TeamFileExtractor(FileHandler handler) {
		this.handler = handler;
	}

	public List<Team> extract(){
		List<String> lines = handler.readFile();
		List<Team> teamList = new ArrayList<Team>();
		TeamBuilder teambuilder = TeamBuilder.getBuilder();

		boolean isScoreStarted = false;
		boolean isFileEnd = false;
		String[] teamValues;
		for (int i = 0; !isFileEnd && i < (lines.size()); i++) {
			teamValues = lines.get(i).split("\\s+");
			if (!isScoreStarted && Arrays.asList(teamValues).get(0).equalsIgnoreCase("<pre>")) {
				isScoreStarted = true;
				i++;
				continue;
			} else if (Arrays.asList(teamValues).get(0).equalsIgnoreCase("</pre>")) {
				isScoreStarted = false;
				isFileEnd = true;
			}

			if (isScoreStarted && teamValues.length == 11) {
				teambuilder.withName(teamValues[COLUMN_TEAM_NAME]).withPlayed(Integer.parseInt(teamValues[COLUMN_PLAYED]))
				                .withWon(Integer.parseInt(teamValues[COLUMN_WON])).withLost(Integer.parseInt(teamValues[COLUMN_LOST]))
				                .withDrawn(Integer.parseInt(teamValues[COLUMN_DRAWN]))
				                .withScoredFor(Integer.parseInt(teamValues[COLUMN_SCORED_FOR]))
				                .withScoredAgainst(Integer.parseInt(teamValues[COLUMN_SCORED_AGAINST]))
				                .withPoints(Integer.parseInt(teamValues[COLUMN_POINTS]));
				Team team = teambuilder.build();
				teamList.add(team);
			}

		}

		return teamList;
	}

}
