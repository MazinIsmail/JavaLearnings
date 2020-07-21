package com.puzzle.algorithm;

/**
 * Print all possible consecutive numbers with sum N
 * 
 * Input: N = 100
 * 
 * Output: 9 10 11 12 13 14 15 16 18 19 20 21 22
 * 
 * Input: N = 125
 * 
 * Output: 8 9 10 11 12 13 14 15 16 17 23 24 25 26 27 62 63
 * 
 * Time Complexity: O(N).
 */

public class PrintAllPossibleConsecutiveNumbersWithSumN {

	public static void main(String[] args) {
		int N = 125;
		findConsecutive(N);
	}

	public static void findConsecutive(int N) {
		/*
		 * We don't ever have to sum numbers > ceil(N/2)
		 */
		int start = 1;
		int end = (N + 1) / 2;
		for (start = 0; start < end; start++) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum = sum + i;
				if (sum == N) {
					for (int j = start; j <= i; j++)
						System.out.print(j + " ");
					System.out.println();
					break;
				}
				if (sum > N)
					break;
			}
		}
	}

}
