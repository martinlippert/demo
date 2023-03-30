package com.example.demo;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping(value="/weather")
    public String getWeather() {
        return service.getWeatherCondition().toString();
    }

    @GetMapping(value="/weatherReport")
    public LinkedList<Object> getWeatherReport() {
        return service.getWeatherReport();
    }
    
}
