package com.hangman.two;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("       Welcome to HANGMAN");
		System.out.println("-------------------------------");

		System.out.println(
				"\n" + "\n" + "OK Guessing Player ... turn around, while your friend enters the word to guess!");
		System.out.print("\n" + "\n" + "Other Player - Enter your word (up to 10 letters only, not case sensitive): ");

		String word;

		/*
		 * 2)The word to guess is not case sensitive, and only up to a maximum of 10
		 * characters.
		 */
		while ((word = scanner.nextLine()).length() > 10) {
			System.out.print("Please enter only up to a maximum of 10 characters: ");
		}

		int wordLength = word.length();
		int guessesLeft = 10;
		String lettersLeft = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // all letters available to guess
		String guessedLetters = "";

		// Print 20 blank lines to hide the word to guess from the screen
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}

		// Guessing player is shown with stars for the number of letters in the word to
		// guess
		String hiddenWord = "";
		for (int i = 0; i < wordLength; i++) {
			hiddenWord += "*";
		}

		// Guessing player is prompted for a letter
		while (guessesLeft > 0 && !hiddenWord.equals(word)) {
			System.out.println("\n" + "Word to date: " + hiddenWord + " (" + guessesLeft + " guess(es) left)");
			System.out.print("Want to solve the puzzle? Enter 'Y' to solve the puzzle, or 'N' to guess a character: ");
			String wholeW = scanner.next().toUpperCase();
			//
			if (wholeW.charAt(0) == 'Y') {
				System.out.print("What's the whole word? ");
				String answerW = scanner.next();
				if (answerW.equals(word)) {
					hiddenWord = word;
				} else {
					System.out.println("Not correct, keep playing");
					guessesLeft--;
				}
			} else {
				System.out.println("Letters not tried yet: " + lettersLeft);
				System.out.print("Which letter should I check for? ");
				String guess = scanner.next().toUpperCase(); // registering the guess
				// Check if the guess is a valid letter
				char letter = guess.charAt(0);
				if (!Character.isLetter(letter) || guessedLetters.contains(guess)) {
				} else {
					// Update the list of letters still left to try
					lettersLeft = lettersLeft.replace(String.valueOf(letter), "*");
					guessedLetters += letter;

					// Check if the letter is part of the word to guess
					boolean found = false;
					for (int i = 0; i < wordLength; i++) {
						if (word.charAt(i) == letter) {
							hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1);
							found = true;
						}

						System.out.print("--> Not a valid request - either not a letter or already guesses.");

					}

					if (!found) {
						guessesLeft--;

					}
				}
			}
		}

		// Program ends with a summary of the game
		if (hiddenWord.equals(word)) {
			System.out.println("\n" + "----------------------------------------------------");
			System.out.println("Congratulations!!!");
			System.out.println(
					"You guessed the mystery word '" + word.toUpperCase() + "' in " + guessesLeft + " guesses!");
		} else {
			System.out.println("\n" + "Sorry, you didn't find the mystery word!. \n\" It was: " + word);
		}
		System.out.println("\n" + "Goodbye ....");
		System.out.println("----------------------------------------------------");
	}
}