package edu.cpp.cs356;

public interface Observable {

    void attach(Observer o);

    void detach(Observer o);

    void notifyObserver();

}
