package com.oops.inheritance;

/**
 * In Java, a class cannot directly access the grandparent's members, compiler
 * error occurs in Java. We can access grandparent's members only through the
 * parent class.
 */
class Grandparent {
	public void print() {
		System.out.println("Grandparent's Print()");
	}
}

class Parent extends Grandparent {

	@Override
	public void print() {
		super.print();
		System.out.println("Parent's Print()");
	}

	public void printParent() {
		System.out.println("Parent's Print() specifically");
	}

	private void printPrivateParent() {
		System.out.println("Parent's Print() specifically");
	}
}

class Child extends Parent {

	@Override
	public void print() {
		// Trying to access Grandparent's Print() Compiler Error occurs
		// super.super.Print();
		super.print();
		super.printParent();
		// super.printPrivateParent()
		System.out.println("Child's Print()");
	}

	public void printChild() {
		System.out.println("Child's Print() specifically");
	}
}

public class SuperSuperKeywordDemo1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		c.printParent();
	}
}