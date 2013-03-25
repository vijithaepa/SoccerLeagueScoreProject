package com.vijitha.soccer.service;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;
import com.vijitha.soccer.entity.Team;
import com.vijitha.soccer.util.Extractor;
import com.vijitha.soccer.util.TeamBuilder;

@Test
public class TestTeamService extends AbstractTest {

	List<Team> teams;

	@Mock
	private Extractor<Team> exractoer;

	@InjectMocks
	private TeamService service;

	@Before
	public void setUp() {
		service = new TeamServiceImpl(exractoer);
		initMocks(this);
	}

	public void shouldReturnTheSmallerDiffOf_A_F_Scores() throws Exception {
		// Given
		Team expectedTeam = getSmallestDifAvsFTeam();
		given(exractoer.extract()).willReturn(getTeams());
		// When
		String teamName = service.getSmallerDiffOfAandF();

		// Then
		assertNotNull(teamName);
		assertActualAndExpected(teamName, expectedTeam.getTeamName());

	}

	private List<Team> getTeams() {

		List<Team> teams = new ArrayList<Team>();

		teams.add(getLargestDifAvsFTeam());
		teams.add(getMedeumtDifAvsFTeam());
		teams.add(getSmallestDifAvsFTeam());

		return teams;
	}

	private Team getSmallestDifAvsFTeam() {
		TeamBuilder builder = TeamBuilder.getBuilder();
		return builder.withName("TeamB").withScoredAgainst(12).withDrawn(21).withScoredFor(30).withLost(41).withPlayed(51).withWon(61)
		                .withPoints(71).build();

	}

	private Team getMedeumtDifAvsFTeam() {
		TeamBuilder builder = TeamBuilder.getBuilder();
		return builder.withName("TeamC").withScoredAgainst(11).withDrawn(22).withScoredFor(30).withLost(42).withPlayed(52).withWon(62)
		                .withPoints(72).build();

	}

	private Team getLargestDifAvsFTeam() {
		TeamBuilder builder = TeamBuilder.getBuilder();
		return builder.withName("TeamA").withScoredAgainst(10).withDrawn(20).withScoredFor(30).withLost(40).withPlayed(50).withWon(60)
		                .withPoints(70).build();

	}
}
