package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The AtomicInteger class provides you with a int variable which can be read
 * and written atomically, and which also contains advanced atomic operations
 * like compareAndSet(). The AtomicInteger class is located in the
 * java.util.concurrent.atomic package, so the full class name is
 * java.util.concurrent.atomic.AtomicInteger
 */
public class AtomicIntegerLearnings {
	public static void main(String[] args) {
		// AtomicInteger with the initial value 0 .
		AtomicInteger atomicInteger = new AtomicInteger();

		atomicInteger = new AtomicInteger(123);
		int theValue = atomicInteger.get();
		System.out.println("atomicInteger: " + theValue);
		atomicInteger.set(234);
		theValue = atomicInteger.get();
		System.out.println("atomicInteger: " + theValue);
		int expectedValue = 123;
		int newValue = 234;
		boolean status = atomicInteger.compareAndSet(expectedValue, newValue);
		System.out.println("status: " + status);
		atomicInteger.set(0);
		System.out.println("Current atomicInteger: " + atomicInteger.get());
		System.out.println("getAndAdd: " + atomicInteger.getAndAdd(10));
		System.out.println("After getAndAdd: " + atomicInteger.get());
		System.out.println("addAndGet: " + atomicInteger.addAndGet(10));
		System.out.println("After addAndGet: " + atomicInteger.get());
		System.out.println();
		System.out.println("addAndGet: " + atomicInteger.addAndGet(-30));

		atomicInteger.incrementAndGet();
		atomicInteger.getAndIncrement();
		atomicInteger.decrementAndGet();
		atomicInteger.getAndDecrement();
	}
}
