package com.puzzle.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCounter {

	public static void main(String[] args) {
		maxFrequencyNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		maxFrequencyNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 });
		maxFrequencyNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11 });
		maxFrequencyNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 12 });
		maxFrequencyNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 12, 12 });
	}

	private static void maxFrequencyNumber(int[] numbers) {

		Map<Integer, Integer> mapListCounts = new HashMap<>();
		int maxFeq = 0;

		// Single pass to populate map and find max frequency
		for (int num : numbers) {
			int currentCount = mapListCounts.getOrDefault(num, 0) + 1;
			mapListCounts.put(num, currentCount);
			if (currentCount > maxFeq) {
				maxFeq = currentCount;
			}
		}

		System.out.println("Numbers with the highest frequency:");
		// A single pass to print the results
		for (Entry<Integer, Integer> entry : mapListCounts.entrySet()) {
			if (entry.getValue() == maxFeq) {
				System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			}
		}
	}

}
