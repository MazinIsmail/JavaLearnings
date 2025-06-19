package com.passByValue.learnings;

/**
 * This is where the confusion often lies. When you pass an object to a method
 * in Java, you are still passing by value. However, the value being passed is
 * not the object itself, but a copy of the object's reference (its memory
 * address).
 * 
 * Original object: Lives in a specific location in memory (the heap).
 * Reference: A variable that stores the memory address of that object.
 * 
 * 
 * When you pass an object to a method:
 * 
 * A copy of the reference variable is made. Both the original reference in the
 * calling method and the new reference in the called method now point to the
 * same object in memory.
 * 
 * Because both references point to the same object, if you use the reference
 * inside the method to modify the object's state (e.g., change the value of its
 * fields), those changes will be reflected in the original object.
 * 
 * However, if you reassign the parameter to a new object within the method,
 * this will only affect the local copy of the reference. The original reference
 * in the calling method will still point to the original object.
 * 
 * Java is strictly pass by value.
 * 
 * For object types, the value of the reference (the memory address) is copied.
 * This means you can modify the object an argument points to, but you cannot
 * change which object the original variable points to from within the method.
 */

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}

public class PassByValueObjectReferences {

	public static void changePersonName(Person p) {
		// Modifying the object's state
		p.name = "Jane Doe";
		System.out.println("Inside method (after name change): " + p.name);
	}

	public static void assignNewPerson(Person p) {
		p = new Person("New Person"); // Reassigning the local reference
		System.out.println("Inside method (after reassignment): " + p.name);
	}

	public static void main(String[] args) {
		Person person1 = new Person("John Doe");
		System.out.println("Before changePersonName: " + person1.name);
		changePersonName(person1);
		// Will be "Jane Doe"
		System.out.println("After changePersonName: " + person1.name);

		System.out.println("--------------------");

		Person person2 = new Person("Alice");
		System.out.println("Before assignNewPerson: " + person2.name);
		assignNewPerson(person2);
		// Will still be "Alice"
		System.out.println("After assignNewPerson: " + person2.name);

	}

}
