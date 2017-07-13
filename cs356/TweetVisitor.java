package edu.cpp.cs356;

import java.util.ArrayList;

public class TweetVisitor implements Visitor {

	private int totalTweets;
	private int positiveTweets;

	public int getTotalTweets() {
		return totalTweets;
	}

	public int calculatePencentage() throws IllegalArgumentException {
		if (totalTweets == 0) {
			throw new IllegalArgumentException("Field 'tweets' is 0");
		}
		return (int) Math.ceil(((double) positiveTweets / totalTweets) * 100);
	}

	public void visit(User u) {
		ArrayList<Tweet> userTweets = u.getTweets();
		totalTweets += userTweets.size();

		for (Tweet t : userTweets) {
			if (t.isPositive()) {
				this.positiveTweets++;
			}
		}
	}

	public void visit(Group g) {

	}

}
