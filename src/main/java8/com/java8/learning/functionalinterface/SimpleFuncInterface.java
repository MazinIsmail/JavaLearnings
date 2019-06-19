package com.java8.learning.functionalinterface;

/**
 * Functional Interface should contain only one abstract method. It can contain
 * any number of default and static methods. Functional Interface is also called
 * as Single Abstract Method(SAM) Interface. It is not mandatory to mention the
 * annotation @FunctionalInterface if the interface contains exactly only one
 * abstract method, by default Compiler will consider it as FunctionalInterface
 * but if the interface is mentioned as FuntionalInterface, then it should
 * contain only one abstract method and can contain any number of default and
 * static methods. It can also override any one (only one) of the
 * java.lang.Object's method along with one Abstract method.
 */
@FunctionalInterface
public interface SimpleFuncInterface {
	// Can and should have one and only one abstract method
	public void doWork();

	// Can also declare the abstract methods from the java.lang.Object
	public String toString();

	// public void Object();

	// public int hashCode();

	// public boolean equals(Object obj);

	// Object clone() throws CloneNotSupportedException;

	// Can't override final methods from java.lang.Object
	/*
	 * public final Class getClass();
	 * 
	 * public final void notify();
	 * 
	 * public final void notifyAll();
	 */

	// Can have any number of default and static methods
	default void doSomeWork() {
		System.out.println("Doing some work in interface impl...");
	}

	default void doSomeOtherWork() {
		System.out.println("Doing some other work in interface impl...");
	}

	static void simple() {
		System.out.println("Inside static simple method");
	}

	static void simpleStatic() {
		System.out.println("Inside static simpleStatic method");
	}
}
