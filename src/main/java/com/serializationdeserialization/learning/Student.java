package com.serializationdeserialization.learning;

import java.io.Serializable;

/*Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.*/

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient int age; // I(t will not be serialized.

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
