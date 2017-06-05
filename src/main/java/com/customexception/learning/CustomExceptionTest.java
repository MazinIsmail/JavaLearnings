package com.customexception.learning;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			testException(null);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

	public static void testException(String string) throws CustomException {
		if (string == null) {
			throw new CustomException("The String value is null");
		}
	}
}
