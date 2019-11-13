package com.thread.synchronizedLearnings;

/**
 * If you make any static method as synchronized, the lock will be on the class
 * not on object.
 * 
 * Demonstration using synchronized against normal method and not static method.
 * In this example lock is on object and not class because synchronized is
 * against normal method and not against static method.
 */

class SynchCounter {
	int count;

	synchronized void increment() {
		count++;
	}
}

class MySynchedThread extends Thread {
	SynchCounter synchCounter;

	MySynchedThread(SynchCounter t) {
		this.synchCounter = t;
	}

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			synchCounter.increment();
		}
	}

}

public class MultithreadingWithSynchronizedKeywordProblemWithoutStatic {
	public static void main(String args[]) throws Exception {
		SynchCounter counterFirst = new SynchCounter();

		MySynchedThread t1 = new MySynchedThread(counterFirst);
		MySynchedThread t2 = new MySynchedThread(counterFirst);
		MySynchedThread t3 = new MySynchedThread(counterFirst);

		SynchCounter counterSecond = new SynchCounter();

		MySynchedThread t4 = new MySynchedThread(counterSecond);
		MySynchedThread t5 = new MySynchedThread(counterSecond);
		MySynchedThread t6 = new MySynchedThread(counterSecond);
		MySynchedThread t7 = new MySynchedThread(counterSecond);
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

		// Within each object synchronized works correctly but across object it does not
		// because synchronized is against normal method and not on static
		System.out.println(counterFirst.count);
		System.out.println(counterSecond.count);
	}
}
