package com.controlFlowStatements.learnings;

/**
 * Decision-Making statements: -
 * 
 * Evaluate the Boolean expression and control the program flow depending upon
 * the result of the condition provided. There are two types of decision-making
 * statements in Java, i.e., If statement and switch statement.
 */
public class DecisionMakingStatements {

	public static void main(String[] args) {
		System.out.println("If-Else Statement: -");
		ifElseStatements();

		System.out.println("\nSwitch Statement: -");
		switchStatement();
	}

	private static void ifElseStatements() {
		boolean condition = true;
		// if statement
		System.out.println("if Statement");
		if (condition) {
			// executes when condition is true
			System.out.println("condition: " + condition);
		}

		// if-else statement
		System.out.println("\nif-else Statement");
		if (condition) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		// if-else-if ladder
		System.out.println("\nif-else-if ladder");
		int x = 10;
		int y = 12;
		if (x + y > 20) {
			System.out.println("x + y is greater than 20");
		} else if (x + y == 20) {
			System.out.println("x + y is equal to 20");
		} else {
			System.out.println("x + y is less than 20");
		}

		// Nested if-statements
		System.out.println("\nNested if Statement");
		String address = "Delhi, India";
		if (address.endsWith("India")) {
			System.out.println("I am inside India");
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}

	/**
	 * Similar to if-else-if statements.
	 * 
	 * The switch statement contains multiple blocks of code called cases and a
	 * single case is executed based on the variable which is being switched.
	 * 
	 * The case variables can be int, short, byte, char, or enumeration.
	 * 
	 * Default statement is executed when any of the case doesn't match the value of
	 * expression. It is optional.
	 * 
	 * Break statement terminates the switch block when the condition is satisfied.
	 * It is optional, if not used, next case is executed.
	 */
	private static void switchStatement() {
		int num = 2;

		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		default:
			System.out.println("number is " + num);
		}

		String food = "asparagus";
		switch (food) {
		case "apple":
		case "banana":
		case "cherry":
			System.out.println("Fruit!");
			break;
		case "asparagus":
		case "broccoli":
		case "carrot":
			System.out.println("Vegetable!");
			break;
		}
		// break statement will come out of the switch.
	}
}
