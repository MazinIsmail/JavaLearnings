package com.java8.learning.lambda;

/**
 * Parameters have to match the parameters of the method on the single method
 * interface.
 */

/**
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
public class LambdaParameters {

}
