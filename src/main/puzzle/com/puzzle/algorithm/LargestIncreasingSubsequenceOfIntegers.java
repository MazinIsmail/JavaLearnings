package com.puzzle.algorithm;

import java.util.ArrayList;

/**
 * Given an unsorted array of integers, find the length of longest continuous
 * increasing subsequence (subarray).
 * 
 * Input: [1,3,5,4,7]
 * 
 * Output: 3
 * 
 * Explanation: The longest continuous increasing subsequence is [1,3,5], its
 * length is 3. Even though [1,3,5,7] is also an increasing subsequence, it's
 * not a continuous one where 5 and 7 are separated by 4.
 * 
 * Input: [2,2,2,2,2]
 * 
 * Output: 1
 * 
 * Explanation: The longest continuous increasing subsequence is [2], its length
 * is 1.
 * 
 * This is a classic sliding window problem.
 * 
 */
public class LargestIncreasingSubsequenceOfIntegers {

	public static void main(String[] args) {
		int input[] = { 2, 5, 3, 7, 4, 8, 5, 13, 6, 7, 8, 9 };
		int input2[] = { 2, 2, 2, 2 };
		findLengthOfLCIS(input);
	}

	public static int findLengthOfLCIS(int[] nums) {
		ArrayList<Integer> resultTemp = new ArrayList<>();
		ArrayList<Integer> resultFinal = new ArrayList<>();
		int result = 0;
		int anchorRight = 0;
		for (int i = 0; i < nums.length; i++) {

			/**
			 * If you remove the = comparison it will give you the result of The longest
			 * continuous non-decreasing subsequence.
			 */
			if (i > 0 && nums[i - 1] >= nums[i]) {
				anchorRight = i;
				System.out.println(resultTemp);
				if (resultFinal.size() <= resultTemp.size()) {
					resultFinal.clear();
					resultFinal.addAll(resultTemp);
				}
				resultTemp.clear();
			}
			// result = Math.max(result, i - anchorRight + 1);
			resultTemp.add(nums[i]);
		}
		System.out.println(resultTemp);
		if (resultFinal.size() <= resultTemp.size()) {
			resultFinal.clear();
			resultFinal.addAll(resultTemp);
		}
		System.out.println("Result:- ");
		System.out.println(resultFinal);

		System.out.println("Result Size:- ");
		System.out.println(resultFinal.size());

		return resultFinal.size();
	}

}
