package com.oops.inheritance;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setAge(25);
		employee.setName("Mazin");
		employee.setSalary(120000000);
		employee.setDepartment("Computer Science");
		Address addressEmployee = new Address(12, "advert", "L3F 4G2", "Ontario", "Canada");
		employee.setAddress(addressEmployee);
		System.out.println("Employee: " + employee);

		Employee employee2 = new Employee();
		employee2.setAge(29);
		employee2.setName("Rasba");
		employee2.setSalary(120000000);
		employee2.setDepartment("Law");
		employee2.setAddress(null);
		System.out.println("Employee 2: " + employee2);

		Student student = new Student();
		student.setName("Nizam");
		student.setRollNumber(123345);

		List<Address> addressList = new ArrayList<>();
		Address addressStudentFirst = new Address(12, "Makrham", "L3F 443", "BC", "Canada");
		// Adding the above address to the list
		addressList.add(addressStudentFirst);
		Address addressStudentSecond = new Address(12, "Barrie", "L2V 3F4", "BC", "Canada");
		// Adding the above address to the list
		addressList.add(addressStudentSecond);
		student.setAddress(addressList);
		System.out.println("Student: " + student);
	}
}
