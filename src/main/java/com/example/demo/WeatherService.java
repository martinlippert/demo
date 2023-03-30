package com.example.demo;

import java.util.LinkedList;

public interface WeatherService {

    WeatherData getWeatherCondition();

    LinkedList<Object> getWeatherReport();
    
}
