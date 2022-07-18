package com.staticModifier.learnings;

class Parent {

	public static void display() {
		System.out.println("Parent: Welcome to display method.");
	}

	public void show() {
		System.out.println("Parent: Welcome to Parent Class");
	}

}

/**
 * When the Child class also has defined the same static method like Parent
 * class, then the method in the Child class hides the method in the Parent
 * class
 */
public class OverrideStaticMethodChild extends Parent {
	public static void display() {
		System.out.println("OverrideStaticMethodChild: Welcome to Child class");
	}

	public void show() {
		System.out.println("OverrideStaticMethodChild: Welcome to Child class");
	}

	public static void main(String args[]) {

		Parent parent = new Parent();
		parent.display();
		parent.show();

		OverrideStaticMethodChild child = new OverrideStaticMethodChild();
		child.display();
		child.show();

		System.out.println("parentChild: -");
		// Assign Child class object to Parent reference
		Parent parentChild = new OverrideStaticMethodChild();

		/*
		 * As per overriding in Java, the display() method of the Child class should be
		 * called, but since it is a static method overriding, it will not happen here
		 * and hence the Parent class display() method is called here. We cannot
		 * Override a static method in Java.
		 */
		parentChild.display();

		// Child will be showed as it is non-static and the child class is created.
		parentChild.show();

	}
}
