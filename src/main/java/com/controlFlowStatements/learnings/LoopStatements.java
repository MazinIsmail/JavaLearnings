package com.controlFlowStatements.learnings;

/**
 * Execute the block of code repeatedly while some condition evaluates to true.
 * 
 * for loop, while loop, do-while loop.
 */
public class LoopStatements {

	public static void main(String[] args) {
		System.out.println("For Loop: -");
		forLoop();

		System.out.println("\nWhile Loop: -");
		whileLoop();

		System.out.println("\nDo-while Loop");
		doWhileLoop();
	}

	private static void forLoop() {
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);

		String[] names = { "Mazin", "Ismail" };
		for (String name : names) {
			System.out.println(name);
		}
	}

	/**
	 * If we don't know the number of iterations in advance, it is recommended to
	 * use a while loop. Unlike for loop, the initialization and increment/decrement
	 * doesn't take place inside the loop statement in while loop.
	 * 
	 * It is also known as the entry-controlled loop since the condition is checked
	 * at the start of the loop.
	 */
	private static void whileLoop() {
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers");
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
	}

	/**
	 * The do-while loop checks the condition at the end of the loop after executing
	 * the loop statements. When the number of iteration is not known and we have to
	 * execute the loop at least once, we can use do-while loop.
	 * 
	 * It is also known as the exit-controlled loop since the condition is not
	 * checked in advance.
	 */
	private static void doWhileLoop() {
		int i = 2;
		System.out.println("Printing numbers");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i < 0);
	}

}
