package edu.cpp.cs356;

import java.util.ArrayList;

public class Group extends Component {

    Group(String str, Group g) {
        setID(str);
        parent = g;
        children = new ArrayList<>();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}
