package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	public static String analyseMood (String message) {
		if (message.contains("sad"))
			return "SAD mood";
		else
			return "HAPPY mmod";
	}
public static void main(String[] args) {
	System.out.println(analyseMood("I am in mood"));
}
}
