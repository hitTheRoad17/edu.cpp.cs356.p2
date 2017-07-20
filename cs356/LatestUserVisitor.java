package edu.cpp.cs356;

public class LatestUserVisitor implements Visitor {

    private Component user;
    private long latestTime;

    public Component getUser() {
        return user;
    }

    public void setUser(Component c) {
        user = c;
    }

    public long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(long l) {
        latestTime = l;
    }

    @Override
    public void visit(User u) {
        if (u.getCreationTime() > getLatestTime()) {
            setUser(u);
            setLatestTime(u.getCreationTime());
        }
    }

    @Override
    public void visit(Group g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
