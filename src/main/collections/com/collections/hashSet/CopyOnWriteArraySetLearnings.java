package com.collections.hashSet;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * CopyOnWriteArraySet is a member of the Java Collections Framework. It is a
 * Set that uses an internal CopyOnWriteArrayList for all of its operations. It
 * was introduced in JDK 1.5, we can say that it is a thread-safe version of
 * Set. To use this class, we need to import it from java.util.concurrent
 * package.
 * 
 * The internal implementation of CopyOnWriteArraySet is CopyOnWriteArrayList
 * only.
 * 
 * Multiple Threads are able to perform update operation simultaneously but for
 * every update operation, a separate cloned copy is created. As for every
 * update a new cloned copy will be created which is costly. Hence if multiple
 * update operations are required then it is not recommended to use
 * CopyOnWriteArraySet.
 * 
 * While one thread iterating the Set, other threads can perform updation, here
 * we won’t get any runtime exception like ConcurrentModificationException.
 * 
 * An Iterator of CopyOnWriteArraySet class can perform only read-only and
 * should not perform the deletion, otherwise, we will get Run-time exception
 * UnsupportedOperationException.
 */
public class CopyOnWriteArraySetLearnings {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
		// Initial Iterator
		Iterator<String> itr = copyOnWriteArraySet.iterator();
		// add elements using add() method
		copyOnWriteArraySet.add("Maz");
		copyOnWriteArraySet.add("Maz");
		copyOnWriteArraySet.add("Mazin");
		copyOnWriteArraySet.add("Mazin");

		System.out.println("Set contains: ");
		while (itr.hasNext())
			System.out.println(itr.next());

		itr = copyOnWriteArraySet.iterator();
		System.out.println("Set contains:");
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
