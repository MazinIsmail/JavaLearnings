package com.customexception.learning;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			int age = 10;
			testException(age);
		} catch (CustomException e) {
			System.out.println("Exception handled here.");
			e.printStackTrace();
		}
	}

	public static void testException(int age) throws CustomException {
		if (age <= 11) {
			throw new CustomException("The String value is null");
		}
	}
}
