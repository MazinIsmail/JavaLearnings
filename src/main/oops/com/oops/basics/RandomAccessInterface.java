package com.oops.basics;

import java.util.ArrayList;

/**
 * All Known Implementing Classes:ArrayList, AttributeList,
 * CopyOnWriteArrayList, RoleList, RoleUnresolvedList, Stack, Vector
 * RandomAccess Interface has no methods or fields and is also called a Marker
 * Interface. These are used to indicate something to the compiler, in other
 * words implementing these interfaces is meant to imply some special treatment
 * of the implementing class. RandomAccess interface means to support for faster
 * retrieval access [generally constant time O(1)] of an element for any random
 * index chosen. Accessing any element takes the same amount of time as
 * accessing another one does. Example: You have a collection of 1 million
 * objects. Implementing RandomAccess interface makes your time to retrieve the
 * 10th element and 17869th element the same. This makes ArrayList more
 * powerful. This applies to an array (and thus to an ArrayList), as you can
 * access any item by its index. For a LinkedList however, this is not the case,
 * as you always need to follow the references to the element you want. Random
 * access in a LinkedList is O(n), while it's O(1) in an ArrayList.
 */

public class RandomAccessInterface {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Raj");
		list.add("Ravi");

		System.out.println("Values in the list are : " + list);

		// To fetch lastIndex value from the list
		// Check whether list contains values or List is not empty
		if (list != null && !list.isEmpty()) {
			System.out.println("The size of List is : " + list.size());
			/**
			 * Finds and Fetches the last value from the List
			 */
			System.out.println("The Last value in the List is : " + (list.get(list.size() - 1)));
		}
	}
}
