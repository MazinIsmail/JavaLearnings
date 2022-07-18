package com.staticModifier.learnings;

class NestedClassDemo1 {
	static class InnerClass1 {
		public void display() {
			System.out.println("Inside nested class 1");
		}

	}

	class InnerClass2 {
		public void show() {
			System.out.println("Inside nested class 2");
		}

	}

}

public class StaticNestedOuterCall {
	public static void main(String args[]) {
		// Nested static class doesn't require instantiation of the outer class
		NestedClassDemo1.InnerClass1 vip = new NestedClassDemo1.InnerClass1();
		vip.display();

		/*
		 * Below line will throw error as the non-static class require instantiation of
		 * the outer class
		 */
		// NestedClassDemo.InnerClass2 normal = new NestedClassDemo.InnerClass2();

		// Nested non-static class require instantiation of the outer class
		NestedClassDemo1 users = new NestedClassDemo1();
		NestedClassDemo1.InnerClass2 obj = users.new InnerClass2();
		obj.show();

	}

}
