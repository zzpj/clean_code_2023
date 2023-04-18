package pl.zzpj.solid.dip.weathertracker.solution;


public class Emailer implements Tracker {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
