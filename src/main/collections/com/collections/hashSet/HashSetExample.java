package com.collections.hashSet;

import java.util.HashSet;

/**
 * HASHSET
 * 
 * No duplicate values allowed. Insertion order not maintained.
 * 
 * Default capacity : 16. Default load factor : 0.75
 */
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Vision");
		hset.add("DoctorStrange");
		hset.add("IronMan");
		hset.add("Captian");
		hset.add("Vision");

		System.out.println("Avengers :" + hset);

		hset.add("Thor");
		hset.add("Witch");

		System.out.println("Avengers : " + hset);

	}

}
