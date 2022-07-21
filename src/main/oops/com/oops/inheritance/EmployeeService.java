package com.oops.inheritance;

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
		Address addressStudent = new Address(12, "makrham", "L3F 443", "Canada", "BC");
		student.setAddress(addressStudent);
		System.out.println("Student: " + student);
	}
}
