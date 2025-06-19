package com.puzzle.string;

import java.util.HashSet;
import java.util.Set;

/**
 * CountRestartSubstringForDuplicate
 * 
 * You are given a string consisting of lowercase letters of the English
 * alphabet. You must split this string into a minimal number of substrings in
 * such a way that no letter occurs more than once in each substring.
 */
public class CountRestartSubstringForDuplicate {
	public static void main(String[] args) {
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution("abacabadaba"));
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution("aabbccdd"));
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution(""));
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution(null));
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution("abcde"));
		System.out.println("Number of substrings: " + new CountRestartSubstringForDuplicate().solution("dddd"));
	}

	public int solution(String S) {
		if (S == null || S.isEmpty()) {
			return 0;
		}
		int count = 1;
		Set<Character> subString = new HashSet<>();
		for (int i = 0; i < S.length(); i++) {
			Character currentChar = S.charAt(i);
			if (subString.contains(currentChar)) {
				count++;
				subString = new HashSet<>();

			}
			subString.add(currentChar);
			/*
			 * System.out.println("index: " + i); System.out.println("subString: " +
			 * Arrays.asList(subString)); System.out.println(count);
			 */
		}
		return count;
	}
}
