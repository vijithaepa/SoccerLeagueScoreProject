package com.vijitha.soccer.presentation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import com.vijitha.soccer.entity.Team;
import com.vijitha.soccer.service.TeamService;
import com.vijitha.soccer.service.TeamServiceImpl;
import com.vijitha.soccer.util.Extractor;
import com.vijitha.soccer.util.FileHandler;
import com.vijitha.soccer.util.TeamFileExtractor;
import com.vijitha.soccer.util.TeamFileHandler;

/**
 * Bootstrap class and user interface in DOS UI.
 * 
 * @author vijitha.
 * 
 */
public class TeamScoreFinder {
	private static String fileName = "football.dat";
	private static String contextPath = new File("").getAbsolutePath();
	private String option = fileName;

	private FileHandler handler;
	private Extractor<Team> extractor;
	private TeamService teamService;

	public static void main(String[] args) {

		String avaoidingFilePath = new String("target");
		contextPath = contextPath.substring(0, contextPath.indexOf(avaoidingFilePath));
		fileName = contextPath + fileName;
		new TeamScoreFinder().doRun();

	}

	private void doRun() {
		getHelper();
		try {
			if ("x".equalsIgnoreCase(option)) {
				System.out.println("\n########## GOOD BYE ###########\n");
				System.exit(0);
			} else if (option != null && !option.isEmpty()) {
				this.fileName = option;
			} else {
				System.out.println(" ===== File is retrieving from default location : ( " + fileName + " )");
			}
			handler = new TeamFileHandler(fileName);
			extractor = new TeamFileExtractor(handler);
			teamService = new TeamServiceImpl(extractor);

			System.out.println(" ######### Teams has the smallest difference in ‘for’ and ‘against’ goals are : <<<< "
			                + teamService.getSmallerDiffOfAandF() + " >>>>");
		} catch (Exception e) {
			System.out.println("######### Error on application. Please validate the file path and try again...");
		}
	}

	public void getHelper() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n########## WELCOME TO THE SOCCER TEAM SCORES ###########\n");
		System.out.print("== >Please enter a correct filepath for data file.");
		System.out.println("\t\t\n == Ex : /home/football.dat (for linux) \t\t\n == d:/data/football.dat (for wondows) \n");
		System.out.println("== >Or 'X' for Exist application.");
		try {
			this.option = br.readLine();
		} catch (IOException e) {
			System.out.println("Error on system, Please try again later....");
		}

	}

}