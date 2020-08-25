package com.semaphore.learnings;

import java.util.concurrent.Semaphore;

/**
 * In a multithreaded application, two or more threads may need to access a
 * shared resource at the same time, resulting in unexpected behavior. Examples
 * of such shared resources are data-structures, input-output devices, files,
 * and network connections.
 * 
 * This scenario is called a race condition. And, the part of the program which
 * accesses the shared resource is known as the critical section. So, to avoid a
 * race condition, we need to synchronize access to the critical section.
 * 
 * A mutex (or mutual exclusion) is the simplest type of synchronizer – it
 * ensures that only one thread can execute the critical section of a computer
 * program at a time.
 * 
 * To access a critical section, a thread acquires the mutex, then accesses the
 * critical section, and finally releases the mutex. In the meantime, all other
 * threads block till the mutex releases. As soon as a thread exits the critical
 * section, another thread can enter the critical section.
 * 
 * Different ways to implement a mutex:-
 * 
 * Synchronized keyword, which is the simplest way to implement a mutex in Java.
 * 
 * Can use the synchronized block to synchronize on a custom mutex object.
 * 
 * Can use the ReentrantLock to achieve mutual exclusion. It provides more
 * flexibility and control than the synchronized keyword approach.
 * 
 * While in case of a mutex only one thread can access a critical section,
 * Semaphore allows a fixed number of threads to access a critical section.
 * Therefore, we can also implement a mutex by setting the number of allowed
 * threads in a Semaphore to 1.
 * 
 */
public class MutexLearnings {
	public static void main(String[] args) {

//		synchronized method
//	    public synchronized int getNextSequence() {
//	        return super.getNextSequence();
//	    }

//		synchronized block
//		private Object mutex = new Object();
//		public int getNextSequence() {
//	        synchronized (mutex) {
//	            return super.getNextSequence();
//	        }
//	    }

//		ReentrantLock
//		private ReentrantLock mutex = new ReentrantLock();
//		public int getNextSequence() {
//		try {
//			mutex.lock();
//			return super.getNextSequence();
//		} finally {
//			mutex.unlock();
//		}

//		Semaphore
//		private Semaphore mutex = new Semaphore(1);
//		 
//	    public int getNextSequence() {
//	        try {
//	            mutex.acquire();
//	            return super.getNextSequence();
//	        } catch (InterruptedException e) {
//	            // exception handling code
//	        } finally {
//	            mutex.release();
//	        }
//	    }
//		In this usage, you're only calling release() after a successful acquire()
//		try {
//			  mutex.acquire();
//			  try {
//			    // do something
//			  } finally {
//			    mutex.release();
//			  }
//			} catch(InterruptedException ie) {
//			  // ...
//			}

	}
}
