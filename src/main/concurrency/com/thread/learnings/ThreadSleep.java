package com.thread.learnings;

/**
 * The sleep() method of Thread class is used to sleep a thread for the
 * specified amount of time.
 * 
 * After starting a thread, it can never be started again. If you does so, an
 * IllegalThreadStateException is thrown. In such case, thread will run once but
 * for second time, it will throw exception.
 */
public class ThreadSleep extends Thread {

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " :: Let me sleep.");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + " :: Am Awake");
	}

	public static void main(String args[]) {

		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		ThreadSleep t3 = new ThreadSleep();
		ThreadSleep t4 = new ThreadSleep();
		ThreadSleep t5 = new ThreadSleep();
		ThreadSleep t6 = new ThreadSleep();
		ThreadSleep t7 = new ThreadSleep();

		// Thread may execute in any order irrespective of their start order
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

	}
}