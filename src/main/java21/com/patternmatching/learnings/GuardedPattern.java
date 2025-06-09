package com.patternmatching.learnings;

public class GuardedPattern {
	public static void main(String[] args) {
		guardedPattern();
	}

	/**
	 * Guarded patterns can be used to refine the matching process by adding
	 * conditions that must be satisfied for a match to occur.
	 * 
	 * Guarded Pattern matching is a feature that allows you to add additional
	 * conditions to a pattern match, enabling more precise control over the
	 * matching process.
	 */
	private static void guardedPattern() {
		// Guarded patterns enable us to avoid additional if conditions in switch
		// statements. Instead, we can move our conditional logic to the case label.
		Object obj = "Hello, World!";
		switch (obj) {
		case String s when s.length() > 5 -> System.out.println("String with length > 5: " + s);
		default -> throw new IllegalArgumentException("Unexpected value: " + obj);
		}

	}

	/*
	 * It turns out that the pattern matching for switch has been extended to allow
	 * for a boolean expression to be added after the type pattern. This boolean
	 * expression is called a guard and the resulting case label a guarded case
	 * label. You can add this boolean expression in a when clause, with the
	 * following syntax.
	 * 
	 * boolean expression - guard
	 * 
	 * boolean expression - guard
	 * 
	 * boolean expression - guard
	 * 
	 * 
	 * case label is called a guarded case label.
	 * 
	 * case label is called a guarded case label.
	 * 
	 * case label is called a guarded case label.
	 */
}
