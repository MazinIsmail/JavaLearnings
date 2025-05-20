package com.hangman.two;

import java.util.Scanner;

public class Hangman {

	public static int counter = 0;

	private boolean isComplete = false;

	private int gameId = 0;

	public Hangman() {
		counter++;
		gameId = counter;
	}

	private static String word;

	public void initializeGame_collectWord(Scanner scanner) {
		System.out.println("-------------------------------");
		System.out.println("       Welcome to HANGMAN " + gameId);
		System.out.println("-------------------------------");

		System.out.println(
				"\n" + "\n" + "OK Guessing Player ... turn around, while your friend enters the word to guess!");
		System.out.print("\n" + "\n" + "Other Player - Enter your word (up to 10 letters only, not case sensitive): ");

		String word = "";

		/*
		 * 2)The word to guess is not case sensitive, and only up to a maximum of 10
		 * characters.
		 */
		while ((word = scanner.nextLine()).length() > 10 || !isAlpha(word)) {
			System.out.print("Please enter only up to a maximum of 10 alpha characters: ");
		}

		setWord(word);

	}

	public void play_a_guess(Scanner scanner) {
		int wordLength = word.length();
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

		word = word.toUpperCase();

		// Guessing player is prompted for a letter
		System.out.println("\n" + "GameID " + gameId + ": Word to date: " + hiddenWord);
		System.out.print("GameID " + gameId
				+ ": Want to solve the puzzle? Enter 'Y' to solve the puzzle, or 'N' to guess a character: ");
		String wholeW = scanner.next().toUpperCase();

		boolean found = false;
		if (wholeW.charAt(0) == 'Y' || wholeW.charAt(0) == 'y') {
			System.out.print("What's the whole word? ");
			String answerW = scanner.next();
			if (answerW.equalsIgnoreCase(word)) {
				hiddenWord = word;
			} else {
				System.out.println("Not correct");
			}
		} else if (wholeW.charAt(0) == 'N' || wholeW.charAt(0) == 'n') {
			System.out.println("GameID " + gameId + ": Letters not tried yet: " + lettersLeft);
			System.out.print("GameID " + gameId + ": Which letter should I check for? ");
			String guess = scanner.next().toUpperCase(); // registering the guess
			// Check if the guess is a valid letter
			char letter = Character.toUpperCase(guess.charAt(0));
			// Update the list of letters still left to try
			lettersLeft = lettersLeft.replace(String.valueOf(letter), "*");
			if (!Character.isLetter(letter) || guessedLetters.contains(guess)) {
				System.out.print("Not a valid request: Either not a letter or already guesses.");
			} else {
				guessedLetters += letter;
				// Check if the letter is part of the word to guess
				for (int i = 0; i < wordLength; i++) {
					if (word.charAt(i) == letter) {

						hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1);
						found = true;
						System.out.println("GameID " + gameId + ": --> great guess!");

						break;
					}

				}

				if (found == false) {
					System.out.println("GameID " + gameId + ": --> Sorry, wrong guess!");
				}

			}
		} else {
			System.out.println("Invalid input");
		}

		// ToDo: Check if else do not run.
		// Program ends with a summary of the game
		if (hiddenWord.equals(word)) {
			System.out.println("\n" + "----------------------------------------------------");
			System.out.println("Congratulations!!!");
			System.out.println("You guessed the mystery word '" + word.toUpperCase());
		} else if (found) {
			// System.out.println("\n" + "You guessed the letter correct: " + word);
		}
		// System.out.println("\n" + "Goodbye ....");
		// System.out.println("----------------------------------------------------");
		isComplete = true;
	}

	public void playGame(Scanner scanner) {
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

		word = word.toUpperCase();
		// Guessing player is prompted for a letter
		while (guessesLeft > 0 && !hiddenWord.equals(word)) {
			System.out.println("\n" + "GameID " + gameId + ": Word to date: " + hiddenWord + " (" + guessesLeft
					+ " guess(es) left)");
			System.out.print("GameID " + gameId
					+ ": Want to solve the puzzle? Enter 'Y' to solve the puzzle, or 'N' to guess a character: ");
			String wholeW = scanner.next().toUpperCase();
			//
			if (wholeW.charAt(0) == 'Y' || wholeW.charAt(0) == 'y') {
				System.out.print("What's the whole word? ");
				String answerW = scanner.next();
				if (answerW.equalsIgnoreCase(word)) {
					hiddenWord = word;
				} else {
					System.out.println("Not correct, keep playing");
					guessesLeft--;
				}
			} else if (wholeW.charAt(0) == 'N' || wholeW.charAt(0) == 'n') {
				System.out.println("GameID " + gameId + ": Letters not tried yet: " + lettersLeft);
				System.out.print("GameID " + gameId + ": Which letter should I check for? ");
				String guess = scanner.next().toUpperCase(); // registering the guess
				// Check if the guess is a valid letter
				char letter = Character.toUpperCase(guess.charAt(0));
				// Update the list of letters still left to try
				lettersLeft = lettersLeft.replace(String.valueOf(letter), "*");
				if (!Character.isLetter(letter) || guessedLetters.contains(guess)) {
					System.out.print("Not a valid request: Either not a letter or already guesses.");
				} else {
					guessesLeft--;
					guessedLetters += letter;
					// Check if the letter is part of the word to guess
					boolean found = false;
					for (int i = 0; i < wordLength; i++) {
						if (word.charAt(i) == letter) {

							hiddenWord = hiddenWord.substring(0, i) + letter + hiddenWord.substring(i + 1);
							found = true;
							System.out.println("GameID " + gameId + ": --> great guess!");
							break;
						}

					}

					if (found == false) {
						System.out.println("GameID " + gameId + ": --> Sorry, wrong guess!");
					}

				}
			} else {
				System.out.println("Invalid input");
			}
		}

		// ToDo: Check if else do not run.
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
		isComplete = true;
	}

	private static boolean isAlpha(String name) {
		return name.matches("[a-zA-Z]+");
	}

	private static void setWord(String word) {
		Hangman.word = word;
	}

}
