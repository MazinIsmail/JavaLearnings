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
		Address addressEmployee = new Address(12, "advert", "L3F 4G2", "Canada", "Ontario");
		employee.setAddress(addressEmployee);
		System.out.println("Employee: " + employee);

		Student student = new Student();
		student.setName("Nizam");
		student.setRollNumber(123345);

		List<Address> addressList = new ArrayList<>();
		Address addressStudentFirst = new Address(12, "makrham", "L3F 443", "Canada", "BC");
		addressList.add(addressStudentFirst);
		Address addressStudentSecond = new Address(12, "Barrie", "L2V 3F4", "Canada", "BC");
		addressList.add(addressStudentSecond);
		student.setAddress(addressList);
		System.out.println("Student: " + student);
	}
}
