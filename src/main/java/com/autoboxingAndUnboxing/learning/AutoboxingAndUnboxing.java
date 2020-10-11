package com.autoboxingAndUnboxing.learning;

/**
 * Autoboxing and Unboxing
 * 
 * The automatic conversion of primitive data types into its equivalent Wrapper
 * type is known as boxing and opposite operation is known as unboxing. This is
 * the new feature of Java5. So java programmer doesn't need to write the
 * conversion code.
 * 
 * No need of conversion between primitives and Wrappers manually so less coding
 * is required.
 */
public class AutoboxingAndUnboxing {
	public static void main(String args[]) {
		int a = 50;
		// Boxing
		Integer a2 = new Integer(a);
		// Boxing
		Integer a3 = 5;
		System.out.println(a2 + " " + a3);

		// The automatic conversion of wrapper class type into corresponding primitive
		// type, is known as Unboxing.
		Integer i = new Integer(50);
		int intB = i;
		System.out.println(a);
		// unboxing internally
		if (i < 100) {
			System.out.println(i);
		}
	}
}
