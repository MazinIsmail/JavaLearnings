package com.customexception.learning;

/**
 * throws is a keyword in Java which is used in the signature of method to
 * indicate that this method might throw one of the listed type exceptions.
 * 
 * Case 1: We have caught the exception i.e. we have handled the exception using
 * try/catch block.
 * 
 * Case 2: We have declared the exception i.e. specified throws keyword with the
 * method.
 *
 */
class ThrowsException2 {
	void method1() throws ArithmeticException {
		throw new ArithmeticException("Calculation error");
	}

	void method2() throws ArithmeticException {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
	}

	public static void main(String args[]) {
		ThrowsException2 obj = new ThrowsException2();
		obj.method3();
		System.out.println("End Of Program");
	}
}
