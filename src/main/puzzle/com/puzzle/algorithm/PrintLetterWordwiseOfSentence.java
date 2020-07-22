package com.puzzle.algorithm;

public class PrintLetterWordwiseOfSentence {

	public static void main(String[] args) {
		String input = "Welcome Mazin Ismail";
		String[] wordwise = input.split(" ");
		int longestWord = wordwise[0].length();
		for (int i = 0; i < longestWord; i++) {

			// Looping wordwise array
			for (int forWordString = 0; forWordString < wordwise.length; forWordString++) {
				char wordChar[] = wordwise[forWordString].toCharArray();

				/*
				 * 'i' can go out of index of a words smaller than the longest word. 'i' is set
				 * to loop for the longest word, so smaller words will get effected.
				 */
				if (i < wordChar.length) {
					System.out.println("The first character of each word: " + wordChar[i]);
				}

				// Need to know the longestWord so as to iterate the outer loop.
				if (longestWord < wordChar.length) {
					longestWord = wordChar.length;
				}
			}

		}
	}

}
