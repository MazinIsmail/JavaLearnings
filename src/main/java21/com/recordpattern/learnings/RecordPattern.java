package com.recordpattern.learnings;

import java.awt.Color;

record GrapeRecord(String color, Integer nbrOfPits) {
}

record SpecialGrapeRecord(GrapeRecord grape, boolean special) {
}

public class RecordPattern {

	public static void main(String[] args) {

	}

	/*
	 * Record Pattern Matching
	 * 
	 * Record patterns allow developers to match against the structure of a record
	 * and extract its components in a more concise way. This feature was introduced
	 * in Java 16 as a preview feature and became a permanent feature in Java 17.
	 * 
	 */
	private static void singleRecordPatternOldStyle() {
		Object o = new GrapeRecord("BLUE", 2);
		if (o instanceof GrapeRecord grape) {
			System.out.println("This grape has " + grape.nbrOfPits() + " pits.");
		}
	}

	private static void singleRecordPattern() {
		Object o = new GrapeRecord("BLUE", 2);
		if (o instanceof GrapeRecord(String color, Integer nbrOfPits)) {
			System.out.println("This grape has " + nbrOfPits + " pits.");
		}
	}

	private static void nestedRecordPattern() {
		Object o = new SpecialGrapeRecord(new GrapeRecord("BLUE", 2), true);
		if (o instanceof SpecialGrapeRecord(GrapeRecord grape, boolean special)) {
			System.out.println("This grape has " + grape.nbrOfPits() + " pits.");
		}
		if (o instanceof SpecialGrapeRecord(GrapeRecord(String color, Integer nbrOfPits), boolean special)) {
			System.out.println("This grape has " + nbrOfPits + " pits.");
		}
	}

}
