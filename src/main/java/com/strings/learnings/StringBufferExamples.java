package com.strings.learnings;

public class StringBufferExamples {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("MazinIsmail");
		System.out.println("StringBuffer Value: " + sbf);

		// get substring start from index 1
		// using substring() and print results
		System.out.println("StringBuffer subSequence: " + sbf.substring(5));
		sbf.reverse();
		System.out.println("StringBuffer reversing: " + sbf);

		// Deleting the character at indexpoint 5
		sbf.deleteCharAt(5);
		System.out.println("StringBuffer after deleting indexpoint 5: " + sbf); // Deleted "I"

		try {
			// get substring starts from index -7 using substring() and print
			String temp = sbf.substring(7);
			System.out.println("StringBuffer substring from index 7: " + temp);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}
}
