package at.mschreiber.adventofcode.day1;

public class Day1Exercise1 {

	public static void main(String args[]) {
		int sum = 0;
		int maxSum = 0;
		for (String single : Input.splitedInput()) {
			if (single == null || single.isBlank() || single.isEmpty()) {
				if (sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
			} else {
				int x = Integer.parseInt(single);
				sum = sum + x;
			}
		}
		System.out.println(">>" + maxSum);
	}

}
