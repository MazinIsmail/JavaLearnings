package com.switchJava17.learnings;

public class SwitchSpecificsJava17 {

	public static void main(String[] args) {
		// null values in switch expressions
		handlingNullValuesInSwitch(null);

		// redefining switch expressions with multiple labels
		// This is a new feature in Java 17 that allows us to use multiple labels in a
		// single case block, making the code more concise and readable.
		redefiningSwitchExpressionsMultipleLabels();

		// The yield statement is used to return a value from a switch expression.
		redefiningSwitchExpressionsWithYield();
	}

	private static void redefiningSwitchExpressionsWithYield() {
		int value = 2;
		String result = switch (value) {
		case 1 -> {
			yield "Got a 1";
		}
		case 2 -> {
			yield "Got a 2";
		}
		default -> {
			System.out.println("Unknown value");
			yield "Unknown"; // Using yield to return a value from the default case
		}
		};
		System.out.println(result); // Output: Got a 2
	}

	/*
	 * We can include more than one value in the same block by comma separating
	 * them. In earlier versions of Java, we could only use a single value in a
	 * case. In Java 17, we can use multiple values in a case label.
	 * 
	 * This feature allows us to group multiple case labels together, which can make
	 * the code more concise and readable.
	 * 
	 * Replace the colon (:) with an arrow (->) and ensure that an expression is
	 * used in the case. The default behaviour of Switch Expressions is no
	 * fall-through, so no break is needed.
	 */
	private static void redefiningSwitchExpressionsMultipleLabels() {
		switch (1) {
		case 1, 2, 3 -> System.out.println("One, Two or Three");
		case 4, 5 -> System.out.println("Four or Five");
		default -> System.out.println("Other value");
		}
	}

	/*
	 * Java 17 has come up with a feature where we can put null as a selector
	 * expression in switch case expressions.
	 * 
	 * In earlier versions of Java, each passing of a null value to a switch
	 * statement would result in a NullPointerException.
	 * 
	 * However, with type patterns, it is now possible to apply the null check as a
	 * separate case label.
	 * 
	 * a switch statement using pattern matching can still throw a
	 * NullPointerException. However, it can do so only when the switch block
	 * doesn’t have a null-matching case label.
	 */
	private static double handlingNullValuesInSwitch(Object o) {
		return switch (o) {
		case String s -> Double.parseDouble(s);
		case null -> 0d;
		default -> 0d;
		};

	}

}
