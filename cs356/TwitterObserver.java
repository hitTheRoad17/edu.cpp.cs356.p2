package edu.cpp.cs356;

public class TwitterObserver implements Observer {

	private Observable user;

	public TwitterObserver(Observable oUser) {
		this.user = oUser;
		oUser.attach(this);
	}

	public void update(Component c) {
		this.user = c;
	}

}
