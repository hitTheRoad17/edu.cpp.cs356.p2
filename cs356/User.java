package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User extends Component {

    private List<Tweet> tweets;
    private Set<User> followings;
    private long lastUpdateTime;

    public User(String str) {
        super(str);
        tweets = new ArrayList<>();
        lastUpdateTime = System.currentTimeMillis();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public Set<User> getFollowings() {
        return followings;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void follow(String str) {

    }

    public Tweet postTweet(String str) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
