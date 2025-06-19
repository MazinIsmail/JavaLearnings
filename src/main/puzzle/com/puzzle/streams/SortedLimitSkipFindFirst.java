package com.puzzle.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedLimitSkipFindFirst {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(45, 12, 56, 15, 24, 75, 31, 89, 98, 12, 56);

		// Get the three minimum numbers
		List<Integer> threeMinNumbers = numbers.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println("Three minimum numbers: " + threeMinNumbers);

		// Get the three maximum numbers
		List<Integer> threeMaxNumbers = numbers.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Three maximum numbers: " + threeMaxNumbers);

		// Find second largest number
		Optional<Integer> secondLargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second Largest: " + (secondLargest.isPresent() ? secondLargest.get() : "None"));

	}

}
