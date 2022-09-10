package com.collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ArrayList can be converted to an Array of same type using toArray() method
 */
public class ArrayListToArray {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		// Adding elements to the ArrayList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		list.add("John");
		list.add("Tom");

		// Displaying ArrayList elements
		System.out.println("ArrayList elements: " + list);

		/**
		 * Creates an Array variable of type String with length(equals to the size of
		 * the ArrayList)
		 */
		System.out.println("Size of ArrayList : " + list.size());
		String[] arrVar = list.toArray(new String[list.size()]);

		System.out.println("Length of Array : " + arrVar.length);
		for (int i = 0; i < arrVar.length; i++) {
			System.out.println(arrVar[i]);
		}
	}
}
