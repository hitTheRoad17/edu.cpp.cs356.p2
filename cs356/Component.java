package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;

public class Component implements TreeNode{

    protected String name;
    protected Group parentComponent;
    protected List<Component> children;
    protected ArrayList<Observer> observers;
    
    public Component() {
        observers = new ArrayList<Observer>();
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return this.name;
    }
    
    public void insert(TreeNode child) {
        if (this.getAllowsChildren()) {
            this.children.add((Component) child);
        }
    }
    
    public Group getRoot() {
        Group parent = (Group) this.getParent();
        if (parent == null) {
            return (Group) this;
        }        
        return parent.getRoot();
    }    
    
    public static void traverseTree(Component c, Visitor v){
        c.accept(v);        
        if (!c.isLeaf()) {            
            for (Component tc : c.children) {
                traverseTree(tc, v);
            }
        }     
    }
    
    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) 
            o.update(this);
    }
    
       public void insert(TreeNode child, int index) {
        if (this.getAllowsChildren()) {
            this.children.add(index, (Component) child);
        }
    }

    public void remove(int index) {
        if (!this.isLeaf()) {
            this.children.remove(index);
        }
    }

    public void remove(TreeNode node) {
        if (!this.isLeaf()) {
            this.children.remove((Component) node);
        }
    }

    public void removeFromParent() {
        this.parentComponent.children.remove(this);
    }

    public void setParent(TreeNode newParent) {
        this.parentComponent = (Group) newParent;
    }

    public TreeNode getChildAt(int childIndex) {
        return this.isLeaf() ? null : this.children.get(childIndex);
    }

    public int getChildCount() {
        return this.isLeaf() ? 0 : this.children.size();
    }

}
