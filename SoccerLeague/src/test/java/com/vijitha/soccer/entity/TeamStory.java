package com.vijitha.soccer.entity;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.vijitha.soccer.entity.steps.TeamCreateSteps;

/**
 * Demonstrated purpose BDD Suite.
 * 
 * @author Vijitha epa
 * 
 */
public class TeamStory extends JUnitStory {

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
		// Locate the stories
		                .useStoryLoader(new LoadFromClasspath(this.getClass()))
		                // Report in Console as Text format
		                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}

	// Specify the Steps (classes)
	@Override
	public List<CandidateSteps> candidateSteps() {
		// can incluse more than one Steps if required
		return new InstanceStepsFactory(configuration(), new TeamCreateSteps()).createCandidateSteps();
	}

}
