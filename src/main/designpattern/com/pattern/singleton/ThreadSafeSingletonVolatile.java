package com.pattern.singleton;

public class ThreadSafeSingletonVolatile {

	/**
	 * Using volatile keyword ensures that multiple threads can correctly handle the
	 * instance variable when it is being initialized to the
	 * ThreadSafeSingletonVolatile instance.
	 * 
	 * The volatile keyword ensures that the instance variable is always read from
	 * the main memory, and not from the thread's local cache. This prevents issues
	 * where one thread sees a partially constructed instance while another thread
	 * is trying to use it.
	 * 
	 * This is a thread-safe singleton implementation using the double-checked
	 * locking pattern with the volatile keyword. The volatile keyword ensures that
	 * the instance variable is read from the main memory, preventing issues with
	 * reordering and visibility between threads. This implementation is efficient
	 * and safe for use in a multithreaded environment.
	 */
	private volatile static ThreadSafeSingletonVolatile instance;

	private ThreadSafeSingletonVolatile() {
	}

	/**
	 * To avoid this extra overhead every time, double checked locking principle is
	 * used. Synchronized block is used inside the if condition with an additional
	 * check to ensure that only one instance of singleton class is created.
	 */
	public static ThreadSafeSingletonVolatile getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingletonVolatile.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonVolatile();
				}
			}
		}
		return instance;
	}
	
	
}
