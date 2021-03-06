package com.oops.basics;

/**
 * In Java, a class cannot directly access the grandparentís members, compiler
 * error occurs in Java. We can access grandparentís members only through the
 * parent class.
 * 
 */
class Grandparent {
	public void print() {
		System.out.println("Grandparent's Print()");
	}
}

class Parent extends Grandparent {
	@Override
	public void print() {
		System.out.println("Parent's Print()");
	}
}

class Child extends Parent {
	@Override
	public void print() {
		super.print();
		// Trying to access Grandparent's Print() Compiler Error occurs
		// super.super.Print();
		System.out.println("Child's Print()");
	}
}

public class SuperSuperKeywordDemo1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
	}
}