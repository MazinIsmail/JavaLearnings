package com.strings.learnings;
/**
 * StringBuffer is mutable means one can change the value of the object . The
 * object created through StringBuffer is stored in the heap . StringBuffer has
 * the same methods as the StringBuilder , but each method in StringBuffer is
 * synchronized that is StringBuffer is thread safe . Due to this it does not
 * allow two threads to simultaneously access the same method . Each method can
 * be accessed by one thread at a time .
 *
 *
 * StringBuilder is same as the StringBuffer , that is it stores the object in
 * heap and it can also be modified . The main difference between the
 * StringBuffer and StringBuilder is that StringBuilder is also not thread safe.
 * StringBuilder is fast as it is not thread safe .
 */
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Salbin");
		System.out.println(" Hashcode for the string '" + s + "' is :" + s.hashCode());
		// The above object stored in heap and its value can be changed .
		s.append(" Antoney");
		System.out.println(" Hashcode for the string '" + s + "' is :" + s.hashCode()); // returns Hello Salbin

		s.insert(0, "I'm ");
		System.out.println(" Hashcode for the string '" + s + "' is :" + s.hashCode());

		s = new StringBuffer("Bye");
		System.out.println(" Hashcode for the string '" + s + "' is :" + s.hashCode());
		// Above statement is right as it modifies the value which is allowed in
		// the StringBuffer

		System.out.println("\n");
		System.out.println("**StringBuilder**"); // returns Hello Salbin
		StringBuilder demo = new StringBuilder("Hello");
		// The above object too is stored in the heap and its value can be modified
		System.out.println(" Hashcode for the string '" + demo + "' is :" + s.hashCode());
		demo.append(" from String Builder");
		// Above statement is right as it modifies the value which is allowed in
		// the StringBuilder
		System.out.println(" Hashcode for the string '" + demo + "' is :" + s.hashCode());

	}
}
