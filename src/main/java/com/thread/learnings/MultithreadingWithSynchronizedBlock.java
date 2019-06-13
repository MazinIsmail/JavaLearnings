package com.thread.learnings;

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
 */

class NewCounter {
	int count;

	void increment() {
		System.out.println("Thread " + Thread.currentThread().getName() + "thrying to access synchronized block");
		synchronized (this) {
			count++;
			System.out.println(count);		
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
		NewCounter counter = new NewCounter();// only one object
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

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();

		System.out.println(counter.count);
	}
}
