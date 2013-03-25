package com.vijitha.soccer.entity.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.vijitha.soccer.entity.Team;

public class TeamCreateSteps {

	private String teamName;
	private Team team;

	@Given("team name is $name")
	public void createTeamWithName(String teamName) {
		this.teamName = teamName;
	}

	@When("build the team")
	public void createTeamWithName() {
		team = new Team(teamName);
	}

	@Then("team should have the given name as $teamName")
	public void AssertTeamName(String teamName) {
		Assert.assertEquals(teamName, team.getTeamName());
	}

	@When("set the played score as $score")
	public void createTeamWithPalyed(int score) {
		team.setPlayed(score);
	}

	@Then("team should have the played score as $score")
	public void AssertPlayedScore(int score) {
		Assert.assertEquals(score, team.getPlayed());
	}

	@When("set the won score as $score")
	public void createTeamWithWonScore(int score) {
		team.setWon(score);
	}

	@Then("team should have the won score as $score")
	public void AssertWonScore(int score) {
		Assert.assertEquals(score, team.getWon());
	}

	@When("set the lost score as $score")
	public void createTeamWithLostScore(int score) {
		team.setLost(score);
	}

	@Then("team should have the lost score as $score")
	public void AssertLostScore(int score) {
		Assert.assertEquals(score, team.getLost());
	}

	@When("set the draw score as $score")
	public void createTeamWithDrawScore(int score) {
		team.setDraw(score);
	}

	@Then("team should have the draw score as $score")
	public void AssertDrawScore(int score) {
		Assert.assertEquals(score, team.getDraw());
	}

	@When("set the forScored score as $score")
	public void createTeamWithForScoredScore(int score) {
		team.setForScored(score);
	}

	@Then("team should have the forScored score as $score")
	public void AssertForScoredScore(int score) {
		Assert.assertEquals(score, team.getForScored());
	}

	@When("set the againstScored score as $score")
	public void createTeamWithAgainstScoredScore(int score) {
		team.setAgainstScored(score);
	}

	@Then("team should have the againstScored score as $score")
	public void AssertAgainstScoredScore(int score) {
		Assert.assertEquals(score, team.getAgainstScored());
	}

	@When("set the points score as $score")
	public void createTeamWithPointsScore(int score) {
		team.setPoints(score);
	}

	@Then("team should have the points score as $score")
	public void AssertPointsScore(int score) {
		Assert.assertEquals(score, team.getPoints());
	}

}
