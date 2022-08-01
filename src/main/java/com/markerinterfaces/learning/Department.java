package com.markerinterfaces.learning;

public class Department implements Cloneable {
	private int id;
	private String name;
	private Employee employee = new Employee();

	public Object clone() throws CloneNotSupportedException {
		// Assign the shallow copy to new reference variable department
		Department department = (Department) super.clone();
		department.employee = (Employee) employee.clone();
		// Create a new object for the field employee and assign it to shallow copy
		// obtained, to make it a deep copy
		return department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + ", employee=" + employee + "]";
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
}