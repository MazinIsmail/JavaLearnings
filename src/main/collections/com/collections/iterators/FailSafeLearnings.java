package com.collections.iterators;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Fail-Safe
 * 
 * First of all, there is no term as fail-safe given in many places as Java SE
 * specifications does not use this term.
 * 
 * Fail-Safe iterators don’t throw any exceptions if a collection is
 * structurally modified while iterating over it. This is because, they operate
 * on the clone of the collection, not on the original collection and that’s why
 * they are called fail-safe iterators. Iterator on CopyOnWriteArrayList,
 * ConcurrentHashMap classes are examples of fail-safe Iterator.
 * 
 * Any structural modification done to the iterator affects the copied
 * collection, not original collection. So, original collection remains
 * structurally unchanged.
 * 
 * These iterators require extra memory for cloning of collection. Ex :
 * ConcurrentHashMap, CopyOnWriteArrayList
 * 
 * The major difference between fail-fast and fail-safe is that fail-safe
 * iterator doesn’t throw any Exception, contrary to fail-fast Iterator. This is
 * because they work on a clone of Collection instead of the original collection
 * and that’s why they are called as the fail-safe iterator.
 * 
 */
public class FailSafeLearnings {
	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer number = (Integer) itr.next();
			System.out.println(number);
			if (number == 8) {
				// This will not print, hence it has created separate copy
				list.add(14);
			}
		}
		doesNotCreateSeparateCopy();
	}

	/**
	 * Collections which don’t use fail-fast concept may not necessarily create
	 * clone/snapshot of it in memory to avoid ConcurrentModificationException. For
	 * example, in case of ConcurrentHashMap, it does not operate on a separate copy
	 * although it is not fail-fast. Instead, it has semantics that is described by
	 * the official specification as weakly consistent(memory consistency properties
	 * in Java).
	 * 
	 * The iterators returned by ConcurrentHashMap is weakly consistent. This means
	 * that this iterator can tolerate concurrent modification, traverses elements
	 * as they existed when iterator was constructed and may (but not guaranteed to)
	 * reflect modifications to the collection after the construction of the
	 * iterator.
	 */
	private static void doesNotCreateSeparateCopy() {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			// This will reflect in iterator. Hence, it has not created separate copy.
			map.put("SEVEN", 7);
		}
	}
}
