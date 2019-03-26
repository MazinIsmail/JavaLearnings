package com.staticModifier.learnings;

public abstract class AbstractTest {

	public static void disp() {
		System.out.println("disp of static method");
	}

	/*
	 * Since static method can be called directly, making it abstract would make it
	 * possible to call an undefined method which is of no use, hence it is not
	 * allowed.
	 */
	// public static abstract void disp2();

	public static void main(String[] args) {
//		AbstractTest abstractTest = new AbstractTest();
		AbstractTest.disp();

	}
}
