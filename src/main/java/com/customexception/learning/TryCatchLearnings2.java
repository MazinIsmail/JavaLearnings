package com.customexception.learning;

public class TryCatchLearnings2 {

	public static void main(String args[]) {
		try {
			int data = 50 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// try to handle the ArithmeticException instead of
			// ArrayIndexOutOfBoundsException
			System.out.println(e);
		}
		System.out.println("Rest of the code ...");
	}
}
