package com.oops.basics;

/**
 * A child class cannot be used as a reference to an object of super
 * class.Compilation error will occur
 */
public class ChildClassesReference {

	void myMethod() {
		System.out.println("GeeksforGeeks");
	}
}

class Derived extends ChildClassesReference {

	public static void main(String[] args) {
		ChildClassesReference object = new ChildClassesReference();
		object.myMethod();
	}
}
