package com.oops.polymorphism;

/*Method overriding is one of the ways in which Java supports Runtime Polymorphism (Dynamic Polymorphism).*/
public class CompiletimePolymorphismDemo {

	public static void main(String args[]) {
		// object of type A
		ClassA a = new ClassA();

		// object of type B
		ClassBextendsA b = new ClassBextendsA();

		// Data member of class A will be accessed
		/*
		 * In Java, we can override methods only, not the variables (data members), so
		 * runtime polymorphism cannot be achieved by data members.
		 */
		System.out.println(a.x);

		// object of type C
		ClassCextendsA c = new ClassCextendsA();

		// obtain a reference of type A which is null
		ClassA ref;

		// ref refers to an A object
		ref = a;

		// calling A's version of m1()
		ref.m1();

		// now ref refers to a B object
		ref = b;

		// calling B's version of m1()
		ref.m1();

		// now ref refers to a C object
		ref = c;

		// calling C's version of m1()
		ref.m1();
	}
}
