package com.icode.interview.designpattern.observer.builtin;

import java.util.Observable;

/**
 * @author Unicorn
 * @create 2019-09-30 9:12
 */
public class WeatherData extends Observable {

    private float temperature;
    private float pressure;
    private float humidity;

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
        this.setChanged();
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public class Data {
        public float temperature;
        public float pressure;
        public float humidity;

        public Data(float temperature, float pressure, float humidity) {
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }
    }
}
