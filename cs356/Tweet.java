package edu.cpp.cs356;

public class Tweet {

    private String id;
    private String tweetMsg;

    private long timeCreated;

    public Tweet(String str1, String str2) {
        id = str1;
        tweetMsg = str2;
        timeCreated = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public String getTweetMsg() {
        return tweetMsg;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public boolean isPositive() {
        String[] positiveWords = {"nice", "great", "excellent",
            "awesome", "wonderful", "amazing", "positive"};

        for (String str : positiveWords) {
            if (tweetMsg.toLowerCase().contains(str)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Tweet{" + "id=" + id + ", tweetMsg=" + tweetMsg + ", timeCreated=" + timeCreated + '}';
    }

}
