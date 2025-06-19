package com.pattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSafeSingleton2 {
	private static ThreadSafeSingleton2 instance;

	private ThreadSafeSingleton2() {
	}

	/**
	 * To avoid this extra overhead every time, double checked locking principle is
	 * used. Synchronized block is used inside the if condition with an additional
	 * check to ensure that only one instance of singleton class is created.
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

	// Trying to execute multiple threads to get the instance and check if they
	// all return the same instance. Unable to get different instances even without
	// using volatile.
	public static void main(String[] args) {
		// Test the ThreadSafeSingleton2 using multiple threads
		ExecutorService pool = Executors.newFixedThreadPool(100);

		List<Future<ThreadSafeSingleton2>> futureList = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			Future<ThreadSafeSingleton2> future = pool.submit(new CallableGetInstance());
			futureList.add(future);
		}

		// Wait for all futures to complete
		List<ThreadSafeSingleton2> instances = new ArrayList<>();

		for (Future<ThreadSafeSingleton2> future : futureList) {
			try {
				ThreadSafeSingleton2 temp = future.get();
				instances.add(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Check if all instances are the same
		for (int i = 1; i < instances.size(); i++) {
			if (instances.get(i) != instances.get(0)) {
				System.out.println("Instances are not the same!");
				return;
			}
		}

		pool.shutdown();

	}
}
