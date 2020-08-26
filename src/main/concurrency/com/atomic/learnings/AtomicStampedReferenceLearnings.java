package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * The AtomicStampedReference class provides an object reference variable which
 * can be read and written atomically. By atomic is meant that multiple threads
 * attempting to change the same AtomicStampedReference will not make the
 * AtomicStampedReference end up in an inconsistent state.
 * 
 * The AtomicStampedReference is different from the AtomicReference in that the
 * AtomicStampedReference keeps both an object reference and a stamp internally.
 * The reference and stamp can be swapped using a single atomic compare-and-swap
 * operation, via the compareAndSet() method.
 * 
 * The AtomicStampedReference is designed to be able to solve the A-B-A problem
 * which is not possible to solve with an AtomicReference alone.
 */
public class AtomicStampedReferenceLearnings {
	public static void main(String[] args) {
		Object initialRef = null;
		int initialStamp = 0;
		AtomicStampedReference atomicStampedReference = new AtomicStampedReference(initialRef, initialStamp);

		String initialRefString = null;
		initialStamp = 0;

		AtomicStampedReference<String> atomicStampedReferenceTyped = new AtomicStampedReference<String>(
				initialRefString, initialStamp);
		String reference = atomicStampedReferenceTyped.getReference();
		int stamp = atomicStampedReferenceTyped.getStamp();

		// Obtain both reference and stamp as a single atomic operation is important for
		// some types of concurrent algorithms.
		int[] stampHolder = new int[1];
		String ref = atomicStampedReferenceTyped.get(stampHolder);

		System.out.println("ref = " + ref);
		System.out.println("stamp = " + stampHolder[0]);

		atomicStampedReference = new AtomicStampedReference<>(null, 0);
		String newRef = "New object referenced";
		int newStamp = 1;
		// Unconditionally sets the value of both the reference and stamp.
		atomicStampedReferenceTyped.set(newRef, newStamp);
		stampHolder = new int[1];
		stampHolder[0] = newStamp;
		ref = atomicStampedReferenceTyped.get(stampHolder);
		System.out.println("ref = " + ref);
		System.out.println("stamp = " + stampHolder[0]);

		initialRefString = "initial value referenced";
		int initialStampInt = 0;
		atomicStampedReferenceTyped = new AtomicStampedReference<String>(initialRefString, initialStamp);

		newRef = "new value referenced";
		newStamp = initialStamp + 1;
		/**
		 * public boolean compareAndSet(V expectedReference, V newReference, int
		 * expectedStamp, int newStamp)
		 * 
		 * Atomically sets the value of both the reference and stamp to the given update
		 * values if the current reference is == to the expected reference and the
		 * current stamp is equal to the expected stamp.
		 * 
		 * Parameters:
		 * 
		 * expectedReference - the expected value of the reference
		 * 
		 * newReference - the new value for the reference
		 * 
		 * expectedStamp - the expected value of the stamp
		 * 
		 * newStamp - the new value for the stampReturns:true if successful
		 */
		boolean exchanged = atomicStampedReferenceTyped.compareAndSet(initialRefString, newRef, initialStamp, newStamp);
		System.out.println("exchanged: " + exchanged); // true

		exchanged = atomicStampedReferenceTyped.compareAndSet(initialRefString, "new string", newStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged); // false

		exchanged = atomicStampedReferenceTyped.compareAndSet(newRef, "new string", initialStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged); // false

		exchanged = atomicStampedReferenceTyped.compareAndSet(newRef, "new string", newStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged); // true

		ABAproblem();
	}

	/**
	 * The AtomicStampedReference is designed to solve the A-B-A problem.
	 * 
	 * The A-B-A problem is when a reference is changed from pointing to A, then to
	 * B and then back to A.
	 * 
	 * When using compare-and-swap operations to change a reference atomically, and
	 * making sure that only one thread can change the reference from an old
	 * reference to a new, detecting the A-B-A situation is impossible.
	 * 
	 * The A-B-A problem can occur in non-blocking algorithms. Non-blocking
	 * algorithms often use a reference to an ongoing modification to the guarded
	 * data structure, to signal to other threads that a modification is currently
	 * ongoing. If thread 1 sees that there is no ongoing modification (reference
	 * points to null), another thread may submit a modification (reference is now
	 * non-null), complete the modification and swap the reference back to null
	 * without thread 1 detecting it.
	 * 
	 * By using an AtomicStampedReference instead of an AtomicReference it is
	 * possible to detect the A-B-A situation. Thread 1 can copy the reference and
	 * stamp out of the AtomicStampedReference atomically using get(). If another
	 * thread changes the reference from A to B and then back to A, then the stamp
	 * will have changed (provided threads update the stamp sensibly - e.g increment
	 * it).
	 * 
	 * The code below shows how to detect the A-B-A situation using the
	 * AtomicStampedReference:
	 */
	private static void ABAproblem() {

		Object initialRef = null;
		int initialStamp = 0;
		AtomicStampedReference atomicStampedReference = new AtomicStampedReference(initialRef, initialStamp);

		int[] stampHolder = new int[1];
		Object ref = atomicStampedReference.get(stampHolder);

		if (ref == null) {
			// prepare optimistic modification
		}

		// if another thread changes the reference and stamp here, it can be detected
		int[] stampHolder2 = new int[1];
		Object ref2 = atomicStampedReference.get(stampHolder);

		if (ref == ref2 && stampHolder[0] == stampHolder2[0]) {
			// no modification since optimistic modification was prepared
		} else {
			// retry from scratch.
		}
	}
}
