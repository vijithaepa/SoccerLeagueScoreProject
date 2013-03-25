Narrative:

In order to create a Team
As a user
I want to build a Team

Scenario: Buliding Team entity with values

Given team name is Team Name
When build the team
Then team should have the given name as Team Name

When set the played score as 45
Then team should have the played score as 46
	
When set the won score as 46
Then team should have the won score as 46

When set the lost score as 47
Then team should have the lost score as 47

When set the draw score as 48
Then team should have the draw score as 48

When set the forScored score as 49
Then team should have the forScored score as 49

When set the againstScored score as 50
Then team should have the againstScored score as 50

When set the points score as 50
Then team should have the points score as 50
