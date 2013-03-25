package com.vijitha.soccer.util;

import com.vijitha.soccer.entity.Team;

public class TeamBuilder implements EntityBuilder<Team>{

	private String teamName; // index 2
	private int played; // index 3
	private int won; // index 4
	private int lost; // index 5
	private int drawn; // index 6
	private int scoredFor; // index 7
	private int scoredAgainst; // index 9
	private int points; // index 10

	private TeamBuilder() {
	}

	public static TeamBuilder getBuilder() {
		return new TeamBuilder();
	}

	public TeamBuilder withName(String teamName) {
		this.teamName = teamName;
		return this;
	}

	public TeamBuilder withPlayed(int p_score2) {
		this.played = p_score2;
		return this;
	}

	public TeamBuilder withWon(int w_score2) {
		this.won = w_score2;
		return this;
	}

	public TeamBuilder withLost(int l_score2) {
		this.lost = l_score2;
		return this;
	}

	public TeamBuilder withDrawn(int d_score2) {
		this.drawn = d_score2;
		return this;
	}

	public TeamBuilder withScoredFor(int f_score2) {
		this.scoredFor = f_score2;
		return this;
	}

	public TeamBuilder withScoredAgainst(int a_score2) {
		this.scoredAgainst = a_score2;
		return this;
	}

	public TeamBuilder withPoints(int points2) {
		this.points = points2;
		return this;
	}

	/**
	 * Build the {@link Team} type instance.
	 */
	public Team build() {
		Team aTeam = new Team(teamName);
		aTeam.setPlayed(played);
		aTeam.setWon(won);
		aTeam.setLost(lost);
		aTeam.setDraw(drawn);
		aTeam.setForScored(scoredFor);
		aTeam.setAgainstScored(scoredAgainst);
		aTeam.setPoints(points);

		return aTeam;
	}

}
