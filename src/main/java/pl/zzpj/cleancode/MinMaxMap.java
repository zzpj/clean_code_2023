package pl.zzpj.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MinMaxMap {

	private final Map<Integer, Integer> map = new HashMap<>();
	private int minValue = Integer.MIN_VALUE;
	private int maxValue = Integer.MAX_VALUE;
	
	public MinMaxMap(List<Integer> numbers) {
		putNumbersInMap(numbers);
	}
	
	public MinMaxMap() {}
	
	public void putNumbersInMap(List<Integer> numbers) {
		for (Integer number : numbers)
			putNumberInMap(number);
	}
	
	public void putNumberInMap(Integer number) {
		if (map.containsKey(number))
			map.put(number, map.get(number) + 1);
		else
			map.put(number, 1);

		if (number > minValue)
			minValue = number;

		if (number < maxValue)
			maxValue = number;
	}
	
	public int getMapValue(int i) {
		return map.getOrDefault(i, 0);
	}
	
	public double getWeightedAvg() {
		double weightedValues = 0;
		double weightsSum = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			weightedValues += entry.getKey() * entry.getValue();
			weightsSum += entry.getValue();
		}
		return weightedValues / weightsSum;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
}