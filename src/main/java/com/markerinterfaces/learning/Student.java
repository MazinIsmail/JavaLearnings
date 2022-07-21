package com.markerinterfaces.learning;

class Student implements Cloneable {
	private int id;
	private String name;
	private Employee employee = new Employee();

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		/*
		 * In here employee is not cloned. That means any changes made to those objects
		 * through clone object will be reflected in original object or vice-versa.
		 */
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
