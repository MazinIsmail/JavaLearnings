package com.collections.linkedList;

import java.util.LinkedList;

/**
 * To clone an LinkedList, clone() method is used. It returns Shallow copy of
 * LinkedList instance. Clone an LinkedList of type (for eg: String) to an
 * another LinkedList of type String. Whenever adding/removing few elements from
 * Original LinkedList, the cloned LinkedList didn't get affected. It means that
 * the clone() method just returns a Shallow copy of LinkedList
 */
public class LinkedListClone {

	public static void main(String args[]) {

		LinkedList<String> llOriginal = new LinkedList<String>();

		// Adding elements to the LinkedList
		llOriginal.add("Apple");
		llOriginal.add("Orange");
		llOriginal.add("Mango");
		llOriginal.add("Grapes");
		System.out.println("LinkedList Original : " + llOriginal);

		/**
		 * Clone LinkedList 'alOriginal' to another LinkedList 'alClone'
		 */
		LinkedList<String> llClone = (LinkedList<String>) llOriginal.clone();
		System.out.println("Shallow copy of LinkedList: " + llClone);
		llOriginal.add("Pomo");
		llOriginal.add("Watermelon");
		System.out.println("Original LinkedList after adding new values :" + llOriginal);

		/**
		 * Shallow copy will not get affected when there is a change in the Original
		 * LinkedList
		 */
		System.out.println(
				"Shallow copy LinkedList after adding new values to Original does not effect Clone: " + llClone);
	}
}
