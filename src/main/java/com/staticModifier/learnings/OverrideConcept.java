package com.staticModifier.learnings;

class Parent {

	public static void display() {
		System.out.println("Parent: Welcome to display method.");
	}

	public void show() {
		System.out.println("Parent: Welcome to Parent Class");
	}

	/*
	 * When the Child class also has defined the same static method like Parent
	 * class, then the method in the Child class hides the method in the Parent
	 * class
	 */
}

public class OverrideConcept extends Parent {
	public static void display() {
		System.out.println("Welcome to Child class");
	}

	public void show() {
		System.out.println("Welcome to Child class");
	}

	public static void main(String args[]) {
		// Assign Child class object to Parent reference
		Parent parent = new OverrideConcept();
		parent.display();
		/*
		 * As per overriding in Java, the display() method of the Child class should be
		 * called, since it is a static method overriding will not happen here and hence
		 * the Parent class display() method is called here. We cannot Override a static
		 * method in Java.
		 */
		parent.show();
		OverrideConcept child = new OverrideConcept();
		child.display();

	}
}
