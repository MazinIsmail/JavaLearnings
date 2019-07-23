package com.customexception.learning;

import java.io.IOException;

/**
 * When base class and child class both throws a checked/unchecked exception
 * 
 *
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
