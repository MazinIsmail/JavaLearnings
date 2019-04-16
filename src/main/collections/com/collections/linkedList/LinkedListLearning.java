package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListLearning {

	public static void main(String args[]) {

		/**
		 * LinkedList does not have initial capacity
		 */
		LinkedList<String> list = new LinkedList<String>();

		/**
		 * The constructor LinkedList<String>(int) is undefined
		 */
		/**
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
		 * List cannot be resolved to a type The constructor LinkedList<String>(int) is
		 * undefined
		 * 
		 * at
		 * com.collections.linkedList.LinkedListLearning.main(LinkedListLearning.java:17)
		 */
		//List<String> arraylist = new LinkedList<String>(10);

		// Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		list.add("John");
		list.add("Tom");

		// Displaying LinkedList elements
		System.out.println("LinkedList elements: " + list);

		// Adding element to the specified index
		list.add(2, "Harry");
		System.out.println("After adding elements: " + list);

		// Adding value at the beginning
		list.addFirst("Raj");
		System.out.println("Added value at the beginning: " + list);

		// Adding value at the end of the list
		list.addLast("Jerry");
		System.out.println("Added value at the end of the list: " + list);

		// Adding element to front of Linked List(Head)
		list.offerFirst("AddHead");
		System.out.println("Added value at the front of the list and returns boolean value if Insertion is successful: "
				+ list.offerFirst("AddHead"));

		// Removing first element
		System.out.println("Removes first value of the list: " + list.removeFirst());
		System.out.println("After removing first element from the list: " + list);

		// Removing Last element
		System.out.println("Removes last value of the list: " + list.removeLast());
		System.out.println("After removing last element from the list: " + list);

		// Removing element from specified index
		list.remove(2);
		System.out.println("After removing an element from index position 2 : " + list);

		// Removing an element from the list
		list.remove("Harry");
		System.out.println("After removing value 'Harry' from the list : " + list);

		// Removes all the elements from the list
		list.clear();
		System.out.println("After clear() method : " + list);

		// Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		list.add("John");
		list.add("Tom");

		LinkedList<String> newList = new LinkedList<String>();
		newList.add("");
		newList.add("Test");
		newList.add("");
		newList.add("Bella");
		System.out.println("The values of newList are : " + newList);

		// Adding values of List2 to List1
		list.addAll(newList);
		System.out.println("Values appended to List1" + list);

		list.removeAll(newList);
		System.out.println("Values of List2 removed from List1" + list);

		// Adding values of List2 to List1 from specified index
		list.addAll(2, newList);
		System.out.println("Values appended to List1" + list);

		// To replace a value
		list.set(2, "Chan");
		System.out.println("After replacing a value : " + list);

		// To check the value is existing in list or not
		System.out.println(list.contains("Chaan"));
		System.out.println(list.contains("Chan"));
	}
}
