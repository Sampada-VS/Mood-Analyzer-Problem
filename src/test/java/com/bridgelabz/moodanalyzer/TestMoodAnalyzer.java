package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMoodAnalyzer {
	
	@Test
	public void givenMessage_whenInSadMood_thenReturnSad() {
		MoodAnalyzer moodanalyze= new MoodAnalyzer("I am in Sad mood");
		assertEquals("SAD",moodanalyze.analyseMood());
	}
	@Test
	public void givenMessage_whenInHappyMood_thenReturnHappy() {
		MoodAnalyzer moodanalyze= new MoodAnalyzer("I am in Any mood");
		assertEquals("HAPPY",moodanalyze.analyseMood());
	}

}
