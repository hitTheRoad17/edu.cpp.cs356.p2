package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.tree.DefaultMutableTreeNode;

public abstract class Component implements Visitable, Observable, Observer {

    private DefaultMutableTreeNode node;

    private String id;
    private long creationTime;

    private List<Observable> subjects;
    private List<Observer> observers;

    Component(String str) {
        node = null;

        id = str;
        creationTime = System.currentTimeMillis();

        subjects = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public DefaultMutableTreeNode getNode() {
        return node;
    }

    public void setNode(DefaultMutableTreeNode dmtn) {
        node = dmtn;
    }

    public String getId() {
        return id;
    }

    public void setId(String str) {
        id = str;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public List<Observable> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Observable> ol) {
        subjects = ol;
    }

    public void addSubjects(Observable o) {
        getSubjects().add(o);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            getObservers().add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        getObservers().remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : getObservers()) {
            o.update(this);
        }
    }

    public boolean containObserver(Observer o) {
        return observers.contains(o);
    }

    @Override
    public void update(Observable o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Component{" + "id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Component other = (Component) obj;
        return true;
    }

    @Override
    public abstract void accept(Visitor v);

}
