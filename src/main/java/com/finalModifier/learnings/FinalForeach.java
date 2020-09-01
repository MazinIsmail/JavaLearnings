package com.finalModifier.learnings;

/**
 * final with for-each statement is a legal statement.
 * 
 * Java program to demonstrate final with for-each statement
 */
public class FinalForeach {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };

		/**
		 * Since the i variable goes out of scope with each iteration of the loop, it is
		 * actually re-declaration each iteration, allowing the same token (i.e. i) to
		 * be used to represent multiple variables.
		 */
		for (final int i : arr)
			System.out.print(i + " ");
	}
}