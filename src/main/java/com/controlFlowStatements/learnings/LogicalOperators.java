package com.controlFlowStatements.learnings;

/**
 * Java also has three logical operators: &&, ||, and !, which respectively
 * stand for and, or, and not.
 */
public class LogicalOperators {

	public static void main(String[] args) {
		int x = 0, y = 0;

		if (x == 0 && y == 0) {
			System.out.println("Both x and y are zero");
		}

		boolean evenFlag = (x % 2 == 0); // true if x is even
		System.out.println("evenFlag: " + evenFlag);

	}

}
