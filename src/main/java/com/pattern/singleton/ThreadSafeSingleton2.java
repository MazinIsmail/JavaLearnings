package com.pattern.singleton;

public class ThreadSafeSingleton2 {
	private static ThreadSafeSingleton2 instance;

	private ThreadSafeSingleton2() {
	}

	/*
	 * To avoid this extra overhead every time, double checked locking principle
	 * is used. Synchronized block is used inside the if condition with an
	 * additional check to ensure that only one instance of singleton class is
	 * created.
	 */
	public static ThreadSafeSingleton2 getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton2.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton2();
				}
			}
		}
		return instance;
	}
}
