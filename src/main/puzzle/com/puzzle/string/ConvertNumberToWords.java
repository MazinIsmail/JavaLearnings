package com.puzzle.string;

public class ConvertNumberToWords {

	public static void main(String[] args) {

		// Test cases
		System.out.println("Number in words: " + convertToWords(0)); // Zero
		System.out.println("Number in words: " + convertToWords(7)); // Seven
		System.out.println("Number in words: " + convertToWords(10)); // Ten
		System.out.println("Number in words: " + convertToWords(15)); // Fifteen
		System.out.println("Number in words: " + convertToWords(223423));

	}

	public static String convertToWords(int n) {
		if (n == 0)
			return "Zero";
		// Words for numbers 0 to 19
		String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		// Words for tens
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		// Words for thousands
		String[] thousands = { "", "Thousand", "Million", "Billion" };

		String words = new String();
		int group = 0;
		// Process each group of 3 digits
		while (n > 0) {
			if (n % 1000 != 0) {
				int value = n % 1000;
				String temp = "";

				// Handle 3 digit number
				// If the number is greater than or equal to 100
				if (value >= 100) {
					// Add the corresponding word for hundreds
					temp = units[value / 100] + " Hundred ";
					value %= 100;
				}

				// Handle 2 digit number
				// If the number is greater than or equal to 20
				if (value >= 20) {
					// Add the corresponding word for tens
					temp += tens[value / 10] + " ";
					value %= 10;
				}

				// Handle unit number
				// If the number is less than 20
				if (value < 20 && value > 0) {
					// Add the corresponding word for units
					temp += units[value] + " ";
				}

				// Add the multiplier according to the group
				// If the group is greater than 0, add the corresponding thousands word
				temp += thousands[group] + " ";

				// Combine the words
				// If words is not empty, add "and" before the new words
				if (!words.isEmpty()) {
					words = temp + "and " + words;
				} else {
					words = temp;
				}
			}
			// Remove the last 3 digits
			n /= 1000;
			group++;
		}
		return words;

	}

}
