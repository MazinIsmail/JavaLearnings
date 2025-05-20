package com.oops.polymorphism;

/**
 * A child class cannot be used as a reference to an object of super class.
 * Compilation error will occur
 */
class ParentClassesReference {
	void myMethod() {
		System.out.println("GeeksforGeeks");
	}

	void myMethodAgain() {
		System.out.println("GeeksforGeeks Again");
	}
}

public class ChildClassesReference extends ParentClassesReference {

	@Override
	void myMethodAgain() {
		System.out.println("GeeksforGeeks Again from Derived");
	}

	public static void main(String[] args) {
		// Same class assigned to same class
		ParentClassesReference object = new ParentClassesReference();
		object.myMethod();
		object.myMethodAgain(); // ???

		// Same class assigned to same class
		ChildClassesReference child = new ChildClassesReference();
		child.myMethod(); // ???
		child.myMethodAgain();

		// Creating a object of child and Assigning to parent class
		ParentClassesReference childAgain = new ChildClassesReference();
		childAgain.myMethod();
		childAgain.myMethodAgain();

		// ChildClassesReference childHold = new ParentClassesReference();
	}
}
