package pl.zzpj.solid.dip.weathertracker.solution;


public class Emailer implements Device {
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
