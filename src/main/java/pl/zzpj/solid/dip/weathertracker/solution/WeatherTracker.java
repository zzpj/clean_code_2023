package pl.zzpj.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    Device device;

    public WeatherTracker(Device device) {
        this.device = device;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        System.out.println(device.generateWeatherAlert(currentConditions));
    }
}
