package com.oops.polymorphism;

/**
 * Compile Time Polymorphism - Static Polymorphism
 * 
 * Compile-time polymorphism is achieved through method overloading.
 * 
 * Create multiple methods of the same name in the same class. It is always the
 * number of arguments and the type of arguments that differs.
 * 
 * number of arguments and the type of arguments
 * number of arguments and the type of arguments
 * number of arguments and the type of arguments
 */
public class CompileTimeMethodOverloading {

	void sum(int a, int b) {
		System.out.println("have 2 args " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("have 3 args " + (a + b + c));
	}

	void sum(String a, String b) {
		System.out.println("have 2 String args " + (a + b));
	}

	public static void main(String[] args) {
		CompileTimeMethodOverloading obj = new CompileTimeMethodOverloading();
		obj.sum(10, 10);
		obj.sum(10, 10, 10);
		obj.sum("20", "20");
	}

}
