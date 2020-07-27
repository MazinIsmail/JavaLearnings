package com.puzzle.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of longest continuous increasing subsequence.
 * 
 * Input : arr[] = {5, 7, 6, 7, 8}
 * 
 * Output : Size of LIS = 4 LIS = 5, 6, 7, 8
 * 
 * Input : arr[] = {5, 7, 8, 7, 5}
 * 
 * Output : Size of LIS = 2 LIS = 7, 8
 */
public class LargestIncreasingSubsequenceOfConsecutiveIntegers {

	public static void main(String[] args) {
		int A[] = { 2, 5, 3, 7, 4, 8, 5, 13, 6 };
		int n = A.length;
		findLIS(A, n);
	}

	public static void findLIS(int A[], int n) {
		Map<Integer, Integer> hash = new HashMap<Integer, Integer>();

		// Initialize result
		hash.put(A[0], 1);
		int LIS_size = 1;
		int LIS_index = 0;

		// iterate through array and find
		// end index of LIS and its Size
		for (int i = 1; i < n; i++) {
			int currentValue = A[i];
			Integer hashPreviousValueCount = hash.get(currentValue - 1);
			if (hashPreviousValueCount == null) {
				hash.put(currentValue, 1);
			} else {
				hash.put(currentValue, hashPreviousValueCount + 1);
			}
			Integer hashCurrentValueCount = hash.get(currentValue);
			if (LIS_size < hashCurrentValueCount) {
				LIS_size = hashCurrentValueCount;
				LIS_index = currentValue;
			}
		}

		// print LIS size
		System.out.println("LIS_size = " + LIS_size);

		// print LIS after setting start element
		System.out.print("LIS : ");
		int start = LIS_index - LIS_size + 1;
		while (start <= LIS_index) {
			System.out.print(start + " ");
			start++;
		}
	}

}
