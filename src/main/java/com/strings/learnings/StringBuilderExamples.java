package com.strings.learnings;

public class StringBuilderExamples {

	public static void main(String[] args) {
		StringBuilder sbf = new StringBuilder("MazinIsmail");
		System.out.println("StringBuilder Value: " + sbf);

		// get substring start from index 5
		// using substring() and print results
		System.out.println("StringBuilder subSequence: " + sbf.substring(5));
		sbf.reverse();
		System.out.println("StringBuilder reversing: " + sbf);

		// Deleting the character at indexpoint 5
		sbf.deleteCharAt(5);
		System.out.println("StringBuilder after deleting indexpoint 5: " + sbf); // Deleted "I"

		try {
			// get substring starts from index 7 using substring() and print
			String temp = sbf.substring(7);
			System.out.println("StringBuilder substring from index 7: " + temp);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}
}
