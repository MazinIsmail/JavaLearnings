package com.finalModifier.learnings;

public class FinalMethod {
	final void m1() {
		System.out.println("This is a final method.");
	}

	void m2() {
		System.out.println("This is a non-final method.");
	}
}

/**
 * If we declare a method as final, then it cannot be overridden by any
 * subclasses. In other words, the final classes can not be inherited by other
 * classes.
 * 
 * The purpose of creating the final methods is to restrict the unwanted and
 * improper use of method definition while overriding the method.
 */
class B extends FinalMethod {
	// COMPILE-ERROR! Can't override.

	/**
	 * void m1() { System.out.println("Illegal!"); }
	 */

	void m2() {
		System.out.println("Legal!");
	}
}
