package com.staticModifier.learnings;

public class OverloadExample {

	/**
	 * Can we Overload static methods in Java ? Yes, you can overload a static
	 * method in Java.
	 *
	 * We cannot overload two methods which differs in static keyword but has the
	 * same method signature. When we try to do so we will be getting ”Cannot make a
	 * static reference to the non-static method“ error.
	 */

	public static void disp() {
		System.out.println("disp() method without parameter called");
	}

	public static void disp(String name) {
		System.out.println("disp() method with parameter called : " + name);
	}

	public static void main(String args[]) {
		// Calling disp() method which has no parameter
		OverloadExample.disp();

		// Calling disp() method which has one parameter
		OverloadExample.disp("JavaInterviewPoint");
	}
}
