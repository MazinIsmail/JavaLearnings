package com.oops.polymorphism;

/**
 * Subclass or a child class has the same method as declared in the parent
 * class.
 */
class ChildBextendsA extends ParentA {

	public int x = 20;

	/*
	 * Indicates that a method declaration is intended to override a method
	 * declaration in a supertype. Does a compile-time check.
	 */
	// overriding m1()
	@Override
	public void m1() {
		System.out.println("Inside Child B's m1 method");
	}
}
