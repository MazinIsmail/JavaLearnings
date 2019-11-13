package com.thread.synchronizedLearnings;

/**
 * The synchronization is mainly used to 1) To prevent thread interference. 2)
 * To prevent consistency problem.
 * 
 * Synchronized block can be used to perform synchronization on any specific
 * resource of the method.
 * 
 * Synchronized block is used to lock an object for any shared resource. Scope
 * of synchronized block is smaller than the method.
 * 
 * How can we make sure main() is the last thread to finish in Java Program?
 * 
 * We can use Thread join() method to make sure all the threads created by the
 * program is dead before finishing the main function.
 */

class NewCounter {
	int count;

	void increment() {
		synchronized (this) {
			count++;
		}
	}
}

class SynchedThread extends Thread {
	NewCounter newCounter;

	SynchedThread(NewCounter t) {
		this.newCounter = t;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			newCounter.increment();
		}
	}

}

public class MultithreadingWithSynchronizedBlock {
	public static void main(String args[]) throws Exception {

		// only one object
		NewCounter counter = new NewCounter();
		SynchedThread t1 = new SynchedThread(counter);
		SynchedThread t2 = new SynchedThread(counter);
		SynchedThread t3 = new SynchedThread(counter);
		SynchedThread t4 = new SynchedThread(counter);
		SynchedThread t5 = new SynchedThread(counter);
		SynchedThread t6 = new SynchedThread(counter);
		SynchedThread t7 = new SynchedThread(counter);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

		// Thread is probably not complete so it will give unexpected result
		System.out.println(counter.count);

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();

		// Expected value is 700000
		System.out.println(counter.count);
	}
}
