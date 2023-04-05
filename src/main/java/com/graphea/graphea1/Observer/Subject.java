package com.graphea.graphea1.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void moveObservers();
    public void deleteObservers();
}