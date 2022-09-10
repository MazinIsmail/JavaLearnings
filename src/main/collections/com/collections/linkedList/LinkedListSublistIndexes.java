package com.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSublistIndexes {

	public static void main(String args[]) {

		LinkedList<String> listObj = new LinkedList<String>();
		System.out.println("Initial ArrayList size:" + listObj.size());

		// Adding values to the list(List1)
		listObj.add("Ram");
		listObj.add("Raj");
		listObj.add("Ravi");
		listObj.add("Raj");
		listObj.add("Sai");
		listObj.add("Steve");
		listObj.add("John");
		listObj.add("Tom");
		listObj.add("John");

		System.out.println("The values in the list are:" + listObj);

		// Taking sublist from the list
		// includes fromIndex and excludes toIndex
		List subList = listObj.subList(1, 4);
		System.out.println("Sublist values are: " + subList);

		/*
		 * Exception in thread "main" java.lang.IllegalArgumentException: fromIndex(3) >
		 * toIndex(1) at java.util.SubList.<init>(AbstractList.java:624) at
		 * java.util.AbstractList.subList(AbstractList.java:484) at
		 * com.collections.linkedList.LinkedListSublist.main(LinkedListSublist.java:30)
		 */
		// List subListt = listObj.subList(3, 1);
		// System.out.println("Sublist values are : " + subListt);

		subList.remove(1);
		System.out.println("Value of sublist after removing: " + subList);
		System.out.println("Values in the list after removing an element from sublist: " + listObj);

		// Searching values in LinkedList

		// Searching first occurrence
		System.out.println("Searching first occurrence: " + listObj.indexOf("John"));

		// Searching last occurrence
		System.out.println("Searching last occurrence: " + listObj.lastIndexOf("Raj"));

		// Searching last occurrence
		System.out.println("Searching last occurrence: " + listObj.lastIndexOf("Raju"));

		// Get First element
		System.out.println("Getting first element: " + listObj.getFirst());

		// Get Last element
		System.out.println("Getting last element: " + listObj.getLast());

		// Get an element from specific index
		System.out.println("Value from index position 3: " + listObj.get(3));

		// LinkedList Reverse
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

		Iterator<String> it = list.descendingIterator();

		// Displaying list in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
