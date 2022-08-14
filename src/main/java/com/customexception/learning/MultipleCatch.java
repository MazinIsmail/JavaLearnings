package com.customexception.learning;

/**
 * A try block can be followed by one or more catch blocks. Each catch block
 * must contain a different exception handler.
 * 
 * At a time only one exception occurs and at a time only one catch block is
 * executed.
 * 
 */
public class MultipleCatch {
	public static void Multiple() {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
			System.out.println("This wont print because there is an excpetion before this.");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}

	public static void main(String[] args) {
		Multiple();
	}
}
