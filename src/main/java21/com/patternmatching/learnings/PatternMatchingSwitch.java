package com.patternmatching.learnings;

/**
 * Before pattern matching, switch cases supported only simple testing of a
 * selector expression that needs to match a constant value exactly.
 * 
 * The Java SE 21 release introduces pattern matching for switch expressions and
 * statements (JEP 441) as a permanent feature.
 */
public class PatternMatchingSwitch {

	public static void main(String[] args) {

		traditionalSwitch();

		// Check PatternMatchingInstanceofLearnings class in java 17 to instanceof
		// learnings.

		// Pattern matching for switch
		patternMatchingSwitch();

	}

	/**
	 * Java SE 17 introduced pattern matching for the switch expressions and
	 * statements. Subsequently, Java SE 18, 19, and 20 refined it, and Java SE 21
	 * made it a permanent feature.
	 * 
	 * 
	 * Pattern matching for switch expressions and statements (JEP 441) allows you
	 * to use patterns in switch expressions and statements, enabling more powerful
	 * and flexible control flow based on the type and structure of the data being
	 * processed.
	 */
	private static void patternMatchingSwitch() {
		Object obj = "Hello, World!";
		switch (obj) {
		case String s -> System.out.println("String: " + s);
		case Integer i -> System.out.println("Integer: " + i);
		case null -> System.out.println("Null value");
		default -> System.out.println("Unknown type: " + obj.getClass().getName());
		}

		obj = 42;
		switch (obj) {
		case String s -> System.out.println("String: " + s);
		case Integer i -> System.out.println("Integer: " + i);
		case null -> System.out.println("Null value");
		default -> System.out.println("Unknown type: " + obj.getClass().getName());
		}

	}

	/*
	 * In the earlier versions of Java, the selector expression had to be a number,
	 * a string, or a constant. Also, the case labels could only contain constants.
	 * 
	 */
	private static void traditionalSwitch() {
		final String b = "B";
		switch (b) {
		case "A" -> System.out.println("Parameter is A");
		case b -> System.out.println("Parameter is b");
		default -> System.out.println("Parameter is unknown");
		}
		;

	}

}
