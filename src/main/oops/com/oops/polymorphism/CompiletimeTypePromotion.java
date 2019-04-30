package com.oops.polymorphism;

public class CompiletimeTypePromotion {
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String args[]) {
		CompiletimeTypePromotion obj = new CompiletimeTypePromotion();
		obj.sum(20, 20);// now second int literal will be promoted to long
		obj.sum(20, 20, 20);

	}
}
