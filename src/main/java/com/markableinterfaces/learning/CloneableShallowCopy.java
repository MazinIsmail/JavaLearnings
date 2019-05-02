package com.markableinterfaces.learning;

/**
 * A Java program to demonstrate shallow copy using clone()
 */

public class CloneableShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student studentorginal = new Student();
		studentorginal.setId(1001); 
		studentorginal.setName("Arun");
		Employee employee =  new Employee();
		employee.setAge(30);
		employee.setName("Laya");
		studentorginal.setEmployee(employee);

		Student studentAssigned =  (Student) studentorginal;
		Student studentcloned = (Student) studentorginal.clone();
		System.out.println("studentorginal : " + studentorginal.toString());
		System.out.println("studentcloned  : " + studentcloned.toString());
		System.out.println("studentAssigned  : " + studentAssigned.toString());
		
		studentcloned.setId(1002);
		employee.setName("Riya");
		studentAssigned.setName("abc");
		
		System.out.println("After change");
		
		
		// Change in object type field will be reflected in both studentorginal and studentcloned(shallow copy)
		System.out.println("studentorginal : " + studentorginal.toString());
		System.out.println("studentcloned  : " + studentcloned.toString());
		System.out.println("studentAssigned  : " + studentAssigned.toString());

	}

}
