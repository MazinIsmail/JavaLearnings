package com.staticModifier.learnings;

public class StaticBlockDemo {

	// static variable
	static int a = 10;
	static int b;

	/**
	 * static block static block is executed only once: the first time you make an
	 * object of that class or the first time you access a static member of that
	 * class
	 */
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}

}
