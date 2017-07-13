package edu.cpp.cs356;

public class Group implements Component{
	
	

	public void accept(Visitor v){
		v.visit(this);
	}
	
}
