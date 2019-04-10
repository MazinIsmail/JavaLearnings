package com.collections.LinkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetTraversing {

	public static void main(String[] args) {

		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		hset.add("Ironman");
		hset.add("Captian america");
		hset.add("Thor");

		// Using Iterator
		System.out.println("\nUsing Iterator");
		Iterator<String> Itr = hset.iterator();
		while (Itr.hasNext()) {
			System.out.println("Avengers : " + Itr.next());
		}

		// using foreach
		System.out.println("\nUsing Foreach");
		for (String setVal : hset) {
			System.out.println(setVal);
		}
		
		// Using SplitIterator
		System.out.println("\nUsing SplitIterator");
		Spliterator<String> names = hset.spliterator();
		names.forEachRemaining((n) -> System.out.println("Avengers: " + n)); 
	}

}
