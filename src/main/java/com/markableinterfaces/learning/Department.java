package com.markableinterfaces.learning;

class Department  implements Cloneable {
	private String name;
	private int id;

	Employee employee = new Employee();

	public Object clone() throws CloneNotSupportedException {
		// Assign the shallow copy to new refernce variable department
		Department department = (Department) super.clone();
		
		//department.employee = new Employee();

		// Create a new object for the field c and assign it to shallow copy obtained,
		// to make it a deep copy
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

}