package com.collections.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*HASHMAP
 * It stores the data in (Key, Value) pairs.
 * HashMap uses a technique called Hashing. 
 * Hashing is a technique of converting a large String to small String that represents the same String.
 * A shorter value helps in indexing and faster searches.
 * HashMap doesn’t allow duplicate keys but allows duplicate values.
 * It maintains no order.
 * Initial capacity 16 and load factor 0.75.
 * Internally HashMap contains an array of Node and a node is represented as a class which contains 4 fields :
 * --- int hash
 * --- K key
 * --- V value
 * --- Node next
 * */

public class HashmapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		System.out.println("Size of map is:- " + map.size());

		if (map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("value for key \"vishal\" is:- " + a);
		}
		
		Map<String, Integer> map1 = Collections.synchronizedMap(map);
		
		map.clear();

		// Parameterized : same mapping as other Map.
		HashMap<String, Integer> hset2 = new HashMap<String, Integer>(map);
		System.out.println(hset2);

		// Set mentioning the initial capacity
		HashMap<Integer, String> hset3 = new HashMap<Integer, String>(2);
		hset3.put(1, "one");
		System.out.println(hset3);

		// Default capacity : 16 and Load Factor : 0.75
		HashMap<Integer, String> hset4 = new HashMap<>(32, 0.8f);
		hset3.put(1, "one");
		System.out.println(hset4);

	}
}
