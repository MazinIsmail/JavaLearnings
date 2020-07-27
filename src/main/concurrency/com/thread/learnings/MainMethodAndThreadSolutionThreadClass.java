package com.thread.learnings;

/**
 * Below program demonstrate a use case why we need thread When we need a
 * functionality which is long running and we need other functionality works
 * with out any delay : go for thread.
 */
class ThreadTask extends Thread {
	public void run() {
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("job 2:Printing Document #" + doc + " :Printer2");
		}
	}
}

public class MainMethodAndThreadSolutionThreadClass {
//	Main method represent main thread
//	every java program has at least one thread - main thread 
	public static void main(String[] args) {

		// job1
		System.out.println("*********application stasted**********");

		// job 2
		ThreadTask task = new ThreadTask();
		// Child Thread or Worker thread.
		// start shall internally execute run method.

		// Now Main and ThreadTask are executing both parallel and concurrently.
		// job 3
		// Some code printing documents
		for (int doc = 0; doc <= 10; doc++) {
			System.out.println("job 1:Printing Document #" + doc + " :Printer1");
		}

	}

}
