package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMoodAnalyzer {
	static  MoodAnalyzer moodanalyze;

	@BeforeClass
	public static void createObj() {
		moodanalyze = new MoodAnalyzer();
	}

	@AfterClass
	public static void nullObj() {
		moodanalyze = null;
	}
	
	@Test
	public void givenMessage_whenInSadMood_thenReturnSad() {
		assertEquals("SAD",moodanalyze.analyseMood("I am in Sad mood"));
	}
	@Test
	public void givenMessage_whenInHappyMood_thenReturnHappy() {
		assertEquals("HAPPY",moodanalyze.analyseMood("I am in Any mood"));
	}

}
