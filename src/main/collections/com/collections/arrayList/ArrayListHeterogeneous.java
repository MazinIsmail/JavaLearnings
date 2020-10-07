package com.collections.arrayList;

import java.util.ArrayList;

/**
 * Arrays have a runtime check on the type of the added element. That is, if a
 * new element that is not of the same type is added, an ArrayStoreException is
 * thrown at runtime. That's why they are considered as "homegeneous".
 * 
 * This is not true for ArrayLists (Lists in general). Due to type erasure at
 * runtime, it can practically hold any object.
 */
public class ArrayListHeterogeneous {
	public static void main(String[] args) {
		Object[] array = new String[3];
		array[0] = "a";
		// array[1] = 1; // throws java.lang.ArrayStoreException

		ArrayList list = new ArrayList<String>();
		list.add("a");
		list.add(1); // OK
		list.add(new Object()); // OK

	}
}
