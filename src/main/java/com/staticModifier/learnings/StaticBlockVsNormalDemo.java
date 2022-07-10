package com.staticModifier.learnings;

public class StaticBlockVsNormalDemo {

	{
		System.out.println("In local block");
	}

	{
		System.out.println("In local block2");
	}

	static {
		System.out.println("In static block");
	}

	static {
		System.out.println("In static block 2");
	}

	void method1() {
		System.out.println("method1");
	}

	/**
	 * Can we have multiple static blocks in our code? Yes, we can have more than
	 * one static block in our code. It will be executed in the same order it is
	 * written. Static block will be called only once while loading and it cannot
	 * have any return type, or any keywords (this or super). Mostly the static
	 * block will be used for initializing the variables.
	 */
	public static void main(String args[]) {
		System.out.println("In main");
		StaticBlockVsNormalDemo demo = new StaticBlockVsNormalDemo();
		demo.method1();
	}

}
