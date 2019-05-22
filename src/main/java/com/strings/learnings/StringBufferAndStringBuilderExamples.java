package com.strings.learnings;
public class StringBufferAndStringBuilderExamples {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Salbin");
		System.out.println("String buffer before deletion = " + sbf);

		// get substring start from index 1
		// using substring() and print results
		System.out.println("SubSequence = " + sbf.substring(1));
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);

		// Deleting the character at indexpoint 5
		sbf.deleteCharAt(5);
		System.out.println("After deletion new StringBuffer = " + sbf);

		try {
			// get substring starts from index -7
			// using substring() and print
			sbf.substring(-7);
		}

		catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}
}
