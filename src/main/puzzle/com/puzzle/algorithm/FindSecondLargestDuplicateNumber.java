package com.puzzle.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FindSecondLargestDuplicateNumber {

	public static void main(String[] args) {
		int intputArray[] = { 10, 2, 5, 3, 7, 4, 8, 5, 13, 6, 2, 11, 10 };
		findSecondLargestDuplicateNumber(intputArray);
	}

	private static void findSecondLargestDuplicateNumber(int[] intputArray) {
		int arrayLength = intputArray.length;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
		for (int i = 0; i < arrayLength; i++) {
			Integer currentNumber = intputArray[i];
			Integer currentNumberCount = numCount.get(intputArray[i]);
			if (currentNumberCount == null) {
				numCount.put(intputArray[i], 1);
			} else {
				numCount.put(intputArray[i], currentNumberCount + 1);
			}
			currentNumberCount = numCount.get(intputArray[i]);
			if (largest < currentNumber) {
				if (currentNumberCount > 1) {
					secondLargest = largest;
				}
				largest = currentNumber;
			} else if (currentNumber > secondLargest && currentNumber < largest) {
				if (currentNumberCount > 1) {
					secondLargest = currentNumber;
				}
			}
		}

		System.out.println("Largest: " + largest);
		System.out.println("Second largest that is duplicate: " + secondLargest);

	}

}
