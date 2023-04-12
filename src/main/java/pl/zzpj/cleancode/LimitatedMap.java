package pl.zzpj.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LimitatedMap {

    private final Map<Integer, Integer> map = new HashMap<>();
    private int minValue = Integer.MIN_VALUE;
    private int maxValue = Integer.MAX_VALUE;

    public LimitatedMap(List<Integer> i1) {
        addNumberToMap(i1);
    }

    public LimitatedMap() {
    }

    public void addNumberToMap(List<Integer> list) {
        list.forEach(this::addNumberToMap);
    }

    public void addNumberToMap(Integer integer) {
        if (map.containsKey(integer)) {
            map.put(integer, map.get(integer) + 1);
        } else {
            map.putIfAbsent(1, 1);
        }

        if (integer > minValue) {
            minValue = integer;
        }

        if (integer < maxValue) {
            maxValue = integer;
        }
    }

    public int getMapValue(int i) {
		return map.getOrDefault(i, 0);
    }

    public double getWeightedAverage() {
        double sum = 0;
        double weightsSum = 0;
        for (Entry<Integer, Integer> u : map.entrySet()) {
            weightsSum += u.getValue();
            sum += u.getKey() * u.getValue();
        }
        if (weightsSum == 0) {
            return 0;
        }
        return sum / weightsSum;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}