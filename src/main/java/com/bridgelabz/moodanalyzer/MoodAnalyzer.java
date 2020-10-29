package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;

	public MoodAnalyzer(String message) {
		this.message=message;
	}

	public String analyseMood () throws MoodAnalysisException {
		try {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Please enter valid mood");
		}

	}

}
