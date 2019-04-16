package com.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList can be converted to an ArrayList by passing LinkedList object as
 * an argument to ArrayList
 */
public class LinkedListConvert {
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
		 * Passed LinkedList object 'list' as an argument to ArrayList
		 */
		ArrayList<String> alObject = new ArrayList<String>(list);
		System.out.println("After converting LinkedList to ArrayList : " + alObject);
	}
}
