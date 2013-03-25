package com.vijitha.soccer.service;

/**
 * Handle Team related services.
 * 
 * @author Vijitha epa
 * 
 */
public interface TeamService {

	/**
	 * Returns the team name or names of teams which having the minimum
	 * difference on "for" and "against" goals.
	 * 
	 * @throws Exception
	 */
	String getSmallerDiffOfAandF();

}
