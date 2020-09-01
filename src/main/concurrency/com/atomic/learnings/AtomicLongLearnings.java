package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Similar to 'AtomicInteger.java'
 */
public class AtomicLongLearnings {
	public static void main(String[] args) {
		AtomicLong atomicLong = new AtomicLong();
		atomicLong = new AtomicLong(123);
		long theValue = atomicLong.get();
		atomicLong.set(234);
		long expectedValue = 123;
		long newValue = 234;
		atomicLong.compareAndSet(expectedValue, newValue);
		System.out.println(atomicLong.getAndAdd(10));
		System.out.println(atomicLong.addAndGet(10));
	}
}
