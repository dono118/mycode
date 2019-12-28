package com.icode.interview.designpattern.observer.forcast;

/**
 * @author Unicorn
 * @create 2019-09-29 16:15
 */
public class ForcastConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("**Tomorrow** temperature(℃): " + (temperature + Math.random()));
        System.out.println("**Tomorrow** pressure(hPa): " + (pressure + Math.random()));
        System.out.println("**Tomorrow** humidity(%RH): " + (humidity + Math.random()));
    }
}
