package pl.zzpj.solid.ocp.usa.solution;

import java.util.List;

public class USASpeedLimitFines {
    protected final List<State> states;

    public USASpeedLimitFines(List<State> states) {
        this.states = states;
    }
    public double calculateSpeedLimitFine(String stateCode, int speed) {
        return states.stream()
                .filter(state -> state.getStateCode().equals(stateCode))
                .findFirst()
                .filter(state -> speed > state.getMaxSpeed())
                .map(state -> state.calculateSpeedLimitFine(speed))
                .orElse(0.0);
    }

}
