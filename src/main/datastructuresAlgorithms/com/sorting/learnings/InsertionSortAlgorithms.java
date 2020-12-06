package com.sorting.learnings;

/**
 * Insertion Sort Algorithms
 * 
 * This is an in-place comparison-based sorting algorithm. Here, a sub-list is
 * maintained which is always sorted. For example, the lower part of an array is
 * maintained to be sorted. An element which is to be inserted in this sorted
 * sub-list, has to find its appropriate place and then it has to be inserted
 * there. Hence the name, insertion sort.
 * 
 * The array is searched sequentially and unsorted items are moved and inserted
 * into the sorted sub-list (in the same array). This algorithm is not suitable
 * for large data sets as its average and worst case complexity are of Ο(n2),
 * where n is the number of items.
 * 
 * The array is virtually split into a sorted and an unsorted part. Values from
 * the unsorted part are picked and placed at the correct position in the sorted
 * part.
 * 
 * Algorithm:-
 * 
 * Step 1 − If it is the first element, it is already sorted. return 1;
 * 
 * Step 2 − Pick next element
 * 
 * Step 3 − Compare with all elements in the sorted sub-list
 * 
 * Step 4 − Shift all the elements in the sorted sub-list that is greater than
 * the value to be sorted
 * 
 * Step 5 − Insert the value
 * 
 * Step 6 − Repeat until list is sorted
 * 
 */
public class InsertionSortAlgorithms {

	/* Function to sort array using insertion sort */
	private static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				// Shift forward
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			// Reverse of key = arr[i] if it does not execute the above while loop. So no
			// difference, it is assigned to same place.
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };
		sort(arr);
		printArray(arr);
	}
}
