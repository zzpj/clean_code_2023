package pl.zzpj.solid.ocp.usa.solution;

import java.util.ArrayList;
import java.util.List;

public class USASpeedLimitFines {
    private List<State> states = new ArrayList<>();

    public USASpeedLimitFines() {}
    public USASpeedLimitFines(List<State> states) {
        this.states = states;
    }

    public void addState(State state) {
        states.add(state);
    }

    public double getSpeedingTicketFine(String stateName, int speed) {
        return states.stream()
                .filter(state -> state.getStateName().equals(stateName))
                .findFirst().map(state -> state.calculateSpeedingTicket(speed)).orElse(0d);
    }

}
