package com.collections.arrayList;

import java.util.*;

/**
 * ArrayList sorting is used to Sort the elements in either Ascending or
 * Descending order in the List.
 */
public class ArrayListSort {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Raj");
		list.add("Arun");
		list.add("Sai");
		list.add("Raj");
		list.add("Hari");
		System.out.println("Before Sorting");
		for (String str : list) {
			System.out.println(str);
		}

		/**
		 * Collections.reverse(listObject) is a method used to sort the elements in
		 * Reverse order
		 */
		System.out.println("Sorting list in Reverse order");
		Collections.reverse(list);
		for (String str : list) {
			System.out.println(str);
		}

		/**
		 * Collections.sort(listObject) is a method used to sort the elements in
		 * Ascending order
		 */
		System.out.println("After Sorting list in Ascending order");
		Collections.sort(list);
		for (String str : list) {
			System.out.println(str);
		}

		/**
		 * Collections.sort(listObject, Collections.reverseOrder()) is a method used to
		 * sort the elements in Descending order
		 */
		Collections.sort(list, Collections.reverseOrder());
		// Sorted List in Descending order
		System.out.println("ArrayList in Descending order:");
		for (String str : list) {
			System.out.println(str);
		}
	}

}
