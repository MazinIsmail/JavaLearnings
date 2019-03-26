package com.staticModifier.learnings;

public class BasicStatic {

	// object creation
	{
		System.out.println("In some random block");
	}

	// before main method
	static {
		System.out.println("In static block");
	}

	// constructor
	public BasicStatic() {
		System.out.println("Constructor");
	}

	// static method
	public void method1() {
		System.out.println("method1");
	}

	public static void main(String args[]) {
		System.out.println("In main");
		BasicStatic basicStatic = new BasicStatic();
		basicStatic.method1();
	}

}
