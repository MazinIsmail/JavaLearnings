package com.staticModifier.learnings;

public class BasicStatic {

	{
		System.out.println("In local block");
	}

	// before main method
	static {
		System.out.println("In static block");
	}

	// constructor
	public BasicStatic() {
		System.out.println("Constructor");
	}

	// normal method
	public void method1() {
		System.out.println("normal method");
	}

	public static void main(String args[]) {
		System.out.println("In main");
		BasicStatic basicStatic = new BasicStatic();
		basicStatic.method1();
	}

}
