package com.customexception.learning;

import java.io.IOException;

/**
 * When base class and child class both throws a checked/unchecked exception.
 * 
 * If the superclass method declares an exception, subclass overridden method
 * can declare same, subclass exception or no exception but cannot declare
 * parent exception.
 */
class Parent {
	void brand() throws IOException {
		System.out.println("Yamaha");
	}

	void brandRuntime() throws RuntimeException {
		System.out.println("Yamaha");
	}

	void brandNoRuntime() throws RuntimeException {
		System.out.println("Yamaha");
	}
}

class ParentThrowsException extends Parent {

	// Same exception, subclass exception or no exception is allowed.
	void brand() throws IOException {
		System.out.println("Bajaj");
	}

	// Subclass exception
	void brandRuntime() throws ArithmeticException {
		System.out.println("Yamaha");
	}

	// No exception
	void brandNoRuntime() {
		System.out.println("Yamaha");
	}

	/**
	 * Parent exception not allowed
	 * 
	 * // Exception is not compatible with throws clause in Parent.brand() void
	 * brand() throws Exception { System.out.println("Bajaj"); }
	 */

	public static void main(String args[]) {
		Parent obj = new ParentThrowsException();
		try {
			obj.brand();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
