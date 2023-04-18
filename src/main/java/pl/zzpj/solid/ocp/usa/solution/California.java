package pl.zzpj.solid.ocp.usa.solution;

public class California implements State {

    private final int maxSpeed = 50;

    @Override
    public String getStateName() {
        return "California";
    }

    @Override
    public double calculateSpeedingTicket(int speed) {
        return speed > maxSpeed ? (speed - maxSpeed) * 10 : 0d;
    }
}
