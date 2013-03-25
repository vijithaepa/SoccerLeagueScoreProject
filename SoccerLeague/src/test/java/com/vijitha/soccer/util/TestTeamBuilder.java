package com.vijitha.soccer.util;

import static junit.framework.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;
import com.vijitha.soccer.entity.Team;

@Test
public class TestTeamBuilder extends AbstractTest {
	private String teamName = "team 1";
	private int played = 10;
	private int won = 1;
	private int lost = 2;
	private int draw = 3;
	private int forScored = 4;
	private int againstScored = 5;
	private int points = 6;

	public void shouldBuildTeam() {
		TeamBuilder builder = TeamBuilder.getBuilder().withName(teamName).withPlayed(played).withWon(won).withLost(lost).withDrawn(draw)
		                .withScoredFor(forScored).withScoredAgainst(againstScored).withPoints(points);
		Team actualTeam = builder.build();
		assertNotNull(actualTeam);
		assertActualAndExpected(actualTeam.getTeamName(), teamName);
		assertActualAndExpected(actualTeam.getPlayed(), played);
		assertActualAndExpected(actualTeam.getForScored(), forScored);
		assertActualAndExpected(actualTeam.getAgainstScored(), againstScored);

	}
}
