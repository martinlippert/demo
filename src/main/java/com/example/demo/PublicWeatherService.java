package com.example.demo;

import java.util.LinkedList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PublicWeatherService implements WeatherService {

    private LinkedList<Object> historicalWeatherData = new LinkedList<>();
    private String[] weatherOptions = new String[] {"sunny", "rainy", "foggy", "snowy"};

    @Override
    public WeatherData getWeatherCondition() {
        String time = Long.toString(System.currentTimeMillis());
        String weather = weatherOptions[new Random().nextInt(4)];

        WeatherData data = new WeatherData(weather, time);
        keepHistoricalData(data);

        return data;
    }

    private void keepHistoricalData(WeatherData data) {
        historicalWeatherData.add(data);

        if (historicalWeatherData.size() > 1000) {
            historicalWeatherData.remove(0);
        }
    }
    
}
