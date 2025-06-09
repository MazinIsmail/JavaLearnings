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
	static double orderingSubclasses(Object o) {
		return switch (o) {
		case CharSequence c -> Double.parseDouble(c.toString());
		// this case label is dominated by a preceding case label
		// case String s -> Double.parseDouble(s);
		default -> 0d;
		};
	}

}
