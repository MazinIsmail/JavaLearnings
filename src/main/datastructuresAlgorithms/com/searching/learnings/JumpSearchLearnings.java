package com.searching.learnings;

/**
 * Jump Search
 * 
 * Like Binary Search, Jump Search is a searching algorithm for sorted arrays.
 * The basic idea is to check fewer elements (than linear search) by jumping
 * ahead by fixed steps or skipping some elements in place of searching all
 * elements.
 * 
 * For example, suppose we have an array arr[] of size n and block (to be
 * jumped) size m. Then we search at the indexes arr[0], arr[m],
 * arr[2m]…..arr[km] and so on. Once we find the interval (arr[km] < x <
 * arr[(k+1)m]), we perform a linear search operation from the index km to find
 * the element x.
 * 
 * What is the optimal block size to be skipped?
 * 
 * In the worst case, we have to do n/m jumps and if the last checked value is
 * greater than the element to be searched for, we perform m-1 comparisons more
 * for linear search. Therefore the total number of comparisons in the worst
 * case will be ((n/m) + m-1). The value of the function ((n/m) + m-1) will be
 * minimum when m = √n. Therefore, the best step size is m = √n.
 * 
 * On differentiating ((n/m) + m-1) expression with respect to m [you get d/dm
 * (n/m)+m-1 = 1-n/m^2] and equating it with 0, we get m = √n.
 * 
 * Time Complexity : O(√n)
 * 
 * Works only sorted arrays.
 * 
 * The optimal size of a block to be jumped is (√ n). This makes the time
 * complexity of Jump Search O(√ n).
 * 
 * The time complexity of Jump Search is between Linear Search ( ( O(n) ) and
 * Binary Search ( O (Log n) ). Binary Search is better than Jump Search, but
 * Jump search has an advantage that we traverse back only once (Binary Search
 * may require up to O(Log n) jumps, consider a situation where the element to
 * be searched is the smallest element or smaller than the smallest). So in a
 * system where binary search is costly, we use Jump Search.
 * 
 * The use case for jump search (O(√n)) over binary search (O(log n)) is when
 * jumping back is expensive. Replacing the linear search in jump search would
 * be counterproductive in that regard.
 */
public class JumpSearchLearnings {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 55;
		int index = jumpSearch(arr, x);
		System.out.println("\nNumber " + x + " is at index " + index);
	}

	public static int jumpSearch(int[] arrayToSearch, int element) {
		int arrayLength = arrayToSearch.length;
		int blockSize = (int) Math.floor(Math.sqrt(arrayLength));
		int currentLastIndex = blockSize - 1;

		// Jump to next block as long as target element is > currentLastIndex
		// and the array end has not been reached
		while (currentLastIndex < arrayLength && element > arrayToSearch[currentLastIndex]) {
			currentLastIndex += blockSize;
		}

		// Find accurate position of target element using Linear Search
		for (int currentSearchIndex = currentLastIndex - blockSize + 1; currentSearchIndex <= currentLastIndex
				&& currentSearchIndex < arrayLength; currentSearchIndex++) {
			if (element == arrayToSearch[currentSearchIndex]) {
				return currentSearchIndex;
			}
		}
		// Target element not found. Return negative integer as element position.
		return -1;
	}
}
