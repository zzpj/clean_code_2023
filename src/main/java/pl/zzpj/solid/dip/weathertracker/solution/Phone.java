package pl.zzpj.solid.dip.weathertracker.solution;

public class Phone implements Device {
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
