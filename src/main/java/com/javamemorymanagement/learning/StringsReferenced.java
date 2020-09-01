package com.javamemorymanagement.learning;

/**
 * The String type in Java is a bit differently treated. Strings are immutable,
 * meaning that each time you do something with a string, another object is
 * actually created on the heap. For strings, Java manages a string pool in
 * memory. This means that Java stores and reuse strings whenever possible.
 */
public class StringsReferenced {
	public static void main(String[] args) {
		String localPrefix = "297"; // 1
		String prefix = "297"; // 2
		if (prefix == localPrefix) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are different");
		}

		/**
		 * It turns out that after comparing the two references of the String type,
		 * those actually point to the same objects on the heap. However, this is not
		 * valid for Strings that are computed. Let’s assume that we have the following
		 * change in line //1 of the above code
		 */

		String localPrefixAgain = new Integer(297).toString(); // 1
		String prefixAgain = "297"; // 2
		if (prefixAgain == localPrefixAgain) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are different");
		}

		/**
		 * We can force the JVM to add it to the string pool by adding the .intern()
		 * method at the end of computed string:
		 * 
		 * A pool of strings, initially empty, is maintained privately by the class
		 * String.
		 * 
		 * When the intern method is invoked, if the pool already contains a string
		 * equal to this String object as determined by the equals(Object) method, then
		 * the string from the pool is returned. Otherwise, this String object is added
		 * to the pool and a reference to this String object is returned.
		 * 
		 * It follows that for any two strings s and t, s.intern() == t.intern() is true
		 * if and only if s.equals(t) is true.
		 */

		String localPrefixAgainIntern = new Integer(297).toString().intern(); // 1
		String prefixAgainCheck = "297"; // 2
		if (prefixAgainCheck == localPrefixAgainIntern) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are different");
		}
	}
}
