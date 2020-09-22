package com.java8.learning.functionalinterface;

import java.util.function.Function;

/**
 * The Java Function interface (java.util.function.Function) interface is one of
 * the most central functional interfaces in Java. The Function interface
 * represents a function (method) that takes a single parameter and returns a
 * single value.
 */
public class FunctionInterface {

	/**
	 * 
	 * Here is how the Function interface definition looks:
	 * 
	 * public interface Function<T,R> {
	 * 
	 * public <R> apply(T parameter);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		/**
		 * Represents a function that accepts one argument and produces a result.
		 * 
		 * This is a functional interface whose functional method is apply(Object).
		 * 
		 * Type Parameters:
		 * 
		 * <T> the type of the input to the function
		 * 
		 * <R> the type of the result of the function
		 */
		Function<Long, Long> adder = (value) -> value + 3;
		Long resultLambda = adder.apply((long) 8);
		System.out.println("resultLambda = " + resultLambda);
	}
}
