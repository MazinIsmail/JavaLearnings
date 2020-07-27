package com.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapMethodReplace {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("Initial list of elements:");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("after replace of elements:");
		// replace with key,value.
		hm.replace(102, "Gaurav");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("after replce multiple of elements:");
		// Replace with mentioning key, value and new value
		hm.replace(101, "Vijay", "Ravi");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("After replace all of elements:");
		// Replace all.
		hm.replaceAll((k, v) -> "Ajay");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
