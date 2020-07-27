package com.collections.linkedhashmaptreemap;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap
 * 
 * IT MAINTAINS INSERTION ORDER. Uses doubly linked list. It stores the data in
 * (Key, Value) pairs. HashMap uses a technique called Hashing.
 * 
 * Hashing is a technique of converting a large String to small String that
 * represents the same String. A shorter value helps in indexing and faster
 * searches. HashMap doesn’t allow duplicate keys but allows duplicate values.
 * It maintains no order. Initial capacity 16 and load factor 0.75.
 */
public class LinkedhashMapConstructor {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		System.out.println("Size of map is:- " + map.size());

		if (map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("value for key \"vishal\" is:- " + a);
		}

		map.clear();

		// Parameterized : same mapping as other Map.
		LinkedHashMap<String, Integer> hset2 = new LinkedHashMap<String, Integer>(map);
		System.out.println(hset2);

		// Set mentioning the initial capacity
		LinkedHashMap<Integer, String> hset3 = new LinkedHashMap<Integer, String>(2);
		hset3.put(1, "one");
		System.out.println(hset3);

		// Default capacity : 16 and Load Factor : 0.75
		LinkedHashMap<Integer, String> hset4 = new LinkedHashMap<>(32, 0.8f);
		hset3.put(1, "one");
		System.out.println(hset4);
	}

}
