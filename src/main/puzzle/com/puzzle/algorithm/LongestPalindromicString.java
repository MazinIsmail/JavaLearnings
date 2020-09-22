package com.puzzle.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicString {

	public static void main(String[] args) {
		LongestPalindromicString pd = new LongestPalindromicString();

		String pal = pd.findLongestPalindrome("bananas");
		System.out.println("" + pal);

		pal = pd.findLongestPalindrome("abaradar121");
		System.out.println("" + pal);

	}

	public String findLongestPalindrome(String s) {
		Set<String> allPalindrome = new HashSet<String>();
		if (s.isEmpty()) {
			return "Please enter a String";
		}
		if (s.length() == 1) {
			return s;
		}
		// Start with one char (starting) as a longest palindrome
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {

			// get longest palindrome for odd length (center is i)
			String tmp = checkForEquality(s, i, i);
			if (tmp.length() > 1) {
				allPalindrome.add(tmp);
			}
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			// get longest palindrome for even length (center is i, i+1)
			tmp = checkForEquality(s, i, i + 1);
			if (tmp.length() > 1) {
				allPalindrome.add(tmp);
			}
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}

		System.out.println("All Palindrome: " + allPalindrome.toString());

		return longest;
	}

	/**
	 * In this method equality is checked starting from the center moving one
	 * character left and one character right from the center. If both chars are
	 * equal then the next set of chars are checked.
	 */
	public String checkForEquality(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}

		/**
		 * Parameters:
		 * 
		 * beginIndex the beginning index, inclusive.
		 * 
		 * endIndex the ending index, exclusive.
		 */
		return s.substring(begin + 1, end);
	}
}
