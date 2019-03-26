package com.staticModifier.learnings;

public class StaticVariable {
	// static variable
	static double demo = 140;

	// instance variable
	int i = 2;

	public static void main(String args[]) {
		// demo = 1000;
		System.out.println(demo);// calling demo without creating any object of class Test
		StaticVariable obj = new StaticVariable();
		System.out.println(obj.i);// using object creation
	}
}
