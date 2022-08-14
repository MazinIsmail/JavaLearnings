package com.customexception.learning;

public class TryCatchLearnings1 {

	public static void main(String args[]) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code... 1");

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code... 2");

		try {
			String s = "abc";
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code... 3");

		try {
			int a[] = new int[5];
			a[10] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code... 4");

		// Only using finally
		try {
			int a[] = new int[5];
			a[10] = 50;
		} finally {
			System.out.println("Only using finally");
		}
		System.out.println("Rest of the code... 5");

		try {
			int a[] = new int[5];
			a[10] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			int x = 100 / 0;
		}
		System.out.println("Rest of the code... 6");

	}
}
