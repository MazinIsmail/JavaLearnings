package com.puzzle.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution using Memorization
 */
public class FibonacciNthNumber {
	public static void main(String[] args) {
		int nthPosition = 5;
		Map<Integer, Integer> lookupTable = new HashMap<>();
		int nthValue = fibonacciNthNumber(nthPosition, lookupTable);
		System.out.println("n'th Fibonacci number is " + nthValue);
	}

	// Function to find nth Fibonacci number
	public static int fibonacciNthNumber(int n, Map<Integer, Integer> lookup) {
		if (n <= 1) {
			return n;
		}

		Integer currentValue = lookup.get(n);
		if (currentValue == null) {
			// if sub-problem is seen for the first time
			int computedTree = fibonacciNthNumber(n - 1, lookup) + fibonacciNthNumber(n - 2, lookup);
			lookup.put(n, computedTree);
		}

		return lookup.get(n);
	}
}
