package com.collections.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetConstructorExample {

	public static void main(String[] args) {

		// Default
		HashSet<String> hset = new HashSet<String>();

		ArrayList<String> Arr = new ArrayList<String>();
		Arr.add("Uno");

		// Parameterized : converting other collections
		//TODO: Duplicate removal
		HashSet<String> hset2 = new HashSet<String>(Arr);
		System.out.println(hset2);

		// Set mentioning the initial capacity
		HashSet<String> hset3 = new HashSet<String>(2);
		hset3.add("one");
		System.out.println(hset3);

		// Default capacity : 16 and Load Factor : 0.75
		HashSet<String> hset4 = new HashSet<>(32, 0.8f);
		hset3.add("one");
		System.out.println(hset4);

	}

}
