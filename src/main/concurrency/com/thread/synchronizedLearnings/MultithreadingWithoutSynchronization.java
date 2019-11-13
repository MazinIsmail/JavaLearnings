package com.thread.synchronizedLearnings;

/**
 * The synchronization is mainly used to 1) To prevent thread interference. 2)
 * To prevent consistency problem.
 * 
 * This demonstrate the count value becomes inconsistent due to thread
 * interference.
 */

class Counter {
	int count;

	// method not synchronized
	void increment() {
		count++;
	}
}

class MyThreadFirst extends Thread {
	Counter counter;

	MyThreadFirst(Counter t) {
		this.counter = t;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			counter.increment();
		}
	}

}

public class MultithreadingWithoutSynchronization {
	public static void main(String args[]) throws Exception {
		// only one object
		Counter counter = new Counter();

		MyThreadFirst t1 = new MyThreadFirst(counter);
		MyThreadFirst t2 = new MyThreadFirst(counter);
		MyThreadFirst t3 = new MyThreadFirst(counter);
		MyThreadFirst t4 = new MyThreadFirst(counter);
		MyThreadFirst t5 = new MyThreadFirst(counter);
		MyThreadFirst t6 = new MyThreadFirst(counter);
		MyThreadFirst t7 = new MyThreadFirst(counter);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();

		//Expected value is 700000
		System.out.println(counter.count);
	}
}
