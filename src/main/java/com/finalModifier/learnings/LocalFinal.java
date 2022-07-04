package com.finalModifier.learnings;

public class LocalFinal {

	// final and static variable
	static final double rate = 2.5;

	public static void main(String args[]) {
		/*
		 * Mandatory to initialize a final variable either during declaration or after
		 * declaration. If we leave it uninitialized, then we will get a compilation
		 * error.
		 */
		// local blank final variable
		final int i;
		i = 20;
		System.out.println(i);

		// local final variable
		final int number = 10;

	}
}