package com.oops.inheritance;

/**
 * extends is the keyword used to inherit the properties of a class.
 * 
 * The super keyword is similar to this keyword: -
 * 
 * It is used to differentiate the members of superclass from the members of
 * subclass, if they have same names.
 * 
 * It is used to invoke the superclass constructor from subclass. (Check basics
 * package "SuperSuperKeywordDemo1")
 */
public class ChildBExtendsA extends ParentA {
	int num = 10;

	// display method of sub class
	public void display() {
		System.out.println("This is the display method of subclass");
	}

	public void m1() {

		int num = 10;

		// Instantiating subclass
		ChildBExtendsA childBExtendsA = new ChildBExtendsA();
		// debug tester
		num++;
		// Invoking the display() method of sub class
		childBExtendsA.display();

		// Invoking the display() method of superclass
		super.display();

		++num;
		// printing the value of variable num of subclass
		System.out.println("Child class num: " + childBExtendsA.num);
		System.out.println("Child class num: " + this.num);
		System.out.println("Local method num: " + num);

		// printing the value of variable num of superclass
		System.out.println("Parent class num: " + super.num);
	}

	public static void main(String args[]) {
		ChildBExtendsA obj = new ChildBExtendsA();
		obj.m1();
	}

}
