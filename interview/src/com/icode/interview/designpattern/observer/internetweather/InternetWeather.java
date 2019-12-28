package com.icode.interview.designpattern.observer.internetweather;

/**
 * @author Unicorn
 * @create 2019-09-29 16:40
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentConditions currentConditions;
        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        weatherData = new WeatherData(currentConditions);

        weatherData.setData(30.8f, 1016.5f, 58.6f);
    }
}
