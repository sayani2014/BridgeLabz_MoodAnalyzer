/**
 * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood
 * Design : Refractor the code with default and parameterized constructor to accept message
 *          analyseMood() will change to support no parameters and use message field defined for the Class
 *
 * @parameter : message
 * @return : HAPPY or SAD
 *
 * @author: SAYANI KOLEY
 * @since: 30.06.3031
 */

package com.sayani.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    //Default Constructor
    public MoodAnalyzer() {
    }

    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
