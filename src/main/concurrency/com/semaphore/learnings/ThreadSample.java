package com.semaphore.learnings;

import java.util.concurrent.Semaphore;

public class ThreadSample extends Thread {
	Semaphore sem;
	String threadName;

	public ThreadSample(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}

	@Override
	public void run() {

		// run by thread A
		if (this.getName().equals("A")) {
			System.out.println("Starting " + threadName);
			try {
				// First, get a permit.
				System.out.println(threadName + " is waiting for a permit.");
				// acquiring the lock
				sem.acquire();
				System.out.println(threadName + " gets a permit.");

				// Now, accessing the shared resource. Other waiting threads will wait, until
				// this thread release the lock.
				for (int i = 0; i < 5; i++) {
					SharedResourceSample.count++;
					System.out.println(threadName + ": " + SharedResourceSample.count);

					// Now, allowing a context switch. If possible for thread B to execute.
					Thread.sleep(1000);
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}

			// Release the permit.
			System.out.println(threadName + " releases the permit.");
			sem.release();
		}

		// run by thread B
		else {
			System.out.println("Starting " + threadName);
			try {
				System.out.println(threadName + " is waiting for a permit.");
				// acquiring the lock
				sem.acquire();
				System.out.println(threadName + " gets a permit.");
				// Now, accessing the shared resource. Other waiting threads will wait, until
				// this thread release the lock
				for (int i = 0; i < 5; i++) {
					SharedResourceSample.count--;
					System.out.println(threadName + ": " + SharedResourceSample.count);

					// Now, allowing a context switch. If possible for thread A to execute.
					Thread.sleep(1000);
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			// Release the permit.
			System.out.println(threadName + " releases the permit.");
			sem.release();
		}
	}
}
