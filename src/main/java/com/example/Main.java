package com.example;

import com.example.observer_pattern.CurrentConditionDisplay;
import com.example.observer_pattern.WeatherData;
import com.example.strategy_pattern.Duck;
import com.example.strategy_pattern.FlyRocketPowered;
import com.example.strategy_pattern.MallardDuck;
import com.example.strategy_pattern.ModelDuck;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}