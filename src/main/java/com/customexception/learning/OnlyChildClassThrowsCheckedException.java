package com.customexception.learning;

/**
 * If the superclass method does not declare an exception, subclass overridden
 * method cannot declare the checked exception but it can declare unchecked
 * exception.
 * 
 * If the superclass method declares an exception, subclass overridden method
 * can declare same, subclass exception or no exception but cannot declare
 * parent exception.
 */
class SuperClass {

	// SuperClass doesn't declare any exception
	void method() {
		System.out.println("SuperClass");
	}
}

class OnlyChildClassThrowsCheckedException extends SuperClass {

	// SuperClass inherited by the SubClass method() declaring Unchecked Exception
	void method() throws RuntimeException {
		System.out.println("SubClass");
	}

	// Gives compile time error.
	// IOException is not allowed. IOException is Checked Exception.
	/*
	 * void msg() throws IOException { System.out.println("TestExceptionChild"); }
	 */

	public static void main(String args[]) {
		SuperClass s = new OnlyChildClassThrowsCheckedException();
		s.method();
	}
}
