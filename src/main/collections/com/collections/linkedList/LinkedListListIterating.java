package com.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * ListIterator is an Interface which is used to Traverse List in both Forward
 * and Backward direction
 */
/**
 * It is used to perform CRUD(Create, Read, Update, Delete) operation while
 * traversing through the List
 */
public class LinkedListListIterating {

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

		ListIterator listIterateObj = list.listIterator();

		// Forward Traverse
		/**
		 * Adding value while traversing through the list
		 */
		System.out.println("Forward Traverse");
		while (listIterateObj.hasNext()) {
			listIterateObj.add("Srri");
			System.out.println(listIterateObj.next());
		}
		System.out.println("Adding values while traversing through the List : " + list);

		// Backward Traverse
		System.out.println("Backward Traverse");
		while (listIterateObj.hasPrevious()) {
			System.out.println(listIterateObj.previous());
		}

		/**
		 * LinkedList Forward Iteration
		 */
		LinkedList<String> listObjString = new LinkedList<String>();
		// Adding values to the list(List1)
		listObjString.add("Ram");
		listObjString.add("Raj");
		listObjString.add("Ravi");
		listObjString.add("Raj");
		listObjString.add("Sai");
		listObjString.add("Steve");
		listObjString.add("John");
		listObjString.add("Tom");
		listObjString.add("John");
		System.out.println(listObjString);

		Iterator it = listObjString.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
