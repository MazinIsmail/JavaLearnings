package com.oops.polymorphism;

/*
*/
class ChildCextendsA extends ParentA {

	// overriding m1()
	// @Override - Not necessary to have but its helps to have.
	public void m1() {
		System.out.println("Inside Child C's m1 method");
	}

	// @Override - Does not make sense in here.
	public void m4() {
		System.out.println("Inside Child C's m1 method");
	}
}