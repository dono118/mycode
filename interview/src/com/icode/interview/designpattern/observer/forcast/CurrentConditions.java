package com.icode.interview.designpattern.observer.forcast;

/**
 * @author Unicorn
 * @create 2019-09-29 16:15
 */
public class CurrentConditions implements Observer {

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
        System.out.println("==Today== temperature(℃): " + temperature);
        System.out.println("==Today== pressure(hPa): " + pressure);
        System.out.println("==Today== humidity(%RH): " + humidity);
    }
}
