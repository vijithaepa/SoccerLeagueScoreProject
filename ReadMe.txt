This contains the set of instructions required to build and run the Team Score application.

Contents :
==========
.
├── football.dat
├── lib
│   └── swing-layout-1.0.3.jar
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── vijitha
│   │   │           └── soccer
│   │   │               ├── entity
│   │   │               │   └── Team.java
│   │   │               ├── exception
│   │   │               │   └── ValidationException.java
│   │   │               ├── presentation
│   │   │               │   ├── Find.form
│   │   │               │   ├── SoccerLeagueUI.java
│   │   │               │   ├── TeamFinder.java
│   │   │               │   └── TeamScoreFinder.java
│   │   │               ├── service
│   │   │               │   ├── TeamServiceImpl.java
│   │   │               │   └── TeamService.java
│   │   │               └── util
│   │   │                   ├── EntityBuilder.java
│   │   │                   ├── Extractor.java
│   │   │                   ├── FileHandler.java
│   │   │                   ├── TeamBuilder.java
│   │   │                   ├── TeamFileExtractor.java
│   │   │                   └── TeamFileHandler.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── vijitha
│       │           └── soccer
│       │               ├── AbstractTest.java
│       │               ├── entity
│       │               │   ├── steps
│       │               │   │   └── TeamCreateSteps.java
│       │               │   ├── TeamStory.java
│       │               │   ├── team_story.story
│       │               │   └── TestTeam.java
│       │               ├── exception
│       │               │   └── TestValidationException.java
│       │               ├── service
│       │               │   └── TestTeamService.java
│       │               └── util
│       │                   ├── TestFileHandler.java
│       │                   ├── TestTeamBuilder.java
│       │                   └── TestTeamFileExtractor.java
│       └── resources
│           └── football.dat
└── target
    ├── classes
    └── test-classes
        └── football.dat



Building the Project.
====================

Pre-requisites
--------------
JDK 1.6.x or higher
Maven 2 or higher
set java_home and m2_home.

Steps:
------
1 - Unzip the SoccerLeagueScoreProject.zip
2 - Go to the project home directory /SoccerLeagueScoreProject/soccerLeague/, and run 
    - mvn clean package
    - This might take a few seconds to download all the dependencies to your local M2 repo.
3 - To run the tests,
    - mvn clean test
4 - To Run the com.vijitha.soccer.entity.TeamStory (BDD Story) as JUnitTest
    - Make sure team_story.story is exists in the location
      SoccerLeague/target/test-classes/com/vijitha/soccer/entity/
    - If not exists, then manually copy team_story.story to the location

Running the application.
========================

Go to target folder (/SoccerLeagueScoreProject/soccerLeague/target) and enter the command
	java -jar SoccerLeague.jar

- Follow the prompts made by the application.

***Additional Information on run the application
	- Please note that user required to input data file location including the file name
	Ex: /SoccerLeagueScoreProject/soccerLeague/football.dat



