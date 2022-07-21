package com.oops.polymorphism;

/**
 * Runtime Polymorphism in Java is achieved by Method overriding
 * 
 * In this example, we are creating two classes RuntimePolymorphismMethodParent
 * and RuntimePolymorphismMethodChild. RuntimePolymorphismMethodChild class
 * extends RuntimePolymorphismMethodParent class and overrides its run() method.
 * We are calling the run method by the reference variable of Parent class.
 * Since it refers to the subclass object and subclass method overrides the
 * Parent class method, the subclass method is invoked at runtime.
 * 
 * Method invocation is determined by the JVM not compiler, it is known as
 * runtime polymorphism
 */
class RuntimePolymorphismMethodParent {
	void run() {
		System.out.println("RuntimePolymorphismMethodParent :: Inside run()");
	}
}

public class RuntimePolymorphismMethodChild extends RuntimePolymorphismMethodParent {

	void run() {
		System.out.println("RuntimePolymorphismMethodChild :: Inside run()");
	}

	public static void main(String[] args) {
		RuntimePolymorphismMethodParent runtimePolymorphismMethodParent = new RuntimePolymorphismMethodChild();
		runtimePolymorphismMethodParent.run();
	}
}
