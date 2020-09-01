package com.customexception.learning;

import java.io.IOException;

/**
 * If the superclass method does not declare an exception, subclass overridden
 * method cannot declare the checked exception but it can declare unchecked
 * exception.
 * 
 * Check this example "OnlyChildClassThrowsUncheckedException.java"
 */
class SuperClass {

	// SuperClass doesn't declare any exception
	void method() {
		System.out.println("SuperClass");
	}
}

class OnlyChildClassThrowsCheckedException extends SuperClass {

	// SuperClass inherited by the SubClass method() declaring Checked Exception
	// IOException is not allowed
	void method() throws RuntimeException {

		// IOException is of type Checked Exception, so the compiler will give Error
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClass s = new OnlyChildClassThrowsCheckedException();
		s.method();
	}
}
