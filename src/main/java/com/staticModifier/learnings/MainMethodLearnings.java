package com.staticModifier.learnings;

import java.util.Arrays;

/**
 * Concept of “overriding” is only for instance methods not for Static.
 * 
 * You can make the main() method final in Java.
 * 
 * We can not change the return type of the main() method in Java. It should be
 * void.
 */
public class MainMethodLearnings {

	/** Actual main method with String[] args **/
	public static void main(String[] args) {
		System.out.println("String[] args main method called");
		main(new Double[] { 1.0, 2.0, 3.0 });
	}

	/** Overloaded main method with Double[] args **/
	public static void main(Double[] args) {
		System.out.println("Double[] args main method called");
		System.out.println(Arrays.toString(args));
	}

	// Using synchronized keyword with main() method
	public static synchronized void main(int args) {
		System.out.println("Valid to use synchronized keyword with main() method");
	}

}
