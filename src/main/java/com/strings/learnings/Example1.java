package com.strings.learnings;
public class Example1 {

	/**
	 * @param args
	 */
	private static void test(StringBuffer s) {
		s.append(" Boo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("Foo");

		test(s1);

		System.out.println(s1);

	}

	
}
