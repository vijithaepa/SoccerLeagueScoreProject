package com.vijitha.soccer.entity;

import org.junit.Before;
import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;

@Test
public class TestTeam extends AbstractTest {

	private String teamName = "Team Name";
	private Team team;

	@Before
	public void setUp() {
		team = new Team(teamName);

	}

	public void shouldReturnAGivenTeamHasAName() {
		assertActualAndExpected(teamName, team.getTeamName());
	}

	public void shouldReturnAGivenTeamHasAP_score() {
		int score = 45;
		team.setPlayed(score);
		assertActualAndExpected(score, team.getPlayed());
	}

	public void shouldReturnAGivenTeamHasAW_score() {
		int score = 46;
		team.setWon(score);
		assertActualAndExpected(score, team.getWon());
	}

	public void shouldReturnAGivenTeamHasAL_score() {
		int score = 47;
		team.setLost(score);
		assertActualAndExpected(score, team.getLost());
	}

	public void shouldReturnAGivenTeamHasAD_score() {
		int score = 48;
		team.setDraw(score);
		assertActualAndExpected(score, team.getDraw());
	}

	public void shouldReturnAGivenTeamHasAF_score() {
		int score = 49;
		team.setForScored(score);
		assertActualAndExpected(score, team.getForScored());
	}

	public void shouldReturnAGivenTeamHasAA_score() {
		int score = 41;
		team.setAgainstScored(score);
		assertActualAndExpected(score, team.getAgainstScored());
	}

	public void shouldReturnAGivenTeamHasAPoints() {
		int points = 42;
		team.setPoints(points);
		assertActualAndExpected(points, team.getPoints());
	}
}
