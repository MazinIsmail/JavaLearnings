/**
 * Example of Method Overloading with TypePromotion if matching found:
If there are matching type arguments in the method, type promotion is not performed.
 */
package com.oops.polymorphism;

public class CompiletimeTypePromotionMatch {

	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		CompiletimeTypePromotionMatch obj = new CompiletimeTypePromotionMatch();
		obj.sum(20, 20);// now int arg sum() method gets invoked
	}
}
