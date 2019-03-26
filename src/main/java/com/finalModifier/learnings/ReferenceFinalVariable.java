package com.finalModifier.learnings;

/**
 * 
 * final means that you can’t change the object’s reference to point to another
 * reference or another object, but you can still mutate its state (using setter
 * methods e.g).
 *
 * By declaring a reference variable as final, we won’t get any immutability
 * nature, Even though reference variable is final. We can perform any type of
 * change in the corresponding Object. But we cant perform reassignment for that
 * variable.
 *
 * final ensures that the address of the object remains the same
 */

public class ReferenceFinalVariable {
	public static void main(String[] args) {
		// a final reference variable sb
		final StringBuilder sb = new StringBuilder("Welcome");

		System.out.println(sb);

		// changing internal state of object
		// reference by final reference variable sb
		sb.append("Home");

		System.out.println(sb);
	}
}