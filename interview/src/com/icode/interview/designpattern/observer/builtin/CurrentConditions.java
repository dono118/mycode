package com.icode.interview.designpattern.observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Unicorn
 * @create 2019-09-30 9:54
 */
public class CurrentConditions implements Observer {

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
        System.out.println("==Today== temperature(℃): " + temperature);
        System.out.println("==Today== pressure(hPa): " + pressure);
        System.out.println("==Today== humidity(%RH): " + humidity);
    }
}
