package com.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

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

		Iterator it = list.descendingIterator();

		// Displaying list in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
