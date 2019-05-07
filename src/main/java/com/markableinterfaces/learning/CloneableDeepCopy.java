package com.markableinterfaces.learning;

/**
 * 
 *Deep copy of an object will have exact copy of all the fields of original object just like shallow copy.
 *But in additional, if original object has any references to other objects as fields, 
 *then copy of those objects are also created by calling clone() method on them.
 * Any changes made to clone object will not be reflected in original object or vice-versa.
 */

public class CloneableDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department departmentorginal = new Department();
		departmentorginal.setId(1001);
		departmentorginal.setName("Machanical");
		Employee employee =  new Employee();
		employee.setAge(30);
		employee.setName("Laya");
		departmentorginal.setEmployee(employee);
		/*
		 * departmentorginal.employee.setName("Arun");
		 * departmentorginal.employee.setAge(25);
		 */

		Department departmentcloned = (Department) departmentorginal.clone();
		System.out.println("departmentorginal : " + departmentorginal.toString());
		System.out.println("departmentcloned  : " + departmentcloned.toString());
		departmentcloned.setId(2002);

		departmentcloned.employee.setName("Jisla");

		System.out.println("After changing Cloned value");
		System.out.println("departmentorginal : " + departmentorginal.toString());
		System.out.println("departmentcloned  : " + departmentcloned.toString());

	}

}
