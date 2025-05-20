package com.assginments.two;

import java.util.Objects;

public class Employee {

	// Used encapsulation made variables private.
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;

	// Default constructor
	public Employee() {
		super();
	}

	// Constructor with arguments
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		// Question does not asks me to assign this value.
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// Copy constructor
	public Employee(Employee employee) {
		this.firstName = employee.firstName;
		this.lastName = employee.lastName;
		this.socialSecurityNumber = employee.socialSecurityNumber;
	}

	// Accessor methods and Mutator methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// returns in this format
	// First name: Karan, Last name : Sharma, SSN: 1234567XX
	@Override
	public String toString() {
		return "First name: " + firstName + ", Last name : " + lastName + ", SSN: " + socialSecurityNumber;
	}

	// Overriding the equal method, checking if same values as those of passed
	// employee object.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(socialSecurityNumber, other.socialSecurityNumber);
	}

	// do nothing
	// This method is for polymorphism to call appropriate earnings() method of
	// subclass
	public void earnings() {

	}
}
