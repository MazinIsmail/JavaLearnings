package com.sorting.learnings;

/**
 * Bubble Sort Algorithm
 * 
 * Bubble sort is a simple sorting algorithm. This sorting algorithm is
 * comparison-based algorithm in which each pair of adjacent elements is
 * compared and the elements are swapped if they are not in order. This
 * algorithm is not suitable for large data sets as its average and worst case
 * complexity are of Ο(n2) where n is the number of items.
 */
public class BubbleSortAlgorithm {

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			/*
			 * After every iteration the highest values settles down at the end of the
			 * array. Hence, the next iteration need not include already sorted elements.
			 * For this purpose, in our implementation, we restrict the inner loop to avoid
			 * already sorted values.
			 */
			for (int j = 0; j < n - i - 1; j++)
				/* For descending use < */
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort(arr);
		System.out.println("Sorted array:-");
		printArray(arr);
	}

	/* Prints the array */
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
