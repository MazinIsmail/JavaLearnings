package com.collections.linkedList;

import java.util.LinkedList;

/**
 * LinkedList can be converted to an Array of same type using toArray() method
 */
public class LinkedListToArray {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		list.add("John");
		list.add("Tom");

		// Displaying LinkedList elements
		System.out.println("LinkedList elements: " + list);

		/**
		 * Creates an Array variable of type String with length(equals to the size of
		 * the LinkedList)
		 */
		System.out.println("Size of LinkedList : " + list.size());
		String[] arrVar = list.toArray(new String[list.size()]);
		System.out.println("Length of Array : " + arrVar.length);
		for (int i = 0; i < arrVar.length; i++) {
			System.out.println(arrVar[i]);
		}
	}
}
