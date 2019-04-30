package com.oops.polymorphism;

public class CompiletimeMethodOverloading {

	void sum(int a, int b) {
		System.out.println("have 2 args " + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("have 3 args " + (a + b + c));
	}

	public static void main(String[] args) {

		CompiletimeMethodOverloading obj = new CompiletimeMethodOverloading();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);

	}

}
