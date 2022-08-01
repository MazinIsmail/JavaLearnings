package com.controlFlowStatements.learnings;

/**
 * Jump statements are used to transfer the control of the program to the
 * specific statements.
 * 
 * There are two types of jump statements in Java, i.e., break and continue.
 */

public class JumpStatements {

	public static void main(String[] args) {
		System.out.println("Break Statement: -\n");
		breakStatement();

		System.out.println("\nContinue Statement: -");
		continueStatement();
	}

	/**
	 * The break statement is used to break the current flow of the program and
	 * transfer the control to the next statement outside a loop or switch
	 * statement. However, it breaks only the inner loop in the case of the nested
	 * loop.
	 * 
	 * The break statement cannot be used independently in the Java program, i.e.,
	 * it can only be written inside the loop or switch statement.
	 */
	private static void breakStatement() {
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}

		System.out.println();
		System.out.println("Nested Loop with break statement");
		for (int i = 0; i <= 2; i++) {
			System.out.println();
			System.out.println("i: " + i);
			System.out.println();

			// j: 0 to 6
			for (int j = 0; j <= 10; j++) {
				System.out.println("j: " + j);
				if (j == 6) {
					break;
				}
			}

			if (i == 1) {
				break;
			}
		}
	}

	/**
	 * Unlike break statement, the continue statement doesn't break the loop,
	 * whereas, it skips the specific part of the loop and jumps to the next
	 * iteration of the loop immediately.
	 */
	private static void continueStatement() {
		for (int i = 0; i <= 2; i++) {
			System.out.println();
			System.out.println("i: " + i);
			System.out.println();

			// j: 0 to 5, skip 4.
			// j: 1 to 5, skip 4.
			for (int j = i; j <= 5; j++) {
				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}
	}
}
