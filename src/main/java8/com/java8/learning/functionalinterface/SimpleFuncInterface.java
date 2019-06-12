package com.java8.learning.functionalinterface;

@FunctionalInterface
public interface SimpleFuncInterface {
	// Can and should have one and only one abstract method
	public void doWork();

	// Can also declare the abstract methods from the java.lang.Object
	public String toString();
	public boolean equals(Object o);

	// Can have any number of default and static methods
	default void doSomeWork() {
		System.out.println("Doing some work in interface impl...");
	}

	default void doSomeOtherWork() {
		System.out.println("Doing some other work in interface impl...");
	}
}
