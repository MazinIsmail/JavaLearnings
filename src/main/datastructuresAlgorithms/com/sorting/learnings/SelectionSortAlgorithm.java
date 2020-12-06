package com.sorting.learnings;

/**
 * Selection Sort Algorithm
 * 
 * Selection sort is a simple sorting algorithm. This sorting algorithm is an
 * in-place comparison-based algorithm in which the list is divided into two
 * parts, the sorted part at the left end and the unsorted part at the right
 * end. Initially, the sorted part is empty and the unsorted part is the entire
 * list.
 * 
 * The smallest element is selected from the unsorted array and swapped with the
 * leftmost element, and that element becomes a part of the sorted array. This
 * process continues moving unsorted array boundary by one element to the right.
 * 
 * This algorithm is not suitable for large data sets as its average and worst
 * case complexities are of Ο(n2), where n is the number of items.
 * 
 * Algorithm:-
 * 
 * Step 1 − Set MIN to location 0
 * 
 * Step 2 − Search the minimum element in the list
 * 
 * Step 3 − Swap with value at location MIN
 * 
 * Step 4 − Increment MIN to point to next element
 * 
 * Step 5 − Repeat until list is sorted
 * 
 * With every iteration of selection sort, an element is picked from the
 * unsorted subarray and moved to the sorted subarray.
 * 
 * Time Complexity:-
 * 
 * Best: ?(n^2); Average: ?(n^2); Worst: O(n^2)
 * 
 * Space Complexity:-
 * 
 * O(1)
 */
public class SelectionSortAlgorithm {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			// searching for lowest index
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			// Swap with smallest number.
			swap(arr, i, index);
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Selection Sort:-");
		printArray(arr1);
		System.out.println();

		selectionSort(arr1);

		System.out.println("After Selection Sort:-");
		printArray(arr1);
	}

	private static void swap(int[] arr, int i, int index) {
		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallerNumber;
	}

	/* Prints the array */
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
