package com.customexception.learning;

/**
 * Unchecked Exception: -
 * 
 * The classes that inherit the RuntimeException are known as unchecked
 * exceptions. For example, ArithmeticException, NullPointerException,
 * ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at
 * compile-time, but they are checked at runtime.
 */
public class UncheckedException {
	public static void ArithException() {
		try {
			int data = 50 / 0; // may throw exception
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			// Java finally block is always executed whether exception is handled or not.
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

	public static void main(String[] args) {
		ArithException();
	}
}
