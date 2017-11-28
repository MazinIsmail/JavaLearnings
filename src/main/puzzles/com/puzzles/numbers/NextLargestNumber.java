package com.puzzles.numbers;

import java.util.Arrays;

public class NextLargestNumber {

	private static int findNextLargest(int number) {
		int[] digits = getDigits(number);
		int digitLength = digits.length;
		int i;
		// Start from the right most digit
		// and find the first digit that is smaller
		// than the digit next to it.
		for (i = digitLength - 1; i > 0; i--) {
			if (digits[i] > digits[i - 1]) {
				break;
			}
		}
		int currentIndex = i;
		int previousIndex = i - 1;
		int numberCurrentIndex = digits[i];
		int numberPreviousIndex = digits[i - 1];
		if (i == 0) {
			System.out.println("Not possible, no greater number available.");
			return 0;
		} else {
			Integer swapIndex = null;
			// Find the smallest digit on right
			// side of numberCurrentIndex that is greater than the
			// numberPreviousIndex
			for (int j = i; j < digitLength; j++) {
				if (digits[j] > numberPreviousIndex) {
					swapIndex = j;
				}
			}
			swap(digits, swapIndex, previousIndex);
			sort(digits, i);
			return formNumber(digits);
		}
	}

	private static int[] getDigits(int number) {
		int[] digitsArr = new int[String.valueOf(number).length()];
		int index = digitsArr.length - 1;
		while (number > 0) {
			digitsArr[index--] = number % 10;
			number = number / 10;
		}
		return digitsArr;
	}

	private static void swap(int[] digits, int rightIndex, int leftIndex) {
		int temp = digits[rightIndex];
		digits[rightIndex] = digits[leftIndex];
		digits[leftIndex] = temp;
	}

	private static void sort(int[] digits, int startIndex) {
		int endIndex = digits.length;
		if (startIndex == endIndex)
			return;
		Arrays.sort(digits, startIndex, endIndex);
	}

	private static int formNumber(int[] digits) {
		int digit = 0;
		int size = digits.length;
		for (int i = 0; i < size; i++)
			digit = digit * 10 + digits[i];
		return digit;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Input number is:        " + 12344321);
			System.out.println("Next largest number is: " + findNextLargest(12344321));

			System.out.println("Input number is:        " + 123454321);
			System.out.println("Next largest number is: " + findNextLargest(123454321));

			System.out.println("Input number is:        " + 13520);
			System.out.println("Next largest number is: " + findNextLargest(13520));
			
			System.out.println("Input number is:        " + 135420);
			System.out.println("Next largest number is: " + findNextLargest(135420));
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
