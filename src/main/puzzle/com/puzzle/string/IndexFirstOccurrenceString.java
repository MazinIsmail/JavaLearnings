package com.puzzle.string;

public class IndexFirstOccurrenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int strStr(String haystack, String needle) {

		int leftIndex = 0;
		for (int i = 0; i < haystack.length(); i++) {
			char currentChar = haystack.charAt(i);

			if (currentChar != needle.charAt(0)) {
				continue; // Skip to next iteration if characters don't match
			} else if (currentChar == needle.charAt(0)) {

			}
		}

		return -1;
	}

}
