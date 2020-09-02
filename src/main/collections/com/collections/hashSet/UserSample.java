package com.collections.hashSet;

import java.util.Objects;

/**
 * Equal objects should have the same hash code.
 * 
 * This is also why, if we override equals, we must create a matching hashCode
 * implementation. Otherwise things that are equal according to our
 * implementation would likely not have the same hash code because they use
 * Object‘s implementation.
 * 
 * Whenever it is invoked on the same object more than once during an execution
 * of a Java application, the hashCode method must consistently return the same
 * integer, provided no information used in equals comparisons on the object is
 * modified. This integer need not remain consistent from one execution of an
 * application to another execution of the same application.
 * 
 * If two objects are equal according to the equals(Object) method, then calling
 * the hashCode method on each of the two objects must produce the same integer
 * result.
 * 
 * It is not required that if two objects are unequal according to the
 * equals(Object) method, then calling the hashCode method on each of the two
 * objects must produce distinct integer results. However, the programmer should
 * be aware that producing distinct integer results for unequal objects may
 * improve the performance of hash tables.
 * 
 * When implementing hashCode:
 * 
 * Use a the same fields that are used in equals (or a subset thereof). Better
 * not include mutable fields. Consider not calling hashCode on collections. Use
 * a common algorithm unless patterns in input data counteract them.
 */
public class UserSample {
	private String name;
	private String dob;
	private int age;
	private String location;

	@Override
	public int hashCode() {
		// return Objects.hash(name, dob, age, location);
		// The easiest way to compute a field’s hash code is to just call `hashCode` on
		// it.
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSample other = (UserSample) obj;
		if (age != other.age)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "UserSample [name=" + name + ", dob=" + dob + ", age=" + age + ", location=" + location + "]";
	}

}
