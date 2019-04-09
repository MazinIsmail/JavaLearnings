package com.collections.hashSet;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		HashSet<String> hset1 = new HashSet<>();
		HashSet<String> clonedHset1 = new HashSet<>();
		HashSet<Integer> hsetNum = new HashSet<>();

		// Add() method : adding values to Set
		hset.add("Value1");
		hset.add("Value2");
		hset.add("Value3");
		System.out.println("Initial Set1 values" + hset);

		// Using addAll() method
		hset1.addAll(hset);
		System.out.println("Initial Set2 values" + hset1);

		// Using remove()
		hset1.remove("Value1");
		System.out.println("After remove Set2 values" + hset1);

		hset1.add("Value N");
		// Using removeAll() method
		hset1.removeAll(hset);
		System.out.println("After remove All Set2 values" + hset1);

		// Using removeIF
		hsetNum.add(1);
		hsetNum.add(2);
		hsetNum.add(3);
		hsetNum.add(4);
		hsetNum.removeIf(num -> num % 2 == 0);
		System.out.println("After removeIf() => " + hsetNum);

		// Clear Method : clear the set values
		hset.clear();
		System.out.println("After clear" + hset);
		hset.add("Value4");

		// returns a shallow copy of the set
		clonedHset1 = (HashSet) hset.clone();
		System.out.println("Value of Hset" + hset);
		System.out.println("Cloned set of hset :" + clonedHset1);

		hset.add("Value5");
		System.out.println("New Set values : " + hset);

		// checks whether the hashset contains the particular value
		hset.contains("Value4");
		System.out.println("Contains:" + hset.contains("Value2"));

		// check whether the Set is empty
		hset.isEmpty();
		System.out.println("IsEmpty :" + hset.isEmpty());

		// Returns the size of the set.
		hset.size();
		System.out.println("Size :" + hset.size());
	}

}
