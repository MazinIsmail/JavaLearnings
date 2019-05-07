package com.markableinterfaces.learning;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

	private transient int transientVariable;
	private static int staticVariable;
	private String name;
	private int age;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Employee employee = (Employee) super.clone();
		//return employee;
		return super.clone();
	}

	public Employee() {
		super();
	}

	public Employee(int transientVariable, int staticVariable, String name, int age) {
		super();
		this.transientVariable = transientVariable;
		Employee.staticVariable = staticVariable;
		this.name = name;
		this.age = age;
	}

	public int getTransientVariable() {
		return transientVariable;
	}

	public void setTransientVariable(int transientVariable) {
		this.transientVariable = transientVariable;
	}

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		Employee.staticVariable = staticVariable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [transientVariable=" + transientVariable + ", name=" + name + ", age=" + age + "]";
	}

}
