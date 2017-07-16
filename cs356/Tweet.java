package edu.cpp.cs356;

public class Tweet {

    private String tweetMsg;

    Tweet(String str) {
        tweetMsg = str;
        isPositive();
    }
    
    public String getTweetMsg() {
        return tweetMsg;
    }

    public boolean isPositive() {
        String[] positiveWords = {"nice", "great", "excellent",
            "awesome", "wonderful", "amazing", "positive"};

        for (String word : positiveWords) {
            if (tweetMsg.toLowerCase().contains(word)) {
                return true;
            }
        }

        return false;
    }
    
}
