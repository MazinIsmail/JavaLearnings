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
/*
 * public class Derived extends ChildClassasReference { void myMethod() {
 * System.out.println("GFG"); }
 * 
 * public static void main(String[] args) { Derived object = new
 * ChildClassasReference(); object.myMethod(); } }
 */
