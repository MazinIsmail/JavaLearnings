package com.autoboxingAndUnboxing.learning;

/**
 * There are some rules for method overloading with boxing:-
 * 
 * Widening beats boxing
 * 
 * Widening beats varargs
 * 
 * Boxing beats varargs
 */
public class AutoboxingAndUnboxingWithMethodOverloading {

	public static void main(String args[]) {
		// If there is possibility of widening and boxing, widening beats boxing.
		short s = 30;
		wideningAndBoxing(s);

		// If there is possibility of widening and varargs, widening beats var-args.
		short s1 = 30, s2 = 40;
		wideningAndVarargs(s1, s2);

		// boxing beats variable argument
		int a = 30;
		boxingBeatsVariable(a);

		// Widening and Boxing can't be performed
		int ab = 30;
		// wideningAndBoxingTogther(ab);
	}

	// static void wideningAndBoxingTogther(Long l){System.out.println("Long");}

	static void wideningAndBoxing(int i) {
		System.out.println("int");
	}

	static void wideningAndBoxing(Integer i) {
		System.out.println("Integer");
	}

	static void wideningAndVarargs(int i, int i2) {
		System.out.println("int int");
	}

	static void wideningAndVarargs(Integer... i) {
		System.out.println("Integer...");
	}

	static void boxingBeatsVariable(Integer i) {
		System.out.println("Integer");
	}

	static void boxingBeatsVariable(Integer... i) {
		System.out.println("Integer...");
	}

}
