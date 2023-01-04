package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LoadCreator {

    @Autowired
    private WeatherController controller;

    @Scheduled(fixedRate = 1000)
    public void createLoad() {

        String result = this.controller.getWeather();
        System.out.println(result);
    }
    
}
