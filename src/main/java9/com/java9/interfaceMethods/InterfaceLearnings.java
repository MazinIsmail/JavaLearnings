package com.java9.interfaceMethods;

/**
 * In Java 9, we can create private methods inside an interface. Interface
 * allows us to declare private methods that help to share common code between
 * non-abstract methods.
 * 
 * Before Java 9, creating private methods inside an interface cause a compile
 * time error.
 * 
 * We can also create private static methods inside an interface.
 */
public class InterfaceLearnings implements InterfaceSample {
	public static void main(String[] args) {
		InterfaceSample s = new InterfaceLearnings();
		s.say();
	}
}
