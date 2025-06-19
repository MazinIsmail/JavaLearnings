package com.passByValue.learnings;

/**
 * When you pass a primitive data type (like int, double, boolean, char, etc.)
 * to a method, a copy of the actual value is made and passed to the method. Any
 * changes made to the parameter within the method will not affect the original
 * variable in the calling method.
 * 
 * Java is strictly pass by value.
 * 
 * For primitive types, the value itself is copied.
 */
public class PassByValuePrimitiveTypes {

	public static void main(String[] args) {
		int x = 5;
		System.out.println("Before method call: x = " + x);
		modifyValue(x);
		// x remains 5
		System.out.println("After method call: x = " + x);
	}

	public static void modifyValue(int num) {
		// Modifying the copy
		num = num + 10;
		System.out.println("Inside method: num = " + num);
	}

}
