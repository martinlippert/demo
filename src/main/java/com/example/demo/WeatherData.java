package com.example.demo;

public class WeatherData {

    private String weatherCondition;
    private String time;
    private byte[] worldwideMapData;

    public WeatherData(String weather, String time) {
        this.weatherCondition = weather;
        this.time = time;
        this.worldwideMapData = new byte[10000000];
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public String getTime() {
        return time;
    }

    public byte[] getWorldwideMapData() {
        return worldwideMapData;
    }

    @Override
    public String toString() {
        return weatherCondition + " - at: " + time;
    }

}
