package com.vijitha.soccer.service;

import java.util.Collections;
import java.util.List;

import com.vijitha.soccer.entity.Team;
import com.vijitha.soccer.util.Extractor;

public class TeamServiceImpl implements TeamService {

	private Extractor<Team> extractor;

	public TeamServiceImpl(Extractor<Team> extractor) {
		this.extractor = extractor;
	}

	public String getSmallerDiffOfAandF() {

		List<Team> teamList = extractor.extract();
		Collections.sort(teamList);
		StringBuffer teamNames = new StringBuffer();
		String teamName = "";
		int smallestDiff = 0;
		for (int i = 0; i < teamList.size(); i++) {
			if (i == 0) {
				teamName = teamList.get(i).getTeamName();
				smallestDiff = teamList.get(i).getAgainstVsForDifference();
				teamNames.append(teamName);
			} else if (smallestDiff == teamList.get(i).getAgainstVsForDifference()) {
				teamNames.append(" ," + teamList.get(i).getTeamName());
			} else {
				i = teamList.size();
			}

		}
		return teamNames.toString();
	}

}
