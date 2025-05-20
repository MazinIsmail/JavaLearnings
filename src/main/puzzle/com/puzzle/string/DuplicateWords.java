package com.puzzle.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {
	private static void duplicateWords(String inputString) {
		/*
		 * Map<String, Integer> wordCount = new HashMap<>(); 
		 * for (String word : words) { * } 
		 * wordCount.containsKey(word.toLowerCase()) 
		 * wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
		 *
		 * Set<String> wordsInString = wordCount.keySet();
		 * for (Map.Entry<String, Integer> wordEntrySet : wordCount.entrySet()) {}
		 */
		
		
		String[] words = inputString.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if (wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}

		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}

		System.out.println();

		for (Map.Entry<String, Integer> wordEntrySet : wordCount.entrySet()) {
			System.out.println(wordEntrySet.getKey() + " : " + wordEntrySet.getValue());
		}

	}

	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");
		duplicateWords("Java is java again java");
		duplicateWords("Super Man Bat Man Spider Man");
	}
}