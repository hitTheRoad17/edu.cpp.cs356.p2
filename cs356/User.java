package edu.cpp.cs356;

import java.util.List;

public class User {

    private String id;
    private List<User> followings;
    private List<Tweet> tweets;

    public List<User> getFollowings() {
        return followings;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

}
