package com.staticModifier.learnings;

public class NestedClassDemo {

	static class InnerClass1 {
		public void display() {
			System.out.println("Inside nested class 1");
		}
		// not access from non static inner class-->main method
	}

	class InnerClass2 {
		public void show() {
			System.out.println("Inside nested class 2");
		}

	}

	public static void main(String args[]) {
		// Nested static class doesn't require instantiation of the outer class
		NestedClassDemo.InnerClass1 vip = new NestedClassDemo.InnerClass1();
		vip.display();

		/*
		 * Below line will throw error as the non-static class require instantiation of
		 * the outer class NestedClassDemo.InnerClass2 normal = new
		 * NestedClassDemo.InnerClass2();
		 */

		// Nested non-static class require instantiation of the outer class
		NestedClassDemo users = new NestedClassDemo();
		NestedClassDemo.InnerClass2 obj = users.new InnerClass2();
		obj.show();

	}

}
