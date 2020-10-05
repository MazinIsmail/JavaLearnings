package com.java8.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java lambda expressions are new in Java 8. Java lambda expressions are Java's
 * first step into functional programming. A Java lambda expression is thus a
 * function which can be created without belonging to any class. A Java lambda
 * expression can be passed around as if it was an object and executed on
 * demand.
 * 
 * Java lambda expressions are commonly used to implement simple event listeners
 * / callbacks, or in functional programming with the Java Streams API.
 * 
 * Java lambda expressions can only be used where the type they are matched
 * against is a single method interface.
 */
public class LambdaLearning {
	public static void main(String[] args) {

		/**
		 * Lambda Expressions vs. Anonymous Interface Implementations
		 * 
		 * The major difference is, that an anonymous interface implementation can have
		 * state (member variables) whereas a lambda expression cannot.
		 * 
		 * A lambda expression cannot have such fields. A lambda expression is thus said
		 * to be stateless.
		 * 
		 * MyEventConsumerSample implementation can have its own internal state. Look at
		 * this design:
		 */

		MyEventConsumerSample myEventConsumerSample = new MyEventConsumerSample() {
			private int eventCount = 0;

			public void consume(Object event) {
				System.out.println(event.toString() + " consumed " + this.eventCount++ + " times.");
			}
		};

		/**
		 * Parameters have to match the parameters of the method on the single method
		 * interface.
		 * 
		 * Zero Parameters:- If the method you are matching your lambda expression
		 * against takes no parameters, then you can write your lambda expression like
		 * this:
		 * 
		 * () -> System.out.println("Zero parameter lambda");
		 */

		/**
		 * One Parameter:- If the method you are matching your Java lambda expression
		 * against takes one parameter, you can write the lambda expression like this:
		 * 
		 * (param) -> System.out.println("One parameter: " + param); Notice the
		 * parameter is listed inside the parentheses.
		 * 
		 * When a lambda expression takes a single parameter, you can also omit the
		 * parentheses, like this:
		 * 
		 * param -> System.out.println("One parameter: " + param);
		 */

		/**
		 * Multiple Parameters:- If the method you match your Java lambda expression
		 * against takes multiple parameters, the parameters need to be listed inside
		 * parentheses. Here is how that looks in Java code:
		 * 
		 * (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
		 * Only when the method takes a single parameter can the parentheses be omitted.
		 */

		/**
		 * Parameter Types:- Specifying parameter types for a lambda expression may
		 * sometimes be necessary if the compiler cannot infer the parameter types from
		 * the functional interface method the lambda is matching. Don't worry, the
		 * compiler will tell you when that is the case. Here is a Java lambda parameter
		 * type example:
		 * 
		 * (Car car) -> System.out.println("The car is: " + car.getName()); As you can
		 * see, the type (Car) of the car parameter is written in front of the parameter
		 * name itself, just like you would when declaring a parameter in a method
		 * elsewhere, or when making an anonymous implementation of an interface.
		 */

		/**
		 * Lambda Function Body:- The body of a lambda expression, and thus the body of
		 * the function / method it represents, is specified to the right of the -> in
		 * the lambda declaration:
		 * 
		 * (oldState, newState) -> System.out.println("State changed")
		 * 
		 * If your lambda expression needs to consist of multiple lines, you can enclose
		 * the lambda function body inside the { } bracket which Java also requires when
		 * declaring methods elsewhere.
		 * 
		 * (oldState, newState) -> { System.out.println("Old state: " + oldState);
		 * System.out.println("New state: " + newState); }
		 */

		/**
		 * Returning a Value From a Lambda Expression:- You can return values from Java
		 * lambda expressions, just like you can from a method. You just add a return
		 * statement to the lambda function body.
		 * 
		 * (param) -> { System.out.println("param: " + param); return "return value"; }
		 * 
		 * (a1, a2) -> { return a1 > a2; }
		 * 
		 * (a1, a2) -> a1 > a2;
		 * 
		 * The compiler then figures out that the expression a1 > a2 is the return value
		 * of the lambda expression (hence the name lambda expressions - as expressions
		 * return a value of some kind).
		 */

		/**
		 * Lambdas as Objects:- A Java lambda expression is essentially an object. You
		 * can assign a lambda expression to a variable and pass it around, like you do
		 * with any other object.
		 * 
		 */
		MyComparatorSample myComparatorSample = (a1, a2) -> {
			return a1 > a2;
		};

		/*
		 * Above shows the definition of the lambda expression, how the lambda
		 * expression is assigned to variable, and finally how the lambda expression is
		 * invoked by invoking the interface method it implements.
		 */
		boolean result = myComparatorSample.compare(2, 5);

		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);

		names.sort((a, b) -> b.compareTo(a));
		System.out.println(names);
	}
}
