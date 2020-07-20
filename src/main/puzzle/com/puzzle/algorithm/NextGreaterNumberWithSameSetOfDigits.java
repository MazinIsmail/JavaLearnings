package com.puzzle.algorithm;

import java.util.Arrays;

/**
 * Given a number n, find the smallest number that has same set of digits as n
 * and is greater than n. If n is the greatest possible number with its set of
 * digits, then print “not possible”.
 * 
 * Input: n = "218765" Output: "251678"
 * 
 * Input: n = "1234" Output: "1243"
 * 
 * Input: n = "4321" Output: "Not Possible"
 * 
 * Input: n = "534976" Output: "536479"
 */
public class NextGreaterNumberWithSameSetOfDigits {

	public static void main(String[] args) {
		String digits = "534976543";
		findNext(digits.toCharArray());
	}

	static void findNext(char ar[]) {
		int n = ar.length;
		int i;
		/*
		 * Start from the right most digit and find the first digit that is smaller than
		 * the digit next to it.
		 */
		for (i = n - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				break;
			}
		}

		/*
		 * If no such digit is found, then all digits are in descending order means
		 * there cannot be a greater number with same set of digits
		 */
		if (i == 0) {
			System.out.println("Not possible");
		} else {
			char x = ar[i - 1];
			int min = i;

			/*
			 * Find the smallest digit on right side of (i-1)'th digit that is greater than
			 * number[i-1]
			 */
			for (int j = i + 1; j < n; j++) {
				if (ar[j] > x && ar[j] < ar[min]) {
					min = j;
				}
			}

			/*
			 * Swap the above found smallest digit with number[i-1]
			 */
			swap(ar, i - 1, min);

			/*
			 * Sort the digits after (i-1) in ascending order
			 */
			Arrays.sort(ar, i, n);
			System.out.print("Next number with same" + " set of digits is ");
			for (i = 0; i < n; i++)
				System.out.print(ar[i]);
		}
	}

	// Utility function to swap two digit
	static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
