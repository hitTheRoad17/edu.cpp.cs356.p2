package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;

public class User extends Component {

    private List<Tweet> tweets;

    public User(String str) {
        super(str);
        tweets = new ArrayList<>();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
