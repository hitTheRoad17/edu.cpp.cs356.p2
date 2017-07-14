package edu.cpp.cs356;

public class Tweet {

    private String tweetMessage;

    Tweet(String str) {
        tweetMessage = str;
        isPositive();
    }

    public boolean isPositive() {
        String[] positiveWords = {"nice", "great", "excellent",
            "awesome", "wonderful", "amazing", "positive"};

        for (String word : positiveWords) {
            if (tweetMessage.toLowerCase().contains(word)) {
                return true;
            }
        }

        return false;
    }
    
}
