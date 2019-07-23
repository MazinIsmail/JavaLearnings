package com.customexception.learning;

import java.io.IOException;

/**
 * When child class method is throwing border checked exception compared to the
 * same method of base class
 *
 *
 */
class ParentException {
	void color() throws IOException {
		System.out.println("Black");
	}
}

class ChildClassThrowsBroaderException extends ParentException {
	void color() {
		System.out.println("White");
	}

	public static void main(String args[]) {
		ParentException obj = new ChildClassThrowsBroaderException();
		try {
			obj.color();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
