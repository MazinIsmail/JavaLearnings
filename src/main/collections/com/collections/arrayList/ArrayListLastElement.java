package com.collections.arrayList;

import java.util.*;

public class ArrayListLastElement {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Raj");
		list.add("Ravi");
		list.add("Sai");
		list.add("Raj");
		System.out.println("Values in the list are : " + list);

		// To fetch lastIndex value from the list
		// Check whether list contains values or List is not empty
		if (list != null && !list.isEmpty()) {
			System.out.println("The size of List is : " + list.size());
			/**
			 * Finds and Fetches the last value from the List
			 */
			System.out.println("The Last value in the List is : " + (list.get(list.size() - 1)));
		}
	}
}
