package com.icode.interview.designpattern.observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Unicorn
 * @create 2019-09-30 10:04
 */
public class ForcastConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData.Data) arg).temperature;
        this.pressure = ((WeatherData.Data) arg).pressure;
        this.humidity = ((WeatherData.Data) arg).humidity;
        display();
    }

    public void display() {
        System.out.println("**Tomorrow** temperature(℃): " + (temperature + 1));
        System.out.println("**Tomorrow** pressure(hPa): " + (pressure + 1));
        System.out.println("**Tomorrow** humidity(%RH): " + (humidity + 1));
    }
}
