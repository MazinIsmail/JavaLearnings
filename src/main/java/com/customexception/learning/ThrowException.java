package com.customexception.learning;

/**
 * The throw keyword in Java is used to explicitly throw an exception from a
 * method or any block of code.
 *
 * We can throw either checked or unchecked exceptions in Java by throw keyword.
 * It is mainly used to throw a custom exception.
 * 
 * If we throw a checked exception using throw keyword, it is must to handle the
 * exception using catch block or the method must declare it using throws
 * declaration.
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
		System.out.println("Rest of the code...");
	}
}