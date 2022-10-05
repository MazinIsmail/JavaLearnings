package com.oops.basics;

public class DataTypesIntegersLearnings {

	public static void main(String[] args) {
		byteLearnings();
		shortLearnings();
		intLearnings();
		longLearnings();
	}

	/*
	 * byte is 4 times smaller than an integer.
	 */
	private static void byteLearnings() {
		System.out.println("\nbyte learning:-");
		// Range: -128 to 127 (inclusive)
		byte a = 10;
		byte b = -20;
		byte c = -128;
		byte d = 127;
		// Cycles forward from lower limit
		byte e = (byte) 130;
		// Cycles backward from upper limit
		byte f = (byte) -129;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

	/*
	 * A short data type is 2 times smaller than an integer.
	 */
	private static void shortLearnings() {
		System.out.println("\nshort learning:-");
		// Range: -32,768 to 32,767 (inclusive)
		short a = 10;
		short b = -3320;
		short c = -15328;
		short d = -32768;
		// Cycles forward from lower limit
		short e = (short) 32768;
		// Cycles backward from upper limit
		short f = (short) -32769;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

	private static void intLearnings() {
		System.out.println("\nint learning:-");
		// Range: -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive).
		int a = 10000;
		int b = 2453320;
		int c = -15334628;
		int d = Integer.MAX_VALUE;
		// Cycles forward from lower limit
		int e = (int) Integer.MAX_VALUE + 1;
		// Cycles backward from upper limit
		int f = (int) Integer.MIN_VALUE - 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

	private static void longLearnings() {
		System.out.println("\nlong learning:-");
		// Range: -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63
		// -1)(inclusive)
		long a = 10000;
		long d = Long.MAX_VALUE;
		// Cycles forward from lower limit
		long e = (long) Long.MAX_VALUE + 1;
		// Cycles backward from upper limit
		long f = (long) Long.MIN_VALUE - 1;
		System.out.println(a);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
