package com.strings.learnings;

/**
 * Thanks to the immutability of Strings in Java, the JVM can optimize the
 * amount of memory allocated for them by storing only one copy of each literal
 * String in the pool. This process is called interning.
 * 
 * When we create a String variable and assign a value to it, the JVM searches
 * the pool for a String of equal value. If found, the Java compiler will simply
 * return a reference to its memory address, without allocating additional
 * memory.
 */
public class StringLiteralVSStringObject {
	public static void main(String[] args) {
		// String object using the new() operator, it always creates a new object in
		// heap memory.
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println("Hash code of String s1: " + s1.hashCode());
		System.out.println("Hash code of String s2: " + s2.hashCode());
		// Hashcode may or may not be same, if the memories are different.
		System.out.println("s1 == s2 :: " + (s1 == s2));
		System.out.println("[s1 and s2 refers to two different memory location]");
		System.out.println("Brand new object will be created on Heap and different references.\n");

		/*
		 * If we create an object using String literal syntax, it may return an existing
		 * object from the String pool, if it already exists. Otherwise, it will create
		 * a new String object and put in the string pool for future re-use.
		 */
		String s3 = "Test";
		String s4 = "aaaa";
		String s5 = "aaaa";
		System.out.println("Hash code of String s3: " + s3.hashCode());
		System.out.println("Hash code of String s4: " + s4.hashCode());
		System.out.println("Hash code of String s5: " + s5.hashCode());
		System.out.println("s3 == s4: " + (s3 == s4));
		System.out.println("s4 == s5: " + (s4 == s5));
		/*
		 * The above statement tries to get the same memory but if you change the value
		 * it will pick different memory. If you create strings using new, it always use
		 * a new memory to allocated. Both have same value so it will be treated as
		 * String literal and pooled. Because both references points to same object, ==
		 * returns true.
		 */
		s5 = "bbbb";
		System.out.println("Changed s5, s4 == s5: " + (s4 == s5));

		System.out.println("s1.equals(s2): " + s1.equals(s2));

	}

}
