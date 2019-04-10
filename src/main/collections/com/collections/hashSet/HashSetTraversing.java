package com.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversing {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Ironman");
		hset.add("Captian america");
		hset.add("Thor");

		// Using Iterator
		Iterator<String> Itr = hset.iterator();
		while (Itr.hasNext()) {
			System.out.println("Avengers : " + Itr.next());
		}

		// using foreach
		System.out.println("Using Foreach\n");
		for (String setVal : hset) {
			System.out.println(setVal);
		}
		
	}

}
