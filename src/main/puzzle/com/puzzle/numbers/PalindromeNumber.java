package com.puzzle.numbers;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
        System.out.println(isPalindrome(12321)); // true
	}
	
	/**
	 * This method checks if a number is a palindrome. A palindrome is a number that
	 * reads the same backward as forward.
	 * 
	 * @param x the number to check
	 * @return true if x is a palindrome, false otherwise
	 * https://www.youtube.com/watch?v=OlTk8wM48ww&t=2s
	 */
	public static boolean isPalindrome(int x) {
		// Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
		if(x < 0 || (x!=0 && x % 10 == 0))
	        return false;
		
		int reversedNumber = 0;
		while (x > reversedNumber) {
			// Get the last digit of x
			int lastDigit = x % 10;
			// Add it to the reversed number
			reversedNumber = reversedNumber * 10 + lastDigit;
			// Remove the last digit from x
			x = x/10;
		}
		
		// If the number of digits is odd, we can get rid of the middle digit by
		// reversedNumber/10. Example: 12321 -> x = 12, reversedNumber = 123
		return (x == reversedNumber || x == reversedNumber / 10);
		
	}

}
