package edu.cpp.cs356;

import java.util.List;

public class Component implements Observable{

    private List<Observer> observers;

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
    
    

}
