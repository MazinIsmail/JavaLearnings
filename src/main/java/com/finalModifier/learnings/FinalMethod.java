package com.finalModifier.learnings;

public class FinalMethod {
	final void m1() {
		System.out.println("This is a final method.");
	}
}

class B extends FinalMethod {
	// COMPILE-ERROR! Can't override.
	/*void m1() {
		System.out.println("Illegal!");
	}*/
}
