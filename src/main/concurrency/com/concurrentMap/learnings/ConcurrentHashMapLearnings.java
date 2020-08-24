package com.concurrentMap.learnings;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Since ConcurrentMap is an interface, you need to use one of its
 * implementations in order to use it. The java.util.concurrent package contains
 * the following implementations of the ConcurrentMap interface:
 * ConcurrentHashMap
 * 
 * The ConcurrentHashMap is very similar to the java.util.HashTable class,
 * except that ConcurrentHashMap offers better concurrency than HashTable does.
 * ConcurrentHashMap does not lock the Map while you are reading from it.
 * Additionally, ConcurrentHashMap does not lock the entire Map when writing to
 * it. It only locks the part of the Map that is being written to, internally.
 * 
 * Another difference is that ConcurrentHashMap does not throw
 * ConcurrentModificationException if the ConcurrentHashMap is changed while
 * being iterated. The Iterator is not designed to be used by more than one
 * thread though.
 */
public class ConcurrentHashMapLearnings {

	public static void main(String[] args) {
		ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();
		numbers.put("Two", 2);
		numbers.put("One", 1);
		numbers.put("Three", 3);
		System.out.println("ConcurrentMap: " + numbers);
		int value = numbers.get("One");
		System.out.println("Accessed Value: " + value);
		int removedValue = numbers.remove("Two");
		System.out.println("Removed Value: " + removedValue);
	}
}
