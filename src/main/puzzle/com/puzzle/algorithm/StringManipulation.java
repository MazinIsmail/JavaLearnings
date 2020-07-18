package com.puzzle.algorithm;

import java.util.Arrays;

public class StringManipulation {

	public static String reverseString(String original) {
		int length = original.length();
		String reverse = null;
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
		return reverse;
	}

	public static String reverseWordByWord(String orginal) {
		int strLeng = orginal.length() - 1;
		StringBuffer reverseWord = new StringBuffer(), temp = new StringBuffer();

		for (int i = 0; i <= strLeng; i++) {
			temp = temp.append(orginal.charAt(i));

			if ((orginal.charAt(i) == ' ') || (i == strLeng)) {
				reverseWord = reverseWord.append(temp.reverse());
				reverseWord.append(" ");
				temp = new StringBuffer("");
			}
		}
		return reverseWord.toString();
	}

	public static String sortString(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		StringBuffer sorted = new StringBuffer();
		sorted.append(chars);
		return sorted.toString();
	}
}
