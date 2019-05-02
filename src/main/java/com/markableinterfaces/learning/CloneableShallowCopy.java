package com.markableinterfaces.learning;

/**
 * A Java program to demonstrate shallow copy using clone()
 */

public class CloneableShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student studentorginal = new Student();
		studentorginal.setId(1001); 
		studentorginal.setName("Arun");
		studentorginal.employee.setAge(30);
		studentorginal.employee.setName("Laya");

		Student studentcloned = (Student) studentorginal.clone();
		System.out.println("studentorginal : " + studentorginal.toString());
		System.out.println("studentcloned  : " + studentcloned.toString());
		
		studentcloned.setId(1002);
		studentcloned.employee.setName("Riya");

		// Change in object type field will be reflected in both t2 and t1(shallow copy)
		System.out.println("studentorginal : " + studentorginal.toString());
		System.out.println("studentcloned  : " + studentcloned.toString());

	}

}
