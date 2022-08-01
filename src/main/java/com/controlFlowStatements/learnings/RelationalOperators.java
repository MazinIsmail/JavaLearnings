package com.controlFlowStatements.learnings;

/**
 * Java has six relational operators that test the relationship between two
 * values.
 * 
 * The result of a relational operator is one of two special values: true or
 * false.
 * 
 * Remember that = is the assignment operator, and == is a relational operator.
 * Also, the operators =< and => do not exist.
 */
public class RelationalOperators {
	public static void main(String[] args) {

		boolean check;
		int x = 0, y = 0;
		check = (x == y); // x is equal to y
		check = (x != y); // x is not equal to y
		check = (x > y); // x is greater than y
		check = (x < y); // x is less than y
		check = (x >= y); // x is greater than or equal to y
		check = (x <= y); // x is less than or equal to y

		// The two sides of a relational operator have to be compatible
		// 5 < "6" is invalid because 5 is an int and "6" is a String
	}
}
