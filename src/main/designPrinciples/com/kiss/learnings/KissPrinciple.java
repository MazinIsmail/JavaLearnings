package com.kiss.learnings;

/**
 * KISS Principle
 * 
 * Keep It Stupid Simple or Keep It Simple, Stupid
 * 
 * The KISS principle is descriptive to keep the code simple and clear, making
 * it easy to understand. Keep your methods small. Each method should only solve
 * one small problem, not many use cases. If you have a lot of conditions in the
 * method, break these out into smaller methods. It will not only be easier to
 * read and maintain, but it can help find bugs a lot faster. This will be
 * greatly appreciated by anyone else that needs to examine your code in the
 * future.
 * 
 * Think of many solutions for your problem, then choose the best, simplest one
 * and transform that into your code. Whenever you find lengthy code, divide
 * that into multiple methods.
 * 
 * Complexity: -
 * 
 * Too many parts in the system and Too many interconnected part in the system.
 * 
 * Dead Code: -
 * 
 * Everything which is not used in the application at runtime: variables
 * initialized but never called, method never used, classes never instantiated.
 */
public class KissPrinciple {

	public static void main(String[] args) {
		int a = 10;

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	/*
	 * Both methods do exactly the same thing. Both versions may be seen as simpler
	 * than the other depending on the view taken.
	 * 
	 * weekdays1 uses less language features. weekdays1 the relation between input
	 * and output can be seen directly and it's clear how it works by just seeing
	 * the method.
	 * 
	 * Complexity metrics measuring these aspects (e.g. the cyclomatic complexity)
	 * will prefer weekday2. Only single conditional check.
	 */
	// Eventually a human developer has to decide which solution to implement and
	// the principles only give guidelines.
	public String weekday1(int dayOfWeek) {
		switch (dayOfWeek) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			throw new IllegalArgumentException("dayOfWeek must be in range 1..7");
		}
	}

	public String weekday2(int dayOfWeek) {
		if ((dayOfWeek < 1) || (dayOfWeek > 7))
			throw new IllegalArgumentException("dayOfWeek must be in range 1..7");

		final String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		return weekdays[dayOfWeek - 1];
	}

}
