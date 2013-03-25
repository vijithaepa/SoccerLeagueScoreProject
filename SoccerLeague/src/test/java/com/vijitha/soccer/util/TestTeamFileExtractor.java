package com.vijitha.soccer.util;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.Test;

import com.vijitha.soccer.AbstractTest;
import com.vijitha.soccer.entity.Team;

@Test
public class TestTeamFileExtractor extends AbstractTest {

	@InjectMocks
	private Extractor<Team> extractor;

	@Mock
	private FileHandler handler;

	@Before
	public void setUp() throws FileNotFoundException {
		extractor = new TeamFileExtractor(handler);
		initMocks(this);
	}

	public void shouldReturnTeamsFromFile() throws Exception {
		// Given
		List<Team> expectedList = getExpectedTeamList();
		given(handler.readFile()).willReturn(getActualLineList());
		// When
		List<Team> actualTeams = extractor.extract();

		// Then
		assertNotNull(actualTeams);
		assertActualAndExpected(actualTeams.size(), expectedList.size());
	}

	private List<String> getActualLineList() {
		List<String> lineLIst = new ArrayList<String>();
		lineLIst.add("<pre>");
		lineLIst.add("Team P W L D F A Pts");
		lineLIst.add(" 1. Arsenal 38 26 9 3 79 - 36 87");
		lineLIst.add(" 2. Liverpool 38 24 8 6 67 - 30 80");
		lineLIst.add(" 3. Manchester_U 38 24 5 9 87 - 45 77");
		lineLIst.add(" 4. Newcastle 38 21 8 9 74 - 52 71");
		lineLIst.add(" 5. Leeds 38 18 12 8 53 - 37 66");
		lineLIst.add("</pre>");
		return lineLIst;
	}

	private List<Team> getExpectedTeamList() {
		List<Team> teams = new ArrayList<Team>();
		TeamBuilder builder = TeamBuilder.getBuilder();
		// Order is - Name P W L D F A PTS
		Team team1 = builder.withName("Arsenal").withPlayed(38).withWon(26).withLost(9).withDrawn(3).withScoredFor(79)
		                .withScoredAgainst(36).withPoints(87).build();
		Team team2 = builder.withName("Liverpool").withPlayed(38).withWon(24).withLost(8).withDrawn(6).withScoredFor(67)
		                .withScoredAgainst(30).withPoints(80).build();
		Team team3 = builder.withName("Manchester_U").withPlayed(38).withWon(24).withLost(5).withDrawn(9).withScoredFor(87)
		                .withScoredAgainst(45).withPoints(77).build();
		Team team4 = builder.withName("Newcastle").withPlayed(38).withWon(24).withLost(8).withDrawn(9).withScoredFor(74)
		                .withScoredAgainst(52).withPoints(71).build();
		Team team5 = builder.withName("Leeds").withPlayed(38).withWon(21).withLost(12).withDrawn(8).withScoredFor(53).withScoredAgainst(37)
		                .withPoints(66).build();

		teams.add(team1);
		teams.add(team2);
		teams.add(team3);
		teams.add(team4);
		teams.add(team5);

		return teams;
	}
}
