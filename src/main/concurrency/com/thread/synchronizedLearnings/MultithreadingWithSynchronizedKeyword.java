package com.thread.synchronizedLearnings;

/**
 * The synchronization is mainly used to 1) To prevent thread interference. 2)
 * To prevent consistency problem.
 * 
 */

class SCounter {
	int count;

	synchronized void increment() {// method not synchronized
		count++;
	}
}

class MyThreadFirstS extends Thread {
	SCounter t;

	MyThreadFirstS(SCounter t) {
		this.t = t;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			t.increment();
		}
	}

}

public class MultithreadingWithSynchronizedKeyword {
	public static void main(String args[]) throws Exception {

		// only one object
		SCounter counter = new SCounter();

		MyThreadFirstS t1 = new MyThreadFirstS(counter);
		MyThreadFirstS t2 = new MyThreadFirstS(counter);
		MyThreadFirstS t3 = new MyThreadFirstS(counter);
		MyThreadFirstS t4 = new MyThreadFirstS(counter);
		MyThreadFirstS t5 = new MyThreadFirstS(counter);
		MyThreadFirstS t6 = new MyThreadFirstS(counter);
		MyThreadFirstS t7 = new MyThreadFirstS(counter);
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
