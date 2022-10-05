package com.oops.basics;

// Create a POJO
public class StartingPointToCode {

	// Access Specifier - data type - variable
	private int age;
	private String name;

	public StartingPointToCode() {
		super();
	}

	public StartingPointToCode(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	// Use getter and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// StartingPointToCode startingPointToCode = new StartingPointToCode(3, "Maz");
		// StartingPointToCode startingPointToCode2 = new StartingPointToCode();
		int mark = 10;
		int totalMark = 100;
		float per = ((float)mark/(float)totalMark)*100;
		System.out.println(per);
	}

}
