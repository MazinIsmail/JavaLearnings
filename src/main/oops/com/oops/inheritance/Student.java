package com.oops.inheritance;

import java.util.List;

public class Student {

	private String name;
	private long rollNumber;
	// One-to-many mapping
	private List<Address> address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", address=" + address + "]";
	}

}
