/**
 * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood
 *
 * @parameter : message
 * @return : HAPPY or SAD
 *
 * @author: SAYANI KOLEY
 * @since: 30.06.3031
 */

package com.sayani.moodanalyzer;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
