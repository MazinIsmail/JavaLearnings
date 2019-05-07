package com.markableinterfaces.learning;

/**
 * 
 * The default version of clone() method creates the shallow copy of an object.
 * The shallow copy of an object will have exact copy of all the fields of original object.
 * If original object has any references to other objects as fields, 
 * then only references of those objects are copied into clone object, copy of those objects are not created. 
 * That means any changes made to those objects through clone object will be reflected in original object or vice-versa.
 *
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
