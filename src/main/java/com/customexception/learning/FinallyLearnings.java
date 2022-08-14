package com.customexception.learning;

/**
 * Java finally block is always executed whether an exception is handled or not.
 * Therefore, it contains all the necessary statements that need to be printed
 * regardless of the exception occurs or not.
 * 
 * Only one finally block.
 * 
 * The finally block will not be executed if the program exits (either by
 * calling System.exit() or by causing a fatal error that causes the process to
 * abort).
 */
public class FinallyLearnings {

	public static void main(String[] args) {
		finallyTest();

		System.out.println("\nTesting return");
		int a = returnTestFinally();
		System.out.println("returnTestFinally: " + a);

		System.out.println("\nTesting return in finally");
		String s = testReturnFinally();

		System.out.println("\nAbrupt aborting");
		abruptAborting();
		System.out.println("When you abort using System.exit(), this will not run.");
	}

	private static void finallyTest() {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("Finally block is always executed");
		}
	}

	private static String testReturnFinally() {
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

	private static int returnTestFinally() {
		try {
			int data = 25 / 5;
			System.out.println(data);
			return data;
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("Finally block is always executed");
		}
		return 0;
	}

	private static void abruptAborting() {
		try {
			int data = 25 / 5;
			System.out.println(data);
			System.exit(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("Finally block is always executed. Or is it so!!!");
		}
	}
}
