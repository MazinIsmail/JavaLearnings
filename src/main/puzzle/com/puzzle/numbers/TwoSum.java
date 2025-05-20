package com.puzzle.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] 
	 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2] 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 */

	public static void main(String[] args) {
		System.out.println("Output : " + Arrays.toString(twoSumIndexBruteForce(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println("Output : " + Arrays.toString(twoSumIndexBruteForce(new int[] { 3, 2, 4 }, 6)));
		System.out.println("Output : " + Arrays.toString(twoSumIndexBruteForce(new int[] { 3, 3 }, 6)));

		
		System.out.println("Output : " + Arrays.toString(twoSumIndexOptimal(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println("Output : " + Arrays.toString(twoSumIndexOptimal(new int[] { 3, 2, 4 }, 6)));
		System.out.println("Output : " + Arrays.toString(twoSumIndexOptimal(new int[] { 3, 3 }, 6)));

	}
	
	
	public static int[] twoSumIndexBruteForce(int[] nums, int target) {

        int[] indexes = new int[2];
        for (int i = 0; i<nums.length; i++ ) {
            int firstIndexValue = nums[i];
            //System.out.println(firstIndexValue);
            for (int j= i+1; j<nums.length; j++) {
                int secondIndexValue = nums[j];
                //System.out.println(secondIndexValue);
                int sum = firstIndexValue + secondIndexValue;
                if (sum == target) {
                    indexes[0] = i; 
                    indexes[1] = j;
                }
            }
        }
        
        
        return indexes;
    }
	
	//	https://www.youtube.com/watch?v=luicuNOBTAI
	public static int[] twoSumIndexOptimal(int[] nums, int target) {
		int n = nums.length;
        int[] indexes = new int[2];
        indexes[0] = -1;
        indexes[1] = -1;
        Map<Integer, Integer> seenValues = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
		    // Check if the complement exists in the map
			// If it exists, we found the two indices
			// If it doesn't exist, we add the current number to the map
	        // and continue searching
			
			// This below statement is checking if the complement is already in the map and the time complexity is O(1).
			if (seenValues.containsKey(complement)) {
				indexes[0] = seenValues.get(complement);
				indexes[1] = i;
				return indexes;
			}
			seenValues.put(nums[i], i);
		}
        return indexes;
	}

}
