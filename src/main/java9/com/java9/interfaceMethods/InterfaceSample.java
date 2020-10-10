package com.java9.interfaceMethods;

public interface InterfaceSample {

	default void say() {
		saySomething();
		sayPolitely();
	}

	// Private method inside interface
	private void saySomething() {
		System.out.println("I'm private method");
	}

	// Private static method inside interface
	private static void sayPolitely() {
		System.out.println("I'm private static method");
	}
}
