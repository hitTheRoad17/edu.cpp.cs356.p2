package edu.cpp.cs356;

import java.util.List;

public class TweetVisitor implements Visitor {

    private int totalTweets;
    private int positiveTweets;

    public int getTotalTweets() {
        return totalTweets;
    }

    public double calcPercentage() {
        if (totalTweets == 0) {
            return 0;
        }

        return (double) positiveTweets / totalTweets;
    }

    public void visit(User u) {
        List<Tweet> tweets = u.getTweets();
        totalTweets += tweets.size();

        for (Tweet t : tweets) {
            if (t.isPositive()) {
                positiveTweets++;
            }
        }
    }

}
