package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The AtomicBoolean class provides you with a boolean variable which can be
 * read and written atomically, and which also contains advanced atomic
 * operations like compareAndSet(). The AtomicBoolean class is located in the
 * java.util.concurrent.atomic package, so the full class name is
 * java.util.concurrent.atomic.AtomicBoolean.
 */
public class AtomicBooleanLearnings {
	public static void main(String[] args) {
		// Creates a new AtomicBoolean with initial value false.
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		// Creates a new AtomicBoolean with the given initial value.
		AtomicBoolean atomicBooleanConstructor = new AtomicBoolean(true);

		boolean value = atomicBoolean.get();
		System.out.println("atomicBoolean: " + value);
		value = atomicBooleanConstructor.get();
		System.out.println("atomicBooleanConstructor: " + value);

		atomicBooleanConstructor.set(false);
		value = atomicBooleanConstructor.get();
		System.out.println("atomicBooleanConstructor: " + value);

		// Atomically sets to the given value and returns the previous value.
		boolean oldValue = atomicBoolean.getAndSet(true);
		System.out.println("atomicBooleanConstructor oldValue: " + oldValue);

		boolean expectedValue = true;
		boolean newValue = false;
		// Atomically sets the value to the given updated value if the current value ==
		// the expected value.
		boolean wasNewValueSet = atomicBoolean.compareAndSet(expectedValue, newValue);
		System.out.println("atomicBooleanConstructor wasNewValueSet: " + wasNewValueSet);
	}
}
