package com.searching.learnings;

/**
 * Binary search is a fast search algorithm with run-time complexity of Ο(log
 * n).
 * 
 * This search algorithm works on the principle of divide and conquer.
 * 
 * For this algorithm to work properly, the data collection should be in the
 * sorted form.
 * 
 * Binary search looks for a particular item by comparing the middle most item
 * of the collection. If a match occurs, then the index of item is returned. If
 * the middle item is greater than the item, then the item is searched in the
 * sub-array to the left of the middle item. Otherwise, the item is searched for
 * in the sub-array to the right of the middle item. This process continues on
 * the sub-array as well until the size of the subarray reduces to zero.
 * 
 * midIndex = (lowerIndex + higherIndex) / 2;
 */
public class BinarySearchLearnings {

	static int binarySearch(int input[], int lowerIndex, int higherIndex, int key) {

		// Condition is important to break out of recursion.
		if (lowerIndex <= higherIndex) {
			int midIndex = (lowerIndex + higherIndex) / 2;
			if (input[midIndex] == key) {
				return midIndex;
			} else if (input[midIndex] > key) {
				// (midIndex - 1) make sure if condition works
				return binarySearch(input, lowerIndex, midIndex - 1, key);
			} else if (input[midIndex] < key) {
				return binarySearch(input, midIndex + 1, higherIndex, key);
			}
		}
		System.out.println("lowerIndex: " + lowerIndex);
		System.out.println("higherIndex: " + higherIndex);
		return -1;
	}

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 50, 55, 98, 101, 102, 105, 106, 107 };
		int keys[] = { 0, 10, 20, 30, 40, 50, 51, 55, 98, 101, 102, 105, 106, 110 };
		int last = input.length - 1;
		System.out.println("List size: " + input.length);
		System.out.println();
		for (int key : keys) {
			int index = binarySearch(input, 0, last, key);
			if (index == -1)
				System.out.println("Element is not found.");
			else
				System.out.println("Element is found at index: " + index);
			System.out.println();
		}
	}
}
