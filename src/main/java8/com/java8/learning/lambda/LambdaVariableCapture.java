package com.java8.learning.lambda;

/**
 * A Java lambda expression is capable of accessing variables declared outside
 * the lambda function body under certain circumstances.
 * 
 * Java lambdas can capture the following types of variables:
 * 
 * 1. Local variables
 * 
 * 2. Instance variables
 * 
 * 3. Static variables
 */
public class LambdaVariableCapture {

	private int instanceVariable; // instance variable
	private static int staticVariable; // static variable

	public static void main(String[] args) {

	}

	public static void localVariableCapture() {
		/**
		 * Local Variable Capture
		 * 
		 * A Java lambda can capture the value of a local variable declared outside the
		 * lambda body.
		 */
		String myString = "Test";
		// myString = "Test1";
		/*
		 * the lambda body now references the local variable myString which is declared
		 * outside the lambda body. This is possible if, and only if, the variable being
		 * references is "effectively final", meaning it does not change its value after
		 * being assigned. If the myString variable had its value changed later, the
		 * compiler would complain about the reference to it from inside the lambda
		 * body.
		 */
		FactorySample factorySampleLocalVariableCapture = (chars) -> {
			return myString + ":" + new String(chars);
		};
	}

	/**
	 * Instance Variable Capture
	 * 
	 * A lambda expression can also capture an instance variable in the object that
	 * creates the lambda. It is even possible to change the value of the instance
	 * variable after its capture - and the value will be reflected inside the
	 * lambda.
	 * 
	 * The semantics of this is actually one of the areas where Java lambdas differ
	 * from anonymous implementations of interfaces. An anonymous interface
	 * implementation can have its own instance variables which are referenced via
	 * the this reference. However, an lambda cannot have its own instance
	 * variables, so this always points to the enclosing object.
	 */
	public void instanceVariableCapture() {
		FactorySample factorySampleInstanceVariableCapture = (chars) -> {
			System.out.println("Instance Value:" + this.instanceVariable);
			return new String(chars);
		};
	}

	/*
	 * The fundamental difference between a field and a local variable is that the
	 * local variable is copied when JVM creates a lambda instance. On the other
	 * hand, fields can be changed freely, because the changes to them are
	 * propagated to the outside class instance as well.
	 */

	/**
	 * Static Variable Capture
	 * 
	 * A Java lambda expression can also capture static variables. This is not
	 * surprising, as static variables are reachable from everywhere in a Java
	 * application, provided the static variable is accessible (packaged scoped or
	 * public).
	 * 
	 * The value of a static variable is also allowed to change after the lambda has
	 * captured it.
	 */
	public void staticVariableCapture() {
		FactorySample factorySampleStaticVariableCapture = (chars) -> {
			System.out.println("Static Value:" + this.staticVariable);
			return new String(chars);
		};
	}
}
