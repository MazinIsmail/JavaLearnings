package com.collections.arrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListCopy {
	public static void main(String a[]) {

		/**
		 * CopyOnWriteArrayList is a class which implements List Interface. Creates a
		 * Cloned copy and are Synchronized by default. For every update operation, a
		 * cloned copy will be created.
		 */
		CopyOnWriteArrayList<String> syncal = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		syncal.add("Tom");
		syncal.add("Jerry");
		syncal.add("Sai");

		System.out.println("Displaying ThreadSafe ArrayList Elements:" + syncal);
		// Synchronized block is not required
		/**
		 * Iterator on CopyOnWriteArrayList does not perform remove() operation
		 */
		Iterator<String> iterator = syncal.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		/**
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1178)
		 * at com.collections.arrayList.ArrayListCopy.main(ArrayListCopy.java:29)
		 * 
		 */
		iterator.remove();
		System.out.println(syncal);
	}

}
