package com.java8.learning.streamlearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

	static class Employee {
		private int id;
		private String name;
		private double salary;

		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {

		Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0), new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0) };
		List<Employee> empList = Arrays.asList(arrayOfEmps);

		// Example of using streams to filter employees with salary greater than 150000
		double threshold = 150000.0;
		long count = empList.stream().filter(emp -> emp.getSalary() > threshold).count();

		// Example of using streams to find the maximum salary
		double maxSalary = empList.stream().mapToDouble(emp -> emp.getSalary()).max().orElse(0.0);

		// Example using forEach to print employee names
		empList.stream().forEach(emp -> System.out.println("Employee Name: " + emp.getName()));

		// Example using flatMap to flatten to get name
		List<String> employeeNames = empList.stream().flatMap(emp -> Arrays.stream(new String[] { emp.getName() }))
				.collect(Collectors.toList());

	}
}
