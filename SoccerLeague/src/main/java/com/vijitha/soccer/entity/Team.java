package com.vijitha.soccer.entity;

/**
 * Entity to hold scores of the player.
 * 
 * @author Vijitha epa
 * 
 */
public class Team implements Comparable<Team> {

	private String teamName;
	private int played;
	private int won;
	private int lost;
	private int draw;
	private int forScored;
	private int againstScored;
	private int points;

	public Team(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getPlayed() {
		return played;
	}

	public void setPlayed(int played) {
		this.played = played;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getForScored() {
		return forScored;
	}

	public void setForScored(int forScored) {
		this.forScored = forScored;
	}

	public int getAgainstScored() {
		return againstScored;
	}

	public void setAgainstScored(int againstScored) {
		this.againstScored = againstScored;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Integer getAgainstVsForDifference() {
		int abs = Math.abs(getAgainstScored() - getForScored());
		return abs;
	}

	public int compareTo(Team otherTeam) {
		return this.getAgainstVsForDifference().compareTo(otherTeam.getAgainstVsForDifference());
	}

	@Override
	public String toString() {
		return "Team [Team Name=" + teamName + ", played=" + played + ", won=" + won + ", lost=" + lost + ", draw=" + draw + ", forScored="
		                + forScored + ", againstScored=" + againstScored + ", points=" + points + "]";
	}

}
