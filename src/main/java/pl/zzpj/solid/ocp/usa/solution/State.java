package pl.zzpj.solid.ocp.usa.solution;

public interface State {
    String getStateName();
    double calculateSpeedingTicket(int speed);
}
