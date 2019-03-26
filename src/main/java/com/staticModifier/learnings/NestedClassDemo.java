package com.staticModifier.learnings;

public class NestedClassDemo {

	class InnerClass2 {
		public void show() {
			System.out.println("Inside nested class 2");
		}

	}

	static class InnerClass1 {
		public void display() {
			System.out.println("Inside nested class 1");
		}
		// not accees from non static inner class-->main method
	}

	public static void main(String args[]) {
		// Nested static class doesn't require instantiation of the outer class
		NestedClassDemo.InnerClass1 vip = new NestedClassDemo.InnerClass1();
		vip.display();

		/*
		 * Below line will throw error as the non-static class require instantiaion of
		 * the outer class NestedClassDemo.InnerClass2 normal = new
		 * NestedClassDemo.InnerClass2();
		 */

		// Nested non-static class require instantiation of the outer class
		NestedClassDemo users = new NestedClassDemo();
		NestedClassDemo.InnerClass2 obj = users.new InnerClass2();
		obj.show();

	}

}
