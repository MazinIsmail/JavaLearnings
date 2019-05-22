package com.strings.learnings;

public class Example3 {

	public static void main(String[] args) {
/**
 * It will print false because s2 is not of type String.
 * If you will look at the equals method implementation in the String class,
 * you will find a check using instanceof
 * operator to check if the type of passed object is String?
 * If not, then return false.
 */
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));

		String s = new String("foo");
		String str = new String("foo");
		
		System.out.println("Hash code of String s:"+ s.hashCode());
		System.out.println("Hash code of String str:"+ str.hashCode());
	}
}
