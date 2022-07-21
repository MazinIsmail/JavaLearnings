package com.oops.polymorphism;

/**
 * Example of Method Overloading with TypePromotion if matching found: If there
 * are matching type arguments in the method, type promotion is not performed.
 */
public class CompileTimeTypePromotionMatch {

	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		CompileTimeTypePromotionMatch obj = new CompileTimeTypePromotionMatch();
		// now int arg sum() method gets invoked
		obj.sum(20, 20);
		// now long arg sum() method gets invoked
		obj.sum(20l, 20);
		obj.sum(20l, 20l);
		obj.sum(20, 20l);
	}
}
