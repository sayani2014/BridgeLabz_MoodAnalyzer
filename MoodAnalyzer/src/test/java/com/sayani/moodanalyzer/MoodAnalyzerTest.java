package com.sayani.moodanalyzer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    /**
     * Purpose : Analyse mood by passing the message in the constructor
     * Input message: This is a sad message
     * @return : SAD
     */

    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Purpose : Analyse mood by passing the message in the constructor
     * Input message: This is a happy message
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    /**
     * Purpose : Handle Exception if User Provides Invalid Mood
     * Input message: null
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsNull() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY" , mood);
    }

}
