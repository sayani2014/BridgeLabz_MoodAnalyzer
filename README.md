# BridgeLabz_MoodAnalyzer

## Usecases
1. Given a Message, ability to analyse and respond Happy or Sad Mood
    TC 1.1 : Given “I am in Sad Mood” message Should Return SAD
    TC 1.2 : Given “I am in Any Mood” message Should Return HAPPY
Refractor. Refractor the code to take the mood message in the constructor
    TC 1.1 : Given “I am in Sad Mood” message Should Return SAD
    TC 1.2 : Given “I am in Any Mood” message Should Return HAPPY
2. Handle Exception if User Provides Invalid Mood like NULL
    TC 2.1 : Given Null Mood Should Return Happy
3. Inform user if entered Invalid Mood is NULL or Empty. Create Customized Exception. Use Enum to store type EMPTY or NULL.
    TC 3.1 : Given NULL Mood Should Throw MoodAnalysisException indicating Null Mood
    TC 3.2 : Given Empty Mood Should Throw MoodAnalysisException indicating Empty Mood
