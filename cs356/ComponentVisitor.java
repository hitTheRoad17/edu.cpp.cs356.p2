package edu.cpp.cs356;

public class ComponentVisitor implements Visitor {

    private int totalUsers;
    private int totalGroups;

    public int getTotalUsers() {
        return totalUsers;

    }

    public int getTotalGroups() {
        return totalGroups;
    }

    public void visit(User u) {
        totalUsers++;
    }

    public void visit(Group g) {
        totalGroups++;
    }

}
