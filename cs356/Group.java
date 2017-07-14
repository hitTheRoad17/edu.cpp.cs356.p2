package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String id;
    private Group parent;
    private List<Group> children;

    Group(String str, Group g) {
        id = str;
        parent = g;
        children = new ArrayList<>();
    }

}
