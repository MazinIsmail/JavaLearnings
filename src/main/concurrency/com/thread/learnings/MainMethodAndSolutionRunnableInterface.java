package com.thread.learnings;

/**
 * Below program demonstrate a use case why we need thread When we need a
 * functionality which is long running and we need other functionality works
 * with out any delay : go for thread.
 */

/*
 * Dummy class to demo multiple inheritance
 */
class Dummy {

}

class ThreadTasks extends Dummy implements Runnable {
	public void run() {
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("job 2:Printing Document #" + doc + " :Printer2");
		}
	}
}

public class MainMethodAndSolutionRunnableInterface {
	// Main method represent main thread
	// every java program has at least one thread - main thread
	public static void main(String[] args) {

		// job1
		System.out.println("*********application stasted**********");

		// job 2
		// Polymorphic statement the reference variable of the interface
		// is pointing to the object which implements it
		Runnable r = new ThreadTasks();
		Thread task = new Thread(r);
		task.start();

		// Now Main and ThreadTask are executing both parallelly and concurrently !!
		// job 3
		// Some code printing documents
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("job 1:Printing Document #" + doc + " :Printer1");
		}

	}

}
