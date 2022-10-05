package com.java8.learning.interfacelearning;

/**
 * Static methods and default methods in interfaces. Can have any number of
 * default and static methods.
 */
public interface InterfaceLearning {
	double calculate(int a);

	// For "default" methods, I can override this, if I want to.
	default double sqrt(int a) {
		return Math.sqrt(positive(a));
	}

	default void defaultDisplay() {
		System.out.println("Inside default Display method");
	}

	/*
	 * Similar to default method except that we can't override them in the
	 * implementation classes.
	 */
	static int positive(int a) {
		return a > 0 ? a : 0;
	}

	static void staticDisplay() {
		System.out.println("Inside static Display method");
	}
}
