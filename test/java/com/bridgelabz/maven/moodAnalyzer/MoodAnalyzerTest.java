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
	/**
	 * @method to check if sentence contains word sad
	 */
    @Test
    public void sadCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood");			// MoodAnalyzer object creation
		String mood = moodAnalyser.analyseMood();									//call to analyseMood function
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
    
    /**
     * @method to check if sentence contains word happy
     */
    @Test
	public void happyCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in happy mood");			// MoodAnalyzer object creation
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
}
