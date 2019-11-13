package com.thread.synchronizedLearnings;

/**
 * If you make any static method as synchronized, the lock will be on the class
 * not on object.
 */

class StaticCounter {
	static int count;

	static synchronized void increment() {
		count++;
	}
}

class MyStaticCounterThread extends Thread {
	StaticCounter staticCounter;

	MyStaticCounterThread(StaticCounter staticCounter) {
		this.staticCounter = staticCounter;
	}

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			StaticCounter.increment();
		}
	}

}

public class MultithreadingWithSynchronizedKeywordWithStatic {
	public static void main(String args[]) throws Exception {
		StaticCounter counterFirst = new StaticCounter();

		MyStaticCounterThread t1 = new MyStaticCounterThread(counterFirst);
		MyStaticCounterThread t2 = new MyStaticCounterThread(counterFirst);
		MyStaticCounterThread t3 = new MyStaticCounterThread(counterFirst);

		StaticCounter counterSecond = new StaticCounter();

		MyStaticCounterThread t4 = new MyStaticCounterThread(counterSecond);
		MyStaticCounterThread t5 = new MyStaticCounterThread(counterSecond);
		MyStaticCounterThread t6 = new MyStaticCounterThread(counterSecond);
		MyStaticCounterThread t7 = new MyStaticCounterThread(counterSecond);
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
