package pl.zzpj.solid.dip.weathertracker.solution;

public class Phone implements Tracker{

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
