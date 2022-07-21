package com.oops.polymorphism;

/**
 * Example of Method Overloading with TypePromotion in case ambiguity: If there
 * are no matching type arguments in the method, and each method promotes
 * similar number of arguments, there will be ambiguity.
 */
public class CompletimeTypePromotionAmbiguity {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		CompletimeTypePromotionAmbiguity obj = new CompletimeTypePromotionAmbiguity();
		// obj.sum(20,20); Now ambiguity
		obj.sum(20, 20l);
		obj.sum(20l, 20);
		// obj.sum(20l,20l); Now ambiguity
	}
}
