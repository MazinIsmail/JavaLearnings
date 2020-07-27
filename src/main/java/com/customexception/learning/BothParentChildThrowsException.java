package com.customexception.learning;

import java.io.IOException;

/**
 * When base class and child class both throws a checked/unchecked exception.
 * 
 * If the superclass method declares an exception, subclass overridden method
 * can declare same, subclass exception or no exception but cannot declare
 * parent exception.
 */
class Parent {
	void brand() throws IOException {
		System.out.println("Yamaha");
	}
}

class BothParentChildThrowsException extends Parent {
	void brand() throws IOException {
		System.out.println("Bajaj");
	}

	public static void main(String args[]) {
		Parent obj = new BothParentChildThrowsException();
		try {
			obj.brand();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
