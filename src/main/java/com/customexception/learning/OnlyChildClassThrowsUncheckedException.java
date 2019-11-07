package com.customexception.learning;

/**
 * If base class doesn’t throw any exception, child class can only throws an
 * unchecked exception and not checked exception
 *
 */
class UnCheckedParent {

	void color() {
		System.out.println("Blue");
	}
}

class OnlyChildClassThrowsUncheckedException extends UnCheckedParent {

	// It throws an unchecked exception
	void color() throws NullPointerException {
		System.out.println("White");
	}

	public static void main(String args[]) {
		UnCheckedParent obj = new OnlyChildClassThrowsUncheckedException();
		obj.color();
	}

}
