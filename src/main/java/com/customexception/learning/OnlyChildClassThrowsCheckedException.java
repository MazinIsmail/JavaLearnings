package com.customexception.learning;

/**
 * If base class doesn’t throw any exception but child class throws an checked
 * exception
 *
 */
class SuperClass {

	// SuperClass doesn't declare any exception
	void method() {
		System.out.println("SuperClass");
	}
}

class OnlyChildClassThrowsCheckedException extends SuperClass {

	// SuperClass inherited by the SubClass method() declaring Checked Exception
	// IOException
	void method() {

		// IOException is of type Checked Exception ,so the compiler will give Error
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClass s = new OnlyChildClassThrowsCheckedException();
		s.method();
	}
}
