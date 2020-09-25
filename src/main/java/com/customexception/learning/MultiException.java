package com.customexception.learning;

import java.util.Scanner;

/**
 * A Java program to demonstrate multi-catch feature
 */

public class MultiException {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		try {
			int n = 9;
			if (99 % n == 0)
				System.out.println(n + " is a factor of 99");
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception encountered " + ex);
		} finally {
			scn.close();
		}

		System.out.println(testReturn());
	}

	private static String testReturn() {
		try {
			int n = 10;
			if (100 % n == 0)
				System.out.println(n + " is a factor of 100");
			return "In Try";
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception encountered " + ex);
			return "In Catch";
		} finally {
			System.out.println("In Finally");
			return "In Finally"; // This return gets executed instead of try's
		}
	}
}
