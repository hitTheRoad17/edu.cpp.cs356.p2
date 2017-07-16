package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public abstract class Component implements Observable, Visitable, MutableTreeNode {

    private List<Observer> observers;
    private String id;

    protected List<Component> children;
    protected Group parent;

    Component() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public String getID() {
        return id;
    }

    public void setID(String str) {
        id = str;
    }

    public Group findRoot() {
        Group parent = (Group) this.getParent();
        if (parent != null) {
            return parent.findRoot();
        }
        return (Group) this;
    }

    @Override
    public void insert(MutableTreeNode child, int index) {
        if (this.getAllowsChildren()) {
            this.children.add(index, (Group) child);
        }
    }

    @Override
    public void remove(int index) {
        if (!this.isLeaf()) {
            this.children.remove(index);
        }
    }

    @Override
    public void remove(MutableTreeNode node) {
        if (!this.isLeaf()) {
            this.children.remove((Group) node);
        }
    }

    @Override
    public void setUserObject(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeFromParent() {
        this.parent.children.remove(this);
    }

    @Override
    public void setParent(MutableTreeNode newParent) {
        this.parent = (Group) newParent;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return this.isLeaf() ? null : this.children.get(childIndex);
    }

    @Override
    public int getChildCount() {
        return this.isLeaf() ? 0 : this.children.size();
    }

    @Override
    public TreeNode getParent() {
        return this.parent;
    }

    @Override
    public int getIndex(TreeNode node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean getAllowsChildren() {
        return !(this instanceof User);
    }

    @Override
    public boolean isLeaf() {
        return this.children == null;
    }

    @Override
    public Enumeration children() {
        return this.isLeaf() ? null : (Enumeration) this.children;
    }
    
}
