package com.strings.learnings;

/**
 * String is immutable ( Once created can not be changed) object, if you try to
 * alter their values, another object gets created. The object created as a
 * String is stored in the Constant String Pool. Every immutable object in Java
 * is thread safe, that implies String is also thread safe. String can not be
 * used by two threads simultaneously. String once assigned can not be changed.
 */
public class StringLearings {

	public static void main(String[] args) {

		String string1 = "Hello";
		// The above object is stored in constant string
		// pool and its value can not be modified.
		System.out.println("Old string1: " + string1.hashCode());
		string1 = string1 + "World";
		System.out.println("New string1: " + string1.hashCode());

		// string is created in constant pool and referenced by the demo variable
		// "hello" string still exists in string constant pool
		// and its value is not overridden but we lost reference to the "hello" string
		System.out.println();

		String string2 = "Hello";
		System.out.println("String2 is in memory :" + string2.hashCode());
		System.out.println("String1 is in memory :" + string1.hashCode());

		// When you do a new it will check the pool for same hashcode
		String string3 = new String("Hello");
		System.out.println("String3 is in memory :" + string3.hashCode());
		string3 = string3 + "Mazin";
		System.out.println("String3 is in memory post value change :" + string3.hashCode());

	}

}
