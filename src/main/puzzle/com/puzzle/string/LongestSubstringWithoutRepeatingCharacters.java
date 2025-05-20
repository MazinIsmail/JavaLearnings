package com.puzzle.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(
				"Length of longest substring without repeating characters: " + lengthOfLongestSubstring("abcabcbb"));
		System.out.println(
				"Length of longest substring without repeating characters: " + lengthOfLongestSubstring("bbbbb"));
		System.out.println(
				"Length of longest substring without repeating characters: " + lengthOfLongestSubstring("pwwkew"));
		System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(""));
		System.out
				.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring("a"));
	}

	/**
	 * Given a string s, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * @param s
	 * @return
	 */
	// Time complexity: O(n)
	// Sliding Window Technique
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> seenChar = new HashMap<>();
		int leftIndex = 0;
		int length = 0;
		for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
			char rightIndexValue = s.charAt(rightIndex);
			// If the character is already seen and
			// its index is greater than or equal to leftIndex,
			if (seenChar.containsKey(rightIndexValue) && seenChar.get(rightIndexValue) >= leftIndex) {
				leftIndex = seenChar.get(rightIndexValue) + 1;
			} else {
				// If the character is not seen or its index is less than leftIndex,
				length = Math.max(length, rightIndex - leftIndex + 1);
			}
			seenChar.put(rightIndexValue, rightIndex);
		}

		return length;

	}

}
