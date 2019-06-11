package com.java8.learning.interfacelearning;

/* Static methods and default methods in interfaces.*/
public interface InterfaceLearning {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(positive(a));
	}

	/*
	 * Similar to default method except that we can't override them in the
	 * implementation classes.
	 */
	static int positive(int a) {
		return a > 0 ? a : 0;
	}
}
