package com.finalModifier.learnings;

/**
 * Immutable means that the object�s actual value can�t be changed, but you can
 * change its reference to another one. It is applicable for an object but not
 * for variables. Immutable suggests that we can�t change the state of the
 * object once created.
 * 
 * Following are the requirements:-
 * 
 * The class must be declared as final (So that child classes can�t be created)
 * 
 * Data members in the class must be declared as final (So that we can�t change
 * the value of it after object creation)
 * 
 * Make all fields private so that direct access is not allowed.
 * 
 * A parameterized constructor
 * 
 * Getter method for all the variables in it
 * 
 * Don�t expose setter methods.
 * 
 * If the class holds a mutable object: Inside the constructor, make sure to use
 * a clone deep copy of the passed argument and never set your mutable field to
 * the real instance passed through constructor, this is to prevent the clients
 * who pass the object from modifying it afterwards. Make sure to always return
 * a clone copy of the field and never return the real object instance.
 */
final class ImmutableClass {
	private final String name;
	private final int regNo;
	private final AgeSample ageSample;

	public ImmutableClass(String name, int regNo, AgeSample ageSample) {
		this.name = name;
		this.regNo = regNo;

		/**
		 * Defensive copying is a technique where an identical, but disconnected, copy
		 * of an object (including arrays) is returned instead of the original one
		 * (similar to a deep copy). Thus any modification to the returned object will
		 * not affect the original object.
		 * 
		 * Deep copy: a kind of object copying techniques: copying all data in the
		 * structure deeply.
		 * 
		 * Defensive copy: result of an operation to protect internal data. Usually it
		 * is a deep or shallow copy used to prevent undesirable access through an
		 * internal reference result.
		 */
		AgeSample cloneAgeSample = new AgeSample();
		cloneAgeSample.setDay(ageSample.getDay());
		cloneAgeSample.setMonth(ageSample.getMonth());
		cloneAgeSample.setYear(ageSample.getYear());
		this.ageSample = cloneAgeSample;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public AgeSample getAgeSample() {
		AgeSample cloneAgeSample = new AgeSample();
		cloneAgeSample.setDay(this.ageSample.getDay());
		cloneAgeSample.setMonth(this.ageSample.getMonth());
		cloneAgeSample.setYear(this.ageSample.getYear());
		return cloneAgeSample;
	}

}

public class ImmutableBaseClassDemo {
	public static void main(String args[]) {
		AgeSample ageSample = new AgeSample();
		ageSample.setDay(1);
		ageSample.setMonth(1);
		ageSample.setYear(1992);
		// use final below to stop new creation
		ImmutableClass immutableClass = new ImmutableClass("ABC", 101, ageSample);

		immutableClass = new ImmutableClass("XYZ", 109, ageSample);
		System.out.println(immutableClass.getName());
		System.out.println(immutableClass.getRegNo());

		System.out.println("Age year before modification = " + immutableClass.getAgeSample().getYear());
		immutableClass.getAgeSample().setYear(1993);
		System.out.println("Age year after modification = " + immutableClass.getAgeSample().getYear());
	}
}
