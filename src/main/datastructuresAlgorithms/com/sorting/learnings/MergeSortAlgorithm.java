package com.sorting.learnings;

/**
 * Merge Sort Algorithm
 * 
 * Merge sort is a sorting technique based on divide and conquer technique. With
 * worst-case time complexity being Ο(n log n), it is one of the most respected
 * algorithms.
 * 
 * Merge sort first divides the array into equal halves and then combines them
 * in a sorted manner.
 * 
 * Algorithm:-
 * 
 * Step 1 − if it is only one element in the list it is already sorted, return.
 * 
 * Step 2 − divide the list recursively into two halves until it can no more be
 * divided.
 * 
 * Step 3 − merge the smaller lists into new list in sorted order.
 * 
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides the
 * input array into two halves, calls itself for the two halves, and then merges
 * the two sorted halves. The merge() function is used for merging two halves.
 * The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and
 * arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.
 * 
 * Time Complexity: θ(nLogn)
 * 
 * Auxiliary Space: O(n)
 * 
 * Algorithmic Paradigm: Divide and Conquer
 * 
 * Sorting In Place: No in a typical implementation
 * 
 * Stable: Yes
 * 
 * Merge Sort is useful for sorting linked lists in O(nLogn) time.In the case of
 * linked lists, the case is different mainly due to the difference in memory
 * allocation of arrays and linked lists. Unlike arrays, linked list nodes may
 * not be adjacent in memory. Unlike an array, in the linked list, we can insert
 * items in the middle in O(1) extra space and O(1) time. Therefore, the merge
 * operation of merge sort can be implemented without extra space for linked
 * lists.
 * 
 * Merge sort accesses data sequentially and the need of random access is low.
 */
public class MergeSortAlgorithm {

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	private static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using merge()
	private static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;
			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);
			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Given Array");
		printArray(arr);
		sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		printArray(arr);
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
