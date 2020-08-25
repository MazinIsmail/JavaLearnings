package com.lock.learnings;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized keyword is quite rigid in its use. For example, a thread can
 * take a lock only once. Synchronized blocks don’t offer any mechanism of a
 * waiting queue and after the exit of one thread, any thread can take the lock.
 * This could lead to starvation of resources for some other thread for a very
 * long period of time.
 * 
 * Reentrant Locks are provided in Java to provide synchronization with greater
 * flexibility.
 * 
 * As the name says, ReentrantLock allow threads to enter into lock on a
 * resource more than once. When the thread first enters into lock, a hold count
 * is set to one. Before unlocking the thread can re-enter into lock again and
 * every time hold count is incremented by one. For every unlock request, hold
 * count is decremented by one and when hold count is 0, the resource is
 * unlocked.
 * 
 * Reentrant Locks also offer a fairness parameter, by which the lock would
 * abide by the order of the lock request i.e. after a thread unlocks the
 * resource, the lock would go to the thread which has been waiting for the
 * longest time. This fairness mode is set up by passing true to the constructor
 * of the lock.
 * 
 * The unlock statement is always called in the finally block to ensure that the
 * lock is released even if an exception is thrown in the method body (try
 * block).
 * 
 * The ReentrantLock is a better replacement for synchronization, which offers
 * many features not provided by synchronized. However, the existence of these
 * obvious benefits are not a good enough reason to always prefer ReentrantLock
 * to synchronized. Instead, make the decision on the basis of whether you need
 * the flexibility offered by a ReentrantLock.
 */
public class ReentrantLockLearnings implements Runnable {
	private String name;
	private ReentrantLock reentrantLock;

	public ReentrantLockLearnings(ReentrantLock reentrantLock, String name) {
		this.reentrantLock = reentrantLock;
		this.name = name;
	}

	public void run() {
		boolean done = false;
		while (!done) {
			// Getting Outer Lock
			boolean outterLock = reentrantLock.tryLock();
			if (outterLock) {
				try {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println(
							"task name - " + name + " outer lock acquired at " + ft.format(d) + " Doing outer work");
					Thread.sleep(1500);

					// Getting Inner Lock
					reentrantLock.lock();
					try {
						d = new Date();
						ft = new SimpleDateFormat("hh:mm:ss");
						System.out.println("task name - " + name + " inner lock acquired at " + ft.format(d)
								+ " Doing inner work");
						System.out.println("Lock Hold Count - " + reentrantLock.getHoldCount());
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						// Inner lock release
						System.out.println("task name - " + name + " releasing inner lock");
						reentrantLock.unlock();
					}
					System.out.println("Lock Hold Count - " + reentrantLock.getHoldCount());
					System.out.println("task name - " + name + " work done");
					done = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					// Outer lock release
					System.out.println("task name - " + name + " releasing outer lock");
					reentrantLock.unlock();
					System.out.println("Lock Hold Count - " + reentrantLock.getHoldCount());
				}
			} else {
				System.out.println("task name - " + name + " waiting for lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		ReentrantLock reentrantLock = new ReentrantLock();
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Runnable w1 = new ReentrantLockLearnings(reentrantLock, "Job1");
		Runnable w2 = new ReentrantLockLearnings(reentrantLock, "Job2");
		Runnable w3 = new ReentrantLockLearnings(reentrantLock, "Job3");
		Runnable w4 = new ReentrantLockLearnings(reentrantLock, "Job4");
		pool.execute(w1);
		pool.execute(w2);
		pool.execute(w3);
		pool.execute(w4);
		pool.shutdown();

		/**
		 * Creates an instance of ReentrantLock with the given fairness policy. The
		 * fairness parameter used to construct the lock object decreases the throughput
		 * of the program.
		 */
		ReentrantLock reentrantLockFair = new ReentrantLock(true);
	}
}
