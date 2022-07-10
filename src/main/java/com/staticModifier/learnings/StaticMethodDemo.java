package com.staticModifier.learnings;

public class StaticMethodDemo {

	/**
	 * A static method can access static variables directly and it cannot access
	 * non-static variables.
	 * 
	 * super and this keyword cannot be used in a static method. A static method can
	 * be directly called by using the class name <<ClassName>>.<<MethodName>>
	 * rather than object. This is the main reason we have declared our main()
	 * method as static.
	 */
	static String studentName;
	static int age;

	public static void displayStudentDetails() {
		StaticMethodDemo.studentName = "Test123";
		StaticMethodDemo.age = 22;
		System.out.println("Stundent Name : " + studentName + " Age : " + age);
	}

	public static void main(String args[]) {
		StaticMethodDemo.displayStudentDetails();
	}
}
