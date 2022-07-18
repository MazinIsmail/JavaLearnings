package com.staticModifier.learnings;

public class StaticVariable {

	// static variable
	private static double demo = 140;

	// instance variable
	private int i = 2;

	public static void main(String args[]) {
		// Calling demo without creating any object of class StaticVariable
		System.out.println("StaticVariable demo: " + StaticVariable.demo);

		StaticVariable obj1 = new StaticVariable();
		// Calling demo using object creation
		System.out.println("obj1 demo: " + obj1.demo);
		System.out.println();

		StaticVariable obj2 = new StaticVariable();
		StaticVariable.demo++;
		System.out.println("increased static variable");
		System.out.println("obj2 demo: " + obj2.demo);
		System.out.println("obj2 i" + ": " + obj2.i);
		obj2.i++;
		System.out.println("increased i variable of obj2");
		System.out.println("obj2 i" + ": " + obj2.i);
		System.out.println();

		StaticVariable obj3 = new StaticVariable();
		System.out.println("obj3 demo" + ": " + obj3.demo);
		System.out.println("obj3 i" + ": " + obj3.i);
	}
}
