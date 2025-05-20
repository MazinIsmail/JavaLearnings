package com.oops.basics;

/**
 * Constructors
 * 
 * It is called when an instance of the class is created. At the time of calling
 * constructor, memory for the object is allocated in the memory.
 * 
 * It is a special type of method which is used to initialize the object.
 *
 * Every time an object is created using the new() keyword, at least one
 * constructor is called.
 * 
 * It calls a default constructor if there is no constructor available in the
 * class. In such case, Java compiler provides a default constructor by default.
 * 
 */
public class StudentConstructorsLearnings {

	private String name;
	private int id;

	/*
	 * Rules for creating Java constructor: -
	 * 
	 * Constructor name must be the same as its class name.
	 * 
	 * No explicit return type.
	 * 
	 * A Java constructor cannot be abstract, static, final, and synchronized
	 */
	// Creating a default constructor
	StudentConstructorsLearnings() {
		System.out.println("StudentConstructorsLearnings is created");
		this.name = "Hardcoded";
	}

	// What is this keyword?
	// super keyword we will lean later

	// Parameterized constructor
	public StudentConstructorsLearnings(String name) {
		super();
		this.name = name;
	}

	// Parameterized constructor: Constructor Overloading
	public StudentConstructorsLearnings(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

	public static void main(String[] args) {
		System.out.println("Default Cons");
		StudentConstructorsLearnings stl = new StudentConstructorsLearnings();
		stl.display();

		System.out.println("Default Parameterized with 1: - ");
		StudentConstructorsLearnings stlP1 = new StudentConstructorsLearnings("Maz");
		stlP1.display();

		System.out.println("Default Parameterized with 2: - ");
		StudentConstructorsLearnings stlP2 = new StudentConstructorsLearnings("Mazin", 123);
		stlP2.display();
	}

	/*
	 * You can perform any operation in the constructor as you perform in the
	 * method.
	 */
}
