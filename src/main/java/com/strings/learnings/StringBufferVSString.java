package com.strings.learnings;

public class StringBufferVSString {

	public static void main(String[] args) {
		/**
		 * It will print false because s2 is not of type String. If you will look at the
		 * equals method implementation in the String class, you will find a check using
		 * instanceof operator to check if the type of passed object is String? If not,
		 * then return false.
		 */
		String s1 = "abc";
		StringBuilder s2 = new StringBuilder(s1);
		System.out.println("String with StringBuffer: " + s1.equals(s2));
		// Do not use == to check if values are equal
		System.out.println("String with StringBuffer converted to string: " + s1.equals(s2.toString()));

	}
}
