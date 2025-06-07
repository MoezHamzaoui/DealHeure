package com.dh.model.design.pattern.observer;

public class StatisticDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println(" the statistic is " + this.temperature + " c");
    }
}
