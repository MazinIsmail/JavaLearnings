package com.staticModifier.learnings;

public class StaticVariable {
	// static variable
	static double demo = 140;

	// instance variable
	int i = 2;

	public static void main(String args[]) {
		// calling demo without creating any object of class Test
		System.out.println(demo);
		StaticVariable obj = new StaticVariable();
		// using object creation
		System.out.println(obj.i);
	}
}
