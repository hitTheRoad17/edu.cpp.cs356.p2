package edu.cpp.cs356;

public class Group {
	
	

	public void accept(Visitor v){
		v.visit(this);
	}
	
}
