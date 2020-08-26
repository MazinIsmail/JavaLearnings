package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicReference;

/**
 * The AtomicReference class provides an object reference variable which can be
 * read and written atomically. By atomic is meant that multiple threads
 * attempting to change the same AtomicReference (e.g. with a compare-and-swap
 * operation) will not make the AtomicReference end up in an inconsistent state.
 * AtomicReference even has an advanced compareAndSet() method which lets you
 * compare the reference to an expected value (reference) and if they are equal,
 * set a new reference inside the AtomicReference object.
 */
public class AtomicReferenceLearnings {
	public static void main(String[] args) {
		AtomicReference atomicReference = new AtomicReference();

		String initialReference = "the initially referenced string";
		atomicReference = new AtomicReference(initialReference);
		String reference = (String) atomicReference.get();

		AtomicReference<String> atomicStringReference = new AtomicReference<String>();
		atomicStringReference = new AtomicReference<String>(initialReference);

		atomicStringReference.set("New object referenced");
		initialReference = "initial value referenced";

		atomicStringReference = new AtomicReference<String>(initialReference);

		String newReference = "new value referenced";
		boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		System.out.println("exchanged: " + exchanged);

		exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		System.out.println("exchanged: " + exchanged);
	}
}
