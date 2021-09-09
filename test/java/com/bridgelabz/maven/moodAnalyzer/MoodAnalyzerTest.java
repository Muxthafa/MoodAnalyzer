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
	 * @method to test if sentence contains word sad
	 */
    @Test
    public void sadCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood");			// MoodAnalyzer object creation
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertThat(mood, CoreMatchers.is("SAD"));
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		
	}
    
    /**
     * @method to test if sentence contains word happy
     */
    @Test
	public void happyCheck() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in happy mood");			// MoodAnalyzer object creation
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    /**
     * @method to expect happy when null is passed
     */
    @Test
	public void givenNullMoodShouldHandleException()  {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		try {
			moodAnalyser.analyseMood();
			
		} catch (MoodAnalysisException e) {
			Assert.assertEquals("HAPPY", e.getMessage());
		}
	}
}
