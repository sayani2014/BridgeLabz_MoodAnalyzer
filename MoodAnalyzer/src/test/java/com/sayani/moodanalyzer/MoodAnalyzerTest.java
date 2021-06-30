package com.sayani.moodanalyzer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    /**
     * Purpose : analyse mood
     * Input message: This is a sad message
     * @return : SAD
     */

    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Purpose : analyse mood
     * Input message: This is a happy message
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("This is a happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
