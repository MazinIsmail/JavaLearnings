package com.customexception.learning;

/**
 * throws is a keyword in Java which is used in the signature of method to
 * indicate that this method might throw one of the listed type exceptions.
 *
 */
class ThrowsException {
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
		ThrowsException obj = new ThrowsException();
		obj.method3();
		System.out.println("End Of Program");
	}
}
