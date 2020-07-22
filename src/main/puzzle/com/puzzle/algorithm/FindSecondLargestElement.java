package com.puzzle.algorithm;

/**
 * Find Second largest element in an array
 * 
 * Input: arr[] = {12, 35, 1, 10, 34, 1} Output: The second largest element is
 * 34.
 * 
 * Explanation: The largest element of the array is 35 and the second largest
 * element is 34
 * 
 * Input: arr[] = {10, 5, 10} Output: The second largest element is 5.
 * 
 * Explanation: The largest element of the array is 10 and the second largest
 * element is 5
 * 
 * Time Complexity: O(n). Only one traversal of the array is needed.
 * 
 * Auxiliary Space: O(1). As no extra space is required.
 */
public class FindSecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1, 34, 12, 35 };
		int n = arr.length;
		print2largest(arr, n);
	}

	public static void print2largest(int arr[], int arrSize) {
		int firstLargest, secondLargest;
		if (arrSize < 2) {
			System.out.print("Invalid Input: There should be atleast two elements.");
			return;
		}
		firstLargest = secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arrSize; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < firstLargest)
				secondLargest = arr[i];
		}

		if (secondLargest == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + secondLargest);
	}

}
