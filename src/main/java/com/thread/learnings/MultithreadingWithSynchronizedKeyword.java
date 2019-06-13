package com.thread.learnings;

/**
 * The synchronization is mainly used to 1) To prevent thread interference. 2)
 * To prevent consistency problem. If you make any static method as
 * synchronized, the lock will be on the class not on object.a
 */

class SynchdCounter {
	static int count;

	static synchronized void increment() {// method not synchronized
		count++;
	}
}

class MySynchedThread extends Thread {
	SynchdCounter t;

	MySynchedThread(SynchdCounter t) {
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
		SynchdCounter counterFirst = new SynchdCounter();// only one object

		MySynchedThread t1 = new MySynchedThread(counterFirst);
		MySynchedThread t2 = new MySynchedThread(counterFirst);
		MySynchedThread t3 = new MySynchedThread(counterFirst);

		SynchdCounter counterSecond = new SynchdCounter();

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

		System.out.println(counterFirst.count);
		System.out.println(counterSecond.count);
	}
}
