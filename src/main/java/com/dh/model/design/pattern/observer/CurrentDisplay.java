package com.dh.model.design.pattern.observer;

public class CurrentDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("the current temperature is " + this.temperature);
    }
}
