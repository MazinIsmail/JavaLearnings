package com.assessment.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriplesFinderOrThreeSumProblem {

	public static void main(String[] args) {
		System.out.println("--- Test Cases ---");

		// Test Case 1: Standard case with negative and positive numbers
		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		int target1 = 0;
		System.out.println("\nInput: " + Arrays.toString(nums1) + ", Target: " + target1);
		List<List<Integer>> triples1 = findTriples(nums1, target1);
		System.out.println("Triples: " + triples1); // Expected: [[-1, -1, 2], [-1, 0, 1]]

		// Test Case 2: Positive numbers only
		int[] nums2 = { 1, 2, 3, 4, 5, 6 };
		int target2 = 10;
		System.out.println("\nInput: " + Arrays.toString(nums2) + ", Target: " + target2);
		List<List<Integer>> triples2 = findTriples(nums2, target2);
		System.out.println("Triples: " + triples2); // Expected: [[1, 3, 6], [1, 4, 5], [2, 3, 5]]

		// Test Case 3: No triples found
		int[] nums3 = { 1, 2, 3 };
		int target3 = 10;
		System.out.println("\nInput: " + Arrays.toString(nums3) + ", Target: " + target3);
		List<List<Integer>> triples3 = findTriples(nums3, target3);
		System.out.println("Triples: " + triples3); // Expected: []

		// Test Case 4: Array with many duplicates, target 0
		int[] nums4 = { 0, 0, 0, 0, 0, 0 };
		int target4 = 0;
		System.out.println("\nInput: " + Arrays.toString(nums4) + ", Target: " + target4);
		List<List<Integer>> triples4 = findTriples(nums4, target4);
		System.out.println("Triples: " + triples4); // Expected: [[0, 0, 0]] (only one unique triple)

		// Test Case 5: Array with mixture of values, negative target
		int[] nums5 = { -5, -2, 0, 1, 3, 6 };
		int target5 = -1;
		System.out.println("\nInput: " + Arrays.toString(nums5) + ", Target: " + target5);
		List<List<Integer>> triples5 = findTriples(nums5, target5);
		System.out.println("Triples: " + triples5); // Expected: [[-5, 1, 3], [-2, 0, 1]]

	}

	static public List<List<Integer>> findTriples(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();

		// 1. Sort the array.
		// Time complexity: O(n log n)
		Arrays.sort(nums);

		int n = nums.length;

		// 2. Iterate through the array with the first pointer 'i'.
		// This loop fixes the first element of our potential triple.
		// We iterate up to n - 2 because we need at least two more elements
		// (for 'left' and 'right' pointers) after 'nums[i]'.
		for (int i = 0; i < n - 2; i++) {

			// Optimization: Skip duplicate values for the first element.
			// If the current element is the same as the previous one,
			// any triple formed with nums[i] would be a duplicate of
			// a triple already considered with nums[i-1].
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// 3. Initialize two pointers: 'left' and 'right'.
			// 'left' starts immediately after 'i'.
			// 'right' starts at the end of the array.
			int left = i + 1;
			int right = n - 1;

			// 4. Use the two-pointer technique on the remaining subarray.
			// The 'while' loop continues as long as 'left' is less than 'right'.
			while (left < right) {
				// Calculate the current sum using the three pointers.
				// Cast to long to prevent potential integer overflow if nums[i], nums[left],
				// or nums[right] are large positive/negative numbers.
				long currentSum = (long) nums[i] + nums[left] + nums[right];

				if (currentSum == target) {
					// Case 1: Found a triple!
					// Add the triple to our result list.
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					// Move both pointers inward to look for other potential triples.
					left++;
					right--;

					// Optimization: Skip duplicate values for the second element.
					// If the new nums[left] is the same as the one just processed,
					// increment 'left' again to avoid duplicate triples.
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					// Optimization: Skip duplicate values for the third element.
					// Similar to the above, decrement 'right' if it's a duplicate.
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (currentSum < target) {
					// Case 2: Current sum is less than the target.
					// We need a larger sum, so move the 'left' pointer to the right
					// to pick a potentially larger number.
					left++;
				} else { // currentSum > target
					// Case 3: Current sum is greater than the target.
					// We need a smaller sum, so move the 'right' pointer to the left
					// to pick a potentially smaller number.
					right--;
				}
			}
		}

		return result;
	}

}
