package com.thread.learnings;

public class DeadLockDemo {

	static class SharedResources {
		String resource1 = null;
		String resource2 = null;

		public SharedResources() {

		}

		public SharedResources(String resource1, String resource2) {
			super();
			this.resource1 = resource1;
			this.resource2 = resource2;
		}

	}

	static class MyThread1 implements Runnable {

		SharedResources sharedResources;

		public MyThread1(SharedResources sharedResources) {
			super();
			this.sharedResources = sharedResources;
		}

		@Override
		public void run() {
			synchronized (sharedResources.resource1) {
				System.out.println("Lock on resource1 by " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
				}
				System.out.println("Waiting to acquire lock on resource2 by " + Thread.currentThread().getName());
				synchronized (sharedResources.resource2) {
					System.out.println("Acquired lock on resource2");
				}

			}
		}
	}

	static class MyThread2 implements Runnable {

		SharedResources sharedResources;

		public MyThread2(SharedResources sharedResources) {
			super();
			this.sharedResources = sharedResources;
		}

		@Override
		public void run() {
			synchronized (sharedResources.resource2) {
				System.out.println("Lock on resource2 by " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
				}
				System.out.println("Waiting to acquire lock on resource1 by " + Thread.currentThread().getName());
				synchronized (sharedResources.resource1) {
					System.out.println("Acquired lock on resource1");
				}

			}
		}
	}

	public static void main(String args[]) {
		SharedResources sharedResources = new SharedResources("R1", "R2");

		Thread thread1 = new Thread(new MyThread1(sharedResources));
		Thread thread2 = new Thread(new MyThread2(sharedResources));

		thread1.start();
		thread2.start();

	}
}
