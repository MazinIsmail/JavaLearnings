package com.strings.learnings;

public class StringBuilderStringBufferBasics {

	public static void main(String[] args) {
		StringBuilder stringBuilderDemo = new StringBuilder("Hello");
		stringBuilderDemo.append(" World");
		System.out.println(stringBuilderDemo);

		StringBuffer stringBufferDemo = new StringBuffer("Foo");
		stringBufferDemo.append(" Boo");
		System.out.println(stringBufferDemo);
	}

}
