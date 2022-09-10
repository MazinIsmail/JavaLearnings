package com.oops.basics;

public class StudentSettersAndGetters {

	private String fullname;
	private int rollNum;
	private int age;

	public StudentSettersAndGetters(String fullname, int rollNum, int age) {
		super();
		this.fullname = fullname;
		this.rollNum = rollNum;
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
