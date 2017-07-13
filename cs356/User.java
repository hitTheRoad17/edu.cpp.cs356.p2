package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements Visitable {

	private String ID;
	private Group parent;
	private Set<User> following;
	private List<Tweet> tweets;

	User(String str, Group g) {
		ID = str;
		parent = g;
		following = new HashSet<>();
		tweets = new ArrayList<>();
	}
	
	public String getID() {
		return ID;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public List<User> getFollowing() {
		return new ArrayList<User>(this.following);
	}

	public void followUser(String str) throws Exception {
		if (str.equals(this.ID)) {
			throw new UnsupportedOperationException("Can't follow yourself");
		}

		Group root = this.getRoot();
		User u = searchForUser(str, root);

		if (u != null) {
			if (this.following.add(u)) {
				System.out.println(this.ID + " just followed " + u.getID());
			} else {
				throw new UnsupportedOperationException(this.ID + " is already following " + u.getID());
			}
		} else {
			throw new UnsupportedOperationException("Can't find user ID");
		}
	}

}
