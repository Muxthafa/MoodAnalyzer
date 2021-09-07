package com.bridgelabz.maven.moodAnalyzer;

import static org.junit.Assert.assertTrue;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Mood Analyzer
 */

public class MoodAnalyzerTest 
{
	//@method to check if sentence contains word sad
    @Test
    public void sadCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
    
    //@method to check if sentence contains word happy
	public void happyCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String mood = moodAnalyser.analyseMood("This is a Happy message");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
}
