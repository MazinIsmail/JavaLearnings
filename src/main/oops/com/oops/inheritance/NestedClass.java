package com.oops.inheritance;

public class NestedClass {
	private int num = 175;

	// inner class
	private class InnerDemo {
		public void print() {
			System.out.println("This is an inner class");
		}

		public void printNum() {
			System.out.println("Num: " + num);
		}
	}

	void displayInner() {
		InnerDemo inner = new InnerDemo();
		inner.print();
		inner.printNum();
	}

	// instance method of the outer class
	void methodLocalClass() {
		int num = 23;

		// method-local inner class
		class MethodInnerDemo {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		} // end of inner class

		// Accessing the inner class
		MethodInnerDemo methodInnerDemo = new MethodInnerDemo();
		methodInnerDemo.print();
	}

	public static void main(String args[]) {
		// Instantiating the outer class
		NestedClass outer = new NestedClass();

		// Accessing the display_Inner() method.
		outer.displayInner();
		outer.methodLocalClass();
	}
}
