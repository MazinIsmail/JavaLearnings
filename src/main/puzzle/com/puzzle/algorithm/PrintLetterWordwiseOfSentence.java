package com.puzzle.algorithm;

public class PrintLetterWordwiseOfSentence {

	public static void main(String[] args) {
		String input = "Welcome Mazin Ismail";
		String[] wordwise = input.split(" ");
		int longestWord = wordwise[0].length();
		for (int i = 0; i < longestWord; i++) {

			for (int forWordString = 0; forWordString < wordwise.length; forWordString++) {
				char wordChar[] = wordwise[forWordString].toCharArray();
				if (i < wordChar.length) {
					System.out.println("The first character of each word: " + wordChar[i]);
				}
				if (longestWord < wordChar.length) {
					longestWord = wordChar.length;
				}
			}

		}
	}

}
