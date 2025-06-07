package com.dh.model.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private float temperarture;

    @Override
    public void registerObsever(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.temperarture);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public float getTemperarture() {
        return temperarture;
    }

    public void setTemperarture(float temperarture) {
        this.temperarture = temperarture;
        this.notifyObservers();
    }
}
