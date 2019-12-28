package com.icode.interview.designpattern.observer.forcast;

import java.util.ArrayList;

/**
 * @author Unicorn
 * @create 2019-09-29 16:14
 */
public class WeatherDataSt implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherDataSt() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0, len = observers.size(); i < len; i++) {
            observers.get(i).update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
