package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * The Java AtomicIntegerArray class
 * (java.util.concurrent.atomic.AtomicIntegerArray) represents an array of int .
 * The int elements in the AtomicIntegerArray can be updated atomically. The
 * AtomicIntegerArray also supports compare-and-swap functionality.
 */
public class AtomicIntegerArrayLearnings {
	public static void main(String[] args) {

		// Creates a new AtomicIntegerArray of the given length, with all elements
		// initially zero.
		AtomicIntegerArray array = new AtomicIntegerArray(10);

		int[] ints = new int[10];
		ints[5] = 123;
		// Creates a new AtomicIntegerArray with the same length as, and all elements
		// copied from, the given array.
		AtomicIntegerArray arrayConstructor = new AtomicIntegerArray(ints);
		int value = arrayConstructor.get(5);
		System.out.println("Value: " + value);
		arrayConstructor.set(5, 999);
		value = arrayConstructor.get(5);
		System.out.println("Value: " + value);

		boolean swapped = arrayConstructor.compareAndSet(5, 999, 123);
		value = arrayConstructor.get(5);
		System.out.println("Swapped: " + swapped);
		System.out.println("Value: " + value);

		/**
		 * public final int addAndGet(int i, int delta)
		 * 
		 * Atomically adds the given value to the element at index i.
		 * 
		 * Parameters:i - the index
		 * 
		 * delta - the value to addReturns:the updated value
		 */
		int newValue = arrayConstructor.addAndGet(5, 3);
		System.out.println("newValue: " + newValue);
		int oldValue = arrayConstructor.getAndAdd(5, 3);
		System.out.println("oldValue: " + oldValue);

		newValue = arrayConstructor.incrementAndGet(5);
		System.out.println("newValue: " + newValue);
		oldValue = arrayConstructor.getAndIncrement(5);
		System.out.println("oldValue: " + oldValue);

		newValue = arrayConstructor.decrementAndGet(5);
		System.out.println("newValue: " + newValue);
		oldValue = arrayConstructor.getAndDecrement(5);
		System.out.println("oldValue: " + oldValue);
	}
}
