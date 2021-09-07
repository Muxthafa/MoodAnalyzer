package com.bridgelabz.maven.moodAnalyzer;

/**
 * Hello world!
 *
 */
public class MoodAnalyzer
{
	public String analyseMood(String message) {
		if(message.contains(("sad"))){
			return "SAD";
		}else {
			return "HAPPY";
		}
	}
}
