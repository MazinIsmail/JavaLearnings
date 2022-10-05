package com.oops.polymorphism;

class ChildBextendsA extends ParentA {

	public int x = 20;

	// overriding m1()
	@Override
	public void m1() {
		System.out.println("Inside Child B's m1 method");
	}
}
