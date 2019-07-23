package com.customexception.learning;

/**
 * The throw keyword in Java is used to explicitly throw an exception from a
 * method or any block of code.
 *
 */

class ThrowException {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}
}