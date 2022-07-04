package com.oops.basics;

public class TestStudent {

	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		// Initialize using method
		s1.insertRecord(1, "Maz");
		s2.insertRecord(2, "Nizam");
		s1.displayInformation();
		s2.displayInformation();

		// Constructor call
		Student s3 = new Student(3, "Rasba");
		s3.displayInformation();
	}

}
