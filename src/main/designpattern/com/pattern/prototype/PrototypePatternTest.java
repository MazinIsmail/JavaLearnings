package com.pattern.prototype;

import java.util.List;

/* Creational pattern. Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * This pattern is used when creation of object directly is costly.
 * Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.*/
public class PrototypePatternTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
