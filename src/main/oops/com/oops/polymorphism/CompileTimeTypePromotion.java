package com.oops.polymorphism;

public class CompileTimeTypePromotion {
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String args[]) {
		CompileTimeTypePromotion obj = new CompileTimeTypePromotion();
		// now second int literal will be promoted to long
		// Autoboxing and Unboxing concept
		obj.sum(20, 20);
		obj.sum(20, 20, 20);

	}
}
