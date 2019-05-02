package com.markableinterfaces.learning;

/**
 * 
 * clone with deep copy.
 *
 */

public class CloneableDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department departmentorginal = new Department();
		departmentorginal.setId(1001);
		departmentorginal.setName("Machanical");
		departmentorginal.employee.setName("Arun");
		departmentorginal.employee.setAge(25);

		Department departmentcloned = (Department) departmentorginal.clone();
		System.out.println("departmentorginal : " + departmentorginal.toString());
		System.out.println("departmentcloned  : " + departmentcloned.toString());
		departmentcloned.setId(2002);

		departmentcloned.employee.setName("Laya");

		System.out.println("After changing Cloned value");
		System.out.println("departmentorginal : " + departmentorginal.toString());
		System.out.println("departmentcloned  : " + departmentcloned.toString());

	}

}
