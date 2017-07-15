package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User extends Component {

    private Set<User> followings;
    private List<Tweet> tweets;

    User(String str, Group g) {
        setID(str);
        parent = g;
        followings = new HashSet<>();
        tweets = new ArrayList<>();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Set<User> getFollowings() {
        return followings;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public Tweet postTweet(String str) {
        Tweet t = new Tweet(str);
        tweets.add(t);
        return t;
    }

    public void follow(String str) {
        if (str.equals(this.getID())) {
            System.out.println("Please choose a valid user");
        }

        Group root = this.findRoot();
        User newFollowing = search(getID(), root);

        if (newFollowing == null) {
            System.out.println("Can't found user");
        } else {
            if (!this.followings.add(newFollowing)) {
                System.out.println("Following Alrady");
            }
        }
    }

    private User search(String str, Component c) {
        if (c instanceof User && c.getID().equals(str)) {
            return (User) c;
        }
        User node = null;
        if (!c.isLeaf()) {
            for (Component cpt : c.children) {
                if (node != null) {
                    break;
                }
                node = search(str, cpt);
            }
        }
        return node;
    }

}
