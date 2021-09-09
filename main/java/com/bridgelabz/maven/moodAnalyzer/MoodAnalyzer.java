package com.bridgelabz.maven.moodAnalyzer;

/**
 * Hello world!
 *
 */
public class MoodAnalyzer
{
	String message;
	
	/**
	 * constructor with no parameter
	 */
	public MoodAnalyzer(){
		
	}
	
	/**
	 * constructor with parameter
	 * @param message
	 */
	public MoodAnalyzer(String message){
		this.message = message;
	}
	
	/**
	 * @method to check mood
	 * exception is handled if message is null
	 * @return either SAD or HAPPY
	 */
	public String analyseMood() throws MoodAnalysisException{
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("HAPPY");
		}
	}
}
