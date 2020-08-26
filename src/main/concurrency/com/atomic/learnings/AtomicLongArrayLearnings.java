package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicLongArray;

/**
 * Similar to 'AtomicIntegerArrayLearnings.java'
 */
public class AtomicLongArrayLearnings {
	public static void main(String[] args) {
		AtomicLongArray array = new AtomicLongArray(10);
		long[] longs = new long[10];
		longs[5] = 123;
		array = new AtomicLongArray(longs);
		long value = array.get(5);
		array.set(5, 999);
		boolean swapped = array.compareAndSet(5, 999, 123);
		long newValue = array.addAndGet(5, 3);
		long oldValue = array.getAndAdd(5, 3);
		newValue = array.incrementAndGet(5);
		oldValue = array.getAndIncrement(5);
		newValue = array.decrementAndGet(5);
		oldValue = array.getAndDecrement(5);
	}
}
