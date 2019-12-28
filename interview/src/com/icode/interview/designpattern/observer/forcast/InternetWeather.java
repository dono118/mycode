package com.icode.interview.designpattern.observer.forcast;

/**
 * @author Unicorn
 * @create 2019-09-29 22:37
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherDataSt weatherDataSt;

        weatherDataSt = new WeatherDataSt();
        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();

        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);

        weatherDataSt.setData(30, 102, 59);
        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setData(20, 101, 56);
    }
}
