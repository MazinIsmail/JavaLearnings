package com.customexception.learning;

/**
 * A Java program to demonstrate multi-catch feature
 */

public class MultiException {
	public static void main(String args[]) {
		try {
			int n = 9;
			if (99 % n == 0)
				System.out.println(n + " is a factor of 99");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception encountered " + ex);
		} finally {
			System.out.println("Finally");
		}

		System.out.println("");
	}

}
