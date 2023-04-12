package pl.zzpj.solid.ocp.usa.solution;

public interface State {
    String getStateCode();
    int getMaxSpeed();
    double calculateSpeedLimitFine(int speed);
}
