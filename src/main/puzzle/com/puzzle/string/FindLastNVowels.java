package com.puzzle.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindLastNVowels {

	public static void main(String[] args) {
		String sentence1 = "Hello World, how are you?";
		String sentence2 = "AEIOUaeiou";
		String sentence3 = "Rhythm"; // No vowels
		String sentence4 = "Java";
		String sentence5 = "Programming is fun";
		System.out.println("Sentence: \"" + sentence1 + "\", n=3 -> " + findLastNVowels(sentence1, 3));
		System.out.println("Sentence: \"" + sentence1 + "\", n=5 -> " + findLastNVowels(sentence1, 5));
		System.out.println("Sentence: \"" + sentence1 + "\", n=10 -> " + findLastNVowels(sentence1, 10));
		System.out.println("Sentence: \"" + sentence2 + "\", n=5 -> " + findLastNVowels(sentence2, 5));
		System.out.println("Sentence: \"" + sentence3 + "\", n=2 -> " + findLastNVowels(sentence3, 2));
		System.out.println("Sentence: \"" + sentence4 + "\", n=1 -> " + findLastNVowels(sentence4, 1));
		System.out.println("Sentence: \"" + sentence5 + "\", n=3 -> " + findLastNVowels(sentence5, 3));
		System.out.println("Sentence: \"" + sentence5 + "\", n=0 -> " + findLastNVowels(sentence5, 0));
		System.out.println("Sentence: \"" + sentence5 + "\", n=-2 -> " + findLastNVowels(sentence5, -2));
		System.out.println("\n--- Using Stream-based approach ---");
		System.out.println("Sentence: \"" + sentence1 + "\", n=3 -> " + findLastNVowelsUsingStreams(sentence1, 3));
		System.out.println("Sentence: \"" + sentence1 + "\", n=5 -> " + findLastNVowelsUsingStreams(sentence1, 5));
		System.out.println("Sentence: \"" + sentence5 + "\", n=3 -> " + findLastNVowelsUsingStreams(sentence5, 3));
	}

	public static List<Character> findLastNVowels(String sentence, int n) {
		if (sentence == null || sentence.isEmpty() || n <= 0) {
			return Collections.emptyList();
		}
		List<Character> lastNVowels = new ArrayList<>();
		final Set<Character> VOWELS = new LinkedHashSet<>(
				Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		for (int i = sentence.length() - 1; i >= 0; i--) {
			char ch = sentence.charAt(i);
			if (VOWELS.contains(ch)) {
				// Add the vowel to the beginning of the list
				// to maintain the correct order (left-to-right appearance)
				lastNVowels.add(0, ch);

				// If we have found 'n' vowels, we can stop
				if (lastNVowels.size() == n) {
					break;
				}
			}
		}
		return lastNVowels;
	}

	public static List<Character> findLastNVowelsUsingStreams(String sentence, int n) {
		final Set<Character> VOWELS = new LinkedHashSet<>(
				Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		List<Character> result = new ArrayList<>();
		if (sentence == null || sentence.isEmpty() || n <= 0) {
			return Collections.emptyList();
		}

		// Convert the sentence to a list of characters for easier stream processing
		List<Character> chars = sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		// Reverse the list, filter vowels, limit, then reverse back to get correct
		// order
		Collections.reverse(chars);
		chars.stream().filter(VOWELS::contains).limit(n).forEach(letter -> result.add(letter));
		// Reverse again to restore original appearance order
		Collections.reverse(result);

		return result;
	}

}
