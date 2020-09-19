package com.searching.learnings;

/**
 * Interpolation Search
 * 
 * Interpolation search is an improved variant of binary search. This search
 * algorithm works on the probing position of the required value. For this
 * algorithm to work properly, the data collection should be in a sorted form
 * and equally distributed.
 * 
 * There are cases where the location of target data may be known in advance.
 * For example, in case of a telephone directory, if we want to search the
 * telephone number of Morphius. Here, linear search and even binary search will
 * seem slow as we can directly jump to memory space where the names start from
 * 'M' are stored.
 * 
 * Interpolation search finds a particular item by computing the probe position.
 * Initially, the probe position is the position of the middle most item of the
 * collection.
 * 
 * If a match occurs, then the index of the item is returned. To split the list
 * into two parts, we use the following method:-
 * 
 * mid = Lo + ((Hi - Lo) / (A[Hi] - A[Lo])) * (X - A[Lo])
 * 
 * where"-
 * 
 * A = list
 * 
 * Lo = Lowest index of the list
 * 
 * Hi = Highest index of the list
 * 
 * A[n] = Value stored at index n in the list
 * 
 * 
 * If the middle item is greater than the item, then the probe position is again
 * calculated in the sub-array to the right of the middle item. Otherwise, the
 * item is searched in the subarray to the left of the middle item. This process
 * continues on the sub-array as well until the size of subarray reduces to
 * zero.
 * 
 * Runtime complexity of interpolation search algorithm is Ο(log (log n)) as
 * compared to Ο(log n) of BST in favorable situations.
 * 
 * Time Complexity: If elements are uniformly distributed, then O (log log n)).
 * In worst case it can take upto O(n).
 */
public class InterpolationSearchLearnings {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 55;
		int index = interpolationSearch(arr, x);
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");
	}

	public static int interpolationSearch(int[] sortedArray, int toFind) {
		int lowerIndex = 0;
		int higherIdex = sortedArray.length - 1;
		int probe;
		while (sortedArray[lowerIndex] <= toFind && sortedArray[higherIdex] >= toFind) {

			if (sortedArray[higherIdex] - sortedArray[lowerIndex] == 0)
				return (lowerIndex + higherIdex) / 2;
			/** out of range is possible here **/
			probe = lowerIndex + ((toFind - sortedArray[lowerIndex]) * (higherIdex - lowerIndex))
					/ (sortedArray[higherIdex] - sortedArray[lowerIndex]);

			if (sortedArray[probe] < toFind)
				lowerIndex = probe + 1;
			else if (sortedArray[probe] > toFind)
				higherIdex = probe - 1;
			else
				return probe;
		}
		if (sortedArray[lowerIndex] == toFind)
			return lowerIndex;
		else
			return -1;
	}

}
