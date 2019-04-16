package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList is not Thread-Safe It should not be used in multi-thread
 * environment By default, it is not Synchronized. It is need to make it as
 * Synchronized explicitly by using Collections.synchronizedList() method and
 * Iterator should be present inside synchronized(listObject) method
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
	}

}
