package com.oops.basics;

/**
 * Static Method
 * 
 * Learn later when teaching static keyword
 * 
 * Instance Method
 * 
 * The method of the class is known as an instance method. It is a non-static
 * method defined in the class. Before calling or invoking the instance method,
 * it is necessary to create an object of its class. Let's see an example of an
 * instance method.
 * 
 */
public class StudentMethodLearnings {

	private int roll;
	private String name;

	public static void main(String[] args) {
		StudentMethodLearnings studentMethodLearnings = new StudentMethodLearnings();
		System.out.println("The sum is: " + studentMethodLearnings.add(12, 13));

		StudentMethodLearnings studentMethodLearningsSet1 = new StudentMethodLearnings();
		studentMethodLearningsSet1.setName("Maz");
		studentMethodLearningsSet1.setRoll(123);
		studentMethodLearningsSet1.setName("Mazin"); // Replaces with new value
		System.out.println(
				"First Student: " + studentMethodLearningsSet1.getName() + " " + studentMethodLearningsSet1.getRoll());

		StudentMethodLearnings studentMethodLearningsSet2 = new StudentMethodLearnings();
		studentMethodLearningsSet2.setName("Rasba");
		studentMethodLearningsSet2.setRoll(133);
		System.out.println(
				"Second Student: " + studentMethodLearningsSet2.getName() + " " + studentMethodLearningsSet2.getRoll());

		AbstractImplementationDemo abstractImplementationDemo = studentMethodLearnings.new AbstractImplementationDemo();
		abstractImplementationDemo.display();

	}

	// Accessor Method: It is also known as getters.
	public int getRoll() {
		return roll;
	}

	// Mutator Method: It is also known as setters or modifiers.
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Function
	// Access Specifier || Return Type || Method Name || Parameter List || Method
	// Body
	/*
	 * user-defined method because we have not used static keyword
	 */
	public int add(int a, int b) {
		int s = a + b;
		return s;
	}

	// Abstract class
	private abstract class AbstractDemo {
		// Abstract method declaration
		abstract void display();
	}

	private class AbstractImplementationDemo extends AbstractDemo {
		// Method implementation
		void display() {
			System.out.println("Abstract method display");
		}
	}

}
