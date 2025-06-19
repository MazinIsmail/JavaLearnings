package com.patternmatching.learnings;

public class SwitchSpecifics {

	public static void main(String[] args) {
		coveringAllValues(new String("30.5"));

		orderingSubclasses(new String("50.0"));

	}

	/**
	 * When using pattern matching in switch, the Java compiler will check the type
	 * coverage.
	 * 
	 * If a switch expression or statement does not cover all possible values of the
	 * type being matched, the compiler will issue a warning.
	 * 
	 */
	private static double coveringAllValues(Object o) {

		return switch (o) {
		case String s -> Double.parseDouble(s);
		// Error will be shown without the below default: the switch expression does not
		// cover all possible input values
		default -> {
			System.out.println("Warning: The switch expression does not cover all possible values.");
			yield 0.0; // Fallback value
		}
		};

	}

	/**
	 * The order of case labels in a switch expression or statement matters.
	 * 
	 * If a case label is dominated by a preceding case label, the compiler will
	 * issue a warning.
	 */
	private static double orderingSubclasses(Object o) {
		return switch (o) {
		case CharSequence c -> Double.parseDouble(c.toString());
		// this case label is dominated by a preceding case label
		// case String s -> Double.parseDouble(s);
		default -> 0d;
		};
	}

	/*
	 * Enum types can be used in switch expressions, but the evaluation is limited
	 * to the enum constants of the specific type. What if you want to evaluate
	 * based on multiple enum constants?
	 * 
	 * In Java 21, you can use pattern matching for switch with enum constants. This
	 * allows you to match against specific enum constants and perform actions based
	 * on those matches.
	 * 
	 * This feature is particularly useful when you want to handle multiple enum
	 * constants in a concise way without needing to write separate case labels for
	 * each constant.
	 * 
	 */
	enum CarType {
		SUV, CABRIO, EV
	}

	enum FruitType {
		APPLE, AVOCADO, PEAR, ORANGE
	}

	// This example demonstrates how to use pattern matching for switch with enum
	// constants.
	private static void enumConstants() {
		Object obj = new String("APPLE");
		// inefficientEnumConstants
		switch (obj) {
		case String s -> System.out.println("Object is a string:" + s);
		case FruitType f when (f == FruitType.APPLE) -> System.out.println("Object is an apple");
		case FruitType f when (f == FruitType.AVOCADO) -> System.out.println("Object is an avocado");
		case FruitType f when (f == FruitType.PEAR) -> System.out.println("Object is a pear");
		case FruitType f when (f == FruitType.ORANGE) -> System.out.println("Object is an orange");
		case CarType c when (c == CarType.CABRIO) -> System.out.println("Object is a cabrio");
		case null -> System.out.println("Object is null");
		default -> System.out.println("Object is not recognized");
		}

		// efficientEnumConstants
		switch (obj) {
		case String s -> System.out.println("Object is a string:" + s);
		case FruitType.APPLE -> System.out.println("Object is an apple");
		case FruitType.AVOCADO -> System.out.println("Object is an avocado");
		case FruitType.PEAR -> System.out.println("Object is a pear");
		case FruitType.ORANGE -> System.out.println("Object is an orange");
		case CarType.CABRIO -> System.out.println("Object is a cabrio");
		case null -> System.out.println("Object is null");
		default -> System.out.println("Object is not recognized");
		}
	}
}
