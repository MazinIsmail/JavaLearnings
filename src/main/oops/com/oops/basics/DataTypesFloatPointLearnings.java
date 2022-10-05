package com.oops.basics;

public class DataTypesFloatPointLearnings {
	public static void main(String[] args) {
		floatLearnings();
		doubleLearnings();
	}

	private static void floatLearnings() {
		System.out.println("float learning:-");
		float f1 = 234.5f;
		float f2 = Float.MAX_VALUE;
		float f3 = Float.MIN_VALUE;
		float f4 = Float.NEGATIVE_INFINITY;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
	}

	private static void doubleLearnings() {
		System.out.println("\ndouble learning:-");
		double f1 = 234.534635745347273248358358;
		double f2 = Double.MAX_VALUE;
		double f3 = Double.MIN_VALUE;
		double f4 = Double.NEGATIVE_INFINITY;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
	}
}
