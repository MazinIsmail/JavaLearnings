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

		// if sub-problem is seen for the first time
		int computedTree = fibonacciNthNumber(n - 1, lookup) + fibonacciNthNumber(n - 2, lookup);

		/**
		 * If the specified key is not already associated with a value (or is mapped to
		 * null), associates it with the given value and returns null, else returns the
		 * current value. Implementation Requirements:The default implementation is
		 * equivalent to, for this map:
		 * 
		 * V v = map.get(key); if (v == null) v = map.put(key, value); return v;
		 */
		Integer currentValue = lookup.putIfAbsent(n, computedTree);

		return lookup.get(n);
	}
}
