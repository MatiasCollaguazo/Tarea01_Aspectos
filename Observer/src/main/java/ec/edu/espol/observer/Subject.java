package ec.edu.espol.observer;

import java.util.Vector;

interface Subject {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    Vector<?> getObservers();
    Object getData();
}