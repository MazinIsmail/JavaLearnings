package com.puzzle.algorithm;

/**
 * Swap first and last characters of words in a sentence.
 */
public class SwapFirstLastCharacters {
	public static void main(String[] args) {
		String input = "Welcome Mazin Ismail";
		String output = count(input);
		System.out.println(output);
	}

	static String count(String input) {
		char[] inputCharArray = input.toCharArray();
		for (int i = 0; i < inputCharArray.length; i++) {

			int firstLetterIndexOfWord = i;
			while (i < inputCharArray.length && inputCharArray[i] != ' ') {
				i++;
			}
			/*
			 * 'i' will be holding the value of last character of the word after the above
			 * loop.
			 */
			int lastLetterIndexOfWord = i - 1;
			swapChar(inputCharArray, firstLetterIndexOfWord, lastLetterIndexOfWord);

		}
		return new String(inputCharArray);
	}

	private static void swapChar(char[] ch, int firstLetterIndexOfWord, int lastLetterIndexOfWord) {
		char temp = ch[firstLetterIndexOfWord];
		ch[firstLetterIndexOfWord] = ch[lastLetterIndexOfWord];
		ch[lastLetterIndexOfWord] = temp;
	}
}