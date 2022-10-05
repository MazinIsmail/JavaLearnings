package com.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList can be converted to an Array of same type using toArray() method
 */
public class LinkedListToArrayAndArrayList {
	public static void main(String args[]) {
		LinkedList<String> listArr = new LinkedList<String>();

		// Adding elements to the LinkedList
		listArr.add("Harry");
		listArr.add("Ajeet");
		listArr.add("Tom");
		listArr.add("Steve");
		listArr.add("John");
		listArr.add("Tom");

		// Displaying LinkedList elements
		System.out.println("LinkedList elements: " + listArr);

		/**
		 * Creates an Array variable of type String with length(equals to the size of
		 * the LinkedList)
		 */
		System.out.println("Size of LinkedList : " + listArr.size());
		String[] arrVar = listArr.toArray(new String[listArr.size()]);
		System.out.println("Length of Array : " + arrVar.length);
		for (String arV : arrVar) {
			System.out.println(arV);
		}

		/**
		 * LinkedList can be converted to an ArrayList by passing LinkedList object as
		 * an argument to ArrayList
		 */
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
		 * Passed LinkedList object 'list' as an argument to ArrayList
		 */
		ArrayList<String> alObject = new ArrayList<String>(list);
		System.out.println("After converting LinkedList to ArrayList : " + alObject);

	}
}
