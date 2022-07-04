package com.finalModifier.learnings;

/**
 * Once we declare a variable with the final keyword, we can’t change its value
 * again. If we attempt to change the value of the final variable, then we will
 * get a compilation error.
 * 
 * Generally, we can consider a final variable as a constant, as the final
 * variable acts like a constant whose values cannot be changed.
 * 
 * We can’t just declare a variable as final without initializing it. If we
 * declare the final variable without initialization, then it is a blank final
 * variable.
 * 
 * But it is mandatory to initialize a final variable either during declaration
 * or after declaration. If we leave it uninitialized, then we will get a
 * compilation error.
 */
public class FinalVariable {
	// a final variable
	// direct initialize
	final int THRESHOLD = 5;

	// a blank final variable
	final int CAPACITY;

	// another blank final variable
	final int MINIMUM;

	// a final static variable PI
	// direct initialize
	static final double PI = 3.141592653589793;

	// a blank final static variable
	static final double EULERCONSTANT;

	{

	}

	// initializing CAPACITY
	{
		CAPACITY = 25;
		MINIMUM = 80;
		System.out.println(MINIMUM);
	}

	// static initializer block for
	// initializing EULERCONSTANT
	static {
		EULERCONSTANT = 2.3;
	}

	// constructor for initializing MINIMUM
	// Note that if there are more than one
	// constructor, you must initialize MINIMUM
	// in them also
	public FinalVariable() {

		// again assign value into same variable, compile time error occured
		/* MINIMUM = -1; */
		System.out.println(MINIMUM);
	}

	public FinalVariable(int a) {
		// again assign value into same variable, compile time error occured
		/* MINIMUM = a; */
		System.out.println(MINIMUM);
	}

	public static void main(String args[]) {

		// FinalVariable a=new FinalVariable();
		FinalVariable finalVariable = new FinalVariable(10);
		finalVariable = new FinalVariable(20);

		System.out.println(finalVariable.CAPACITY);
	}
}