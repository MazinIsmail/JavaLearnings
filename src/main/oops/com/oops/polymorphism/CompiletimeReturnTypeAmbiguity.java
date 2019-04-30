/**
 * In java, method overloading is not possible by changing the return type of
 * the method because there may occur ambiguity.
 */
package com.oops.polymorphism;

public class CompiletimeReturnTypeAmbiguity {

	/*
	 * int sum(int a, int b) { System.out.println(a + b); }
	 * 
	 * double sum(int a, int b) { System.out.println(a + b); }
	 */

	public static void main(String args[]) {
		CompiletimeReturnTypeAmbiguity obj = new CompiletimeReturnTypeAmbiguity();
		//int result = obj.sum(30, 20); // Compile Time Error 

	}
}
