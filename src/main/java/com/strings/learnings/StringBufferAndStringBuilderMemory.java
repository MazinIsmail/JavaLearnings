package com.strings.learnings;

/**
 * StringBuffer is mutable means one can change the value of the object. The
 * object created through StringBuffer is stored in the heap. StringBuffer has
 * the same methods as the StringBuilder, but each method in StringBuffer is
 * synchronized that is StringBuffer is thread safe. Due to this it does not
 * allow two threads to simultaneously access the same method. Each method can
 * be accessed by one thread at a time .
 *
 * StringBuilder is same as the StringBuffer, that is, it stores the object in
 * heap and it can also be modified. The main difference between the
 * StringBuffer and StringBuilder is that StringBuilder is also not thread safe.
 * StringBuilder is fast as it is not thread safe .
 */
public class StringBufferAndStringBuilderMemory {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Mazin");
		System.out.println("Hashcode for StringBuffer: " + stringBuffer.hashCode());
		stringBuffer.append(" Ismail");
		System.out.println("Hashcode for StringBuffer: " + stringBuffer.hashCode());
		stringBuffer.insert(0, "I'm ");
		System.out.println("Hashcode for StringBuffer: " + stringBuffer.hashCode());
		System.out.println();

		stringBuffer = new StringBuffer("Bye");
		System.out.println("Hashcode for new StringBuffer: " + stringBuffer.hashCode());
		// when new is used, new memory is allocated
		System.out.println();

		StringBuilder stringBuilder = new StringBuilder("Hello");
		// The above object too is stored in the heap and its value can be modified
		System.out.println("Hashcode for StringBuilder: " + stringBuilder.hashCode());
		stringBuilder.append(" from String Builder");
		System.out.println("Hashcode for StringBuilder: " + stringBuilder.hashCode());

		System.out.println();
		System.out.println("Hashcode will only differ when a new is created.");

	}
}
