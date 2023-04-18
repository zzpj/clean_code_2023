package pl.zzpj.solid.dip.weathertracker.solution;


import java.util.Objects;

public class WeatherTracker {
    String currentConditions;
    Tracker phone;
    Tracker emailer;

    public WeatherTracker(Tracker phoneTracker, Tracker emailTracker) {
        phone = phoneTracker;
        emailer = emailTracker;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (Objects.equals(weatherDescription, "rainy")) {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (Objects.equals(weatherDescription, "sunny")) {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
