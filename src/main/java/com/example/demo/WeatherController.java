package com.example.demo;

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
    
}
