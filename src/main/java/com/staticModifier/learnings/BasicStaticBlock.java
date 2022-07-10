package com.staticModifier.learnings;

public class BasicStaticBlock {

	{
		System.out.println("In local block");
	}

	// before main method
	static {
		System.out.println("In static block");
	}

	// constructor
	public BasicStaticBlock() {
		System.out.println("Constructor");
	}

	// normal method
	public void method1() {
		System.out.println("normal method");
	}

	public static void main(String args[]) {
		System.out.println("In main");
		BasicStaticBlock basicStatic = new BasicStaticBlock();
		basicStatic.method1();
	}

}
