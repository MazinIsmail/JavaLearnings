package com.markableinterfaces.learning;

import java.io.Serializable;

public class Student  implements Serializable {
	/**
	 * TODO: Comment
	 */
	private static final long serialVersionUID = 1L;
	public int a;
	public String b;

	// Default constructor
	public Student(int a, String b) {
		this.a = a;
		this.b = b;
}
}
