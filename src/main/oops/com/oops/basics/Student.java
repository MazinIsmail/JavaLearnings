package com.oops.basics;

// Defining a Student class
public class Student {

	// Field or data member or instance variable
	int id;
	String name;

	// Constructor
	public Student() {
		super();
	}

	// Constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String args[]) {
		// Creating an object or instance
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println(s1.id);
		System.out.println(s1.name);
	}

	// Function
	// Access Specifier || Return Type || Method Name || Parameter List || Method
	// Body
	public void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void displayInformation() {
		System.out.println(id + " " + name);
	}

	// Access Specifier: It specifies the visibility of the method.
	/*
	 * Public: The method is accessible by all classes
	 * 
	 * Private: The method is accessible only in the classes in which it is defined.
	 * 
	 * Protected: The method is accessible within the same package or subclasses in
	 * a different package.
	 * 
	 * Default: When we do not use any access specifier in the method declaration,
	 * Java uses default access specifier by default. It is visible only from the
	 * same package only.
	 */
}
