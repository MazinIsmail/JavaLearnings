package com.semaphore.learnings;

import java.util.concurrent.Semaphore;

/**
 * The java.util.concurrent.Semaphore class is a counting semaphore. That means
 * that it has two main methods:
 * 
 * acquire() release()
 * 
 * The counting semaphore is initialized with a given number of "permits". For
 * each call to acquire() a permit is taken by the calling thread. For each call
 * to release() a permit is returned to the semaphore. Thus, at most N threads
 * can pass the acquire() method without any release() calls, where N is the
 * number of permits the semaphore was initialized with. The permits are just a
 * simple counter.
 * 
 * As semaphore typically has two uses:
 * 
 * 1. To guard a critical section against entry by more than N threads at a
 * time.
 * 
 * 2. To send signals between two threads.
 * 
 * A semaphore controls access to a shared resource through the use of a
 * counter. If the counter is greater than zero, then access is allowed. If it
 * is zero, then access is denied. What the counter is counting are permits that
 * allow access to the shared resource. Thus, to access the resource, a thread
 * must be granted a permit from the semaphore.
 * 
 * If the semaphore’s count is greater than zero, then the thread acquires a
 * permit, which causes the semaphore’s count to be decremented. Otherwise, the
 * thread will be blocked until a permit can be acquired. When the thread no
 * longer needs an access to the shared resource, it releases the permit, which
 * causes the semaphore’s count to be incremented. If there is another thread
 * waiting for a permit, then that thread will acquire a permit at that time.
 * 
 * Race condition
 * 
 * A race condition occurs when two or more threads can access shared data and
 * they try to change it at the same time. Because the thread scheduling
 * algorithm can swap between threads at any time, you don't know the order in
 * which the threads will attempt to access the shared data. Therefore, the
 * result of the change in data is dependent on the thread scheduling algorithm,
 * i.e. both threads are "racing" to access/change the data.
 */
public class SemaphoreLearnings {
	public static void main(String[] args) throws InterruptedException {

		/**
		 * Guarding Critical Sections
		 * 
		 * If you use a semaphore to guard a critical section, the thread trying to
		 * enter the critical section will typically first try to acquire a permit,
		 * enter the critical section, and then release the permit again after.
		 */
		Semaphore semaphore = new Semaphore(1);
		semaphore.acquire();
		// ...
		semaphore.release();

		/**
		 * Sending Signals Between Threads
		 * 
		 * If you use a semaphore to send signals between threads, then you would
		 * typically have one thread call the acquire() method, and the other thread to
		 * call the release() method.
		 * 
		 * If no permits are available, the acquire() call will block until a permit is
		 * released by another thread. Similarly, a release() calls is blocked if no
		 * more permits can be released into this semaphore.
		 * 
		 * For instance, if acquire was called after Thread 1 had inserted an object in
		 * a shared list, and Thread 2 had called release() just before taking an object
		 * from that list, you had essentially created a blocking queue. The number of
		 * permits available in the semaphore would correspond to the maximum number of
		 * elements the blocking queue could hold.
		 */
		/**
		 * Fairness
		 * 
		 * No guarantees are made about fairness of the threads acquiring permits from
		 * the Semaphore. That is, there is no guarantee that the first thread to call
		 * acquire() is also the first thread to obtain a permit.
		 * 
		 * If you want to enforce fairness, the Semaphore class has a constructor that
		 * takes a boolean telling if the semaphore should enforce fairness. Enforcing
		 * fairness comes at a performance / concurrency penalty, so don't enable it
		 * unless you need it.
		 */
		Semaphore semaphoreFairness = new Semaphore(1, true);

		// creating a Semaphore object with number of permits 1
		Semaphore sem = new Semaphore(1);

		// Creating two threads with name A and B
		// Note that thread A will increment the count
		// and thread B will decrement the count
		ThreadSample mt1 = new ThreadSample(sem, "A");
		ThreadSample mt2 = new ThreadSample(sem, "B");
		mt1.start();
		mt2.start();

		// waiting for threads A and B
		mt1.join();
		mt2.join();

		// count will always remain 0 after both threads will complete their execution
		System.out.println("count: " + SharedResourceSample.count);
	}
}
