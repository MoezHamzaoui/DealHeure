package com.dh.model.design.pattern.observer;

public interface Subject {
    void registerObsever(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
