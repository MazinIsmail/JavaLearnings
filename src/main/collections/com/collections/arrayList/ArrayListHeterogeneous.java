package com.collections.arrayList;

import java.util.ArrayList;

/**
 * Arrays have a runtime check on the type of the added element. That is, if a
 * new element that is not of the same type is added, an ArrayStoreException is
 * thrown at runtime. That's why they are considered as "homegeneous". Size is
 * fixed in array.
 * 
 * "homegeneous". Size is fixed in array.
 * "homegeneous". Size is fixed in array.
 * "homegeneous". Size is fixed in array.
 * 
 * This is not true for ArrayLists (Lists in general). Due to type erasure at
 * runtime, it can practically hold any object.
 * 
 * Lists in general are heterogeneous. Size is dynamic in List.
 * Lists in general are heterogeneous. Size is dynamic in List.
 * Lists in general are heterogeneous. Size is dynamic in List.
 */
public class ArrayListHeterogeneous {
	public static void main(String[] args) {

		// Arrays are homegeneous
		Object[] array = new String[3];
		array[0] = "a";
		// throws java.lang.ArrayStoreException
		// array[1] = 1;

		ArrayList list = new ArrayList<String>();
		list.add("a");
		list.add(1); // OK
		list.add(new Object()); // OK

	}
}
