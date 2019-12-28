package com.icode.interview.designpattern.observer.builtin;

/**
 * @author Unicorn
 * @create 2019-09-30 10:08
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();
        weatherData = new WeatherData();

        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);

        weatherData.setData(30, 102, 59);
        weatherData.deleteObserver(currentConditions);
        weatherData.setData(20, 101, 56);
    }
}
