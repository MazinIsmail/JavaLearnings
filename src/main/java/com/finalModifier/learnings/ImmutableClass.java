package com.finalModifier.learnings;

/***
 * 
 * immutable means that the object’s actual value can’t be changed, but you can
 * change its reference to another one. it is applicable for an object but not
 * for variables. Immutable suggests that we can’t change the state of the
 * object once created.
 */
// An immutable class
final class ImmutableBaseClass {
	final String name;
	final int regNo;

	public ImmutableBaseClass(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
}

public class ImmutableClass {
	public static void main(String args[]) {
		ImmutableBaseClass s = new ImmutableBaseClass("ABC", 101);
		s = new ImmutableBaseClass("XYZ", 109);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());

		// Uncommenting below line causes error
		// s.regNo = 102;
	}
}
