package com.oops.polymorphism;

/**
 * In java, method overloading is not possible by changing the return type of
 * the method because there may occur ambiguity.
 * 
 * It is always the number of arguments and the type of arguments.
 */
public class CompileTimeReturnTypeAmbiguity {

	int sum(int a, int b) {
		System.out.println("Sum: " + (a + b));
		return a + b;
	}

	// This will cause Compile Time Error
	/*
	 * double sum(int a, int b) { System.out.println(a + b); return a + b; }
	 */

	public static void main(String args[]) {
		CompileTimeReturnTypeAmbiguity obj = new CompileTimeReturnTypeAmbiguity();
		int result = obj.sum(30, 20);
		System.out.println("Result: " + result);
	}
}
