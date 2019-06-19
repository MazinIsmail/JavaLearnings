package com.thread.learnings;

public class DeadLockDemo {

	public static void main(String[] args) throws InterruptedException {
		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");
					boolean isLocked = Thread.holdsLock(resource1);
					System.out.println("Check lock for resource 1 in thread 1 :: " +isLocked);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					boolean isLocked = Thread.holdsLock(resource2);
					System.out.println("Check lock for resource 2 in thread 2 :: " + isLocked);

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("no dead lock");
	}
}
