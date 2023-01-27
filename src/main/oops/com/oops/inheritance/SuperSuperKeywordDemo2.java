package com.oops.inheritance;

/**
 * In Java, we can access grandparent's members only through the parent class.
 */
class Grandparent1 {
	public void print() {
		System.out.println("Grandparent's Print()");
	}
}

class Parent1 extends Grandparent1 {
	public void print() {
		super.print();
		System.out.println("Parent's Print()");
	}
}

class Child1 extends Parent1 {
	public void print() {
		super.print();
		System.out.println("Child's Print()");
	}
}

public class SuperSuperKeywordDemo2 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.print();
		System.out.println();
		Parent1 p = new Parent1();
		p.print();
	}

}
