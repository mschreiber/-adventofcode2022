package at.mschreiber.adventofcode.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1Exercise2 {

	public static void main(String args[]) {
		int sum = 0;
		int maxSum = 0;
		List<Integer> maximums = new ArrayList<>();
		for (String single : Input.splitedInput()) {
			if (single == null || single.isBlank() || single.isEmpty()) {
				if (sum > maxSum) {
					maxSum = sum;
				}
				maximums.add(sum);
				sum = 0;
			} else {
			int x = Integer.parseInt(single);
			sum = sum + x;
			}
		}
		Collections.sort(maximums);
		int result = maximums.subList(maximums.size() - 3, maximums.size()).stream().reduce(0, Integer::sum);
		System.out.println(">>>" + result);
	}
	
}
