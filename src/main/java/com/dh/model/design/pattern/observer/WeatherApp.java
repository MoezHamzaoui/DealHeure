package com.dh.model.design.pattern.observer;

public class WeatherApp {
    public static void main (String [] args) {
        WeatherStation ws = new WeatherStation();
        CurrentDisplay currentDisplay = new CurrentDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ws.registerObsever(currentDisplay);
        ws.registerObsever(statisticDisplay);
        ws.setTemperarture(30.0f);
        ws.setTemperarture(40.0f);
        ws.setTemperarture(70.9f);
    }
}
