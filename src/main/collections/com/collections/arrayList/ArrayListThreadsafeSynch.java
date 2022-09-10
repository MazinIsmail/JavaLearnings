package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ArrayList is not Thread-Safe, it should not be used in multi-thread
 * environment by default, it is not Synchronized. Make it as Synchronized
 * explicitly by using Collections.synchronizedList() method and Iterator should
 * be present inside synchronized(listObject) method.
 */
public class ArrayListThreadsafeSynch {
	public static void main(String a[]) {

		// Collections.synchronizedList is a method
		// Iterator should be in synchronized block
		List<String> syncal = Collections.synchronizedList(new ArrayList<String>());

		// Adding elements to synchronized ArrayList
		syncal.add("Tom");
		syncal.add("Jerry");
		syncal.add("Sai");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized (syncal) {
			Iterator<String> iterator = syncal.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}

		// CopyOnWriteArrayList
		/**
		 * CopyOnWriteArrayList is a class which implements List Interface. Creates a
		 * Cloned copy and are Synchronized by default. For every update operation, a
		 * cloned copy will be created.
		 */
		CopyOnWriteArrayList<String> syncalCopy = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		syncalCopy.add("Tom");
		syncalCopy.add("Jerry");
		syncalCopy.add("Sai");

		System.out.println("Displaying ThreadSafe ArrayList Elements: " + syncalCopy);
		// Synchronized block is not required
		/**
		 * Iterator on CopyOnWriteArrayList does not perform remove() operation
		 */
		Iterator<String> iterator = syncalCopy.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		/**
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1178)
		 * at com.collections.arrayList.ArrayListCopy.main(ArrayListCopy.java:29)
		 * 
		 */
		// iterator.remove();
		System.out.println("CopyOnWriteArrayList: " + syncalCopy);
	}
}
