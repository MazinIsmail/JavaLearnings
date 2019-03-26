package com.finalModifier.learnings;

/****
 * A final variable final int THRESHOLD = 5; 
 * A blank final variable final * int THRESHOLD;
 * A final static variable PI static final double PI = * 3.141592653589793;
 * A blank final static variable static final double PI;
 ****/

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
		/*MINIMUM = -1;*/
		System.out.println(MINIMUM);
	}

	public FinalVariable(int a) {
		// again assign value into same variable, compile time error occured
		/*MINIMUM = a;*/
		System.out.println(MINIMUM);
	}

	public static void main(String args[]) {

		// FinalVariable a=new FinalVariable();
		FinalVariable B = new FinalVariable(10);
		FinalVariable c = new FinalVariable(20);

		// System.out.println(a.CAPACITY);
	}
}