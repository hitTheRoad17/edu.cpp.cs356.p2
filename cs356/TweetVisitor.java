package edu.cpp.cs356;

import java.util.List;

public class TweetVisitor implements Visitor {

    private int totalTweets;
    private int positiveTweets;

    public int getTotalTweets() {
        return totalTweets;
    }

    public double calcPercentage() {
        return (double) positiveTweets / totalTweets;
    }

    @Override
    public void visit(User u) {
        List<Tweet> tl = u.getTweets();
        totalTweets += tl.size();
        for (Tweet t : tl) {
            if (t.isPositive()) {
                positiveTweets++;
            }
        }
    }

    @Override
    public void visit(Group g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
