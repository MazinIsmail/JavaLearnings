package com.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Raj");
		list.add("Arun");
		list.add("Sai");
		list.add("Raj");
		list.add("Hari");
		list.add("Sri");
		list.add("Ram");
		list.add("Rini");
		System.out.println("Values in the List : " + list);

		// To display subList from the List
		// includes fromIndex and excludes toIndex
		List subList = list.subList(1, 4);
		// System.out.println(list.subList(1, 4));
		System.out.println("SubList values in ArrayList : " + subList);

		subList.remove(2);
		System.out.println("SubList value after removing an element: " + subList);
		// Original won't be affected.
		System.out.println("List value after removing an element from SubList: " + list);

		// Throws Exception
		/*
		 * Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 8
		 */
		// System.out.println(list.subList(0, 8));

		// Exception in thread "main" java.lang.IllegalArgumentException: fromIndex(3) >
		// toIndex(1)
		// System.out.println(list.subList(3, 1));

		// To find the first occurrence of a particular value in List
		System.out.println("\nindexOf(\"Ram\"): " + list.indexOf("Ram"));

		// To find the last occurrence of a particular value in List
		System.out.println("lastIndexOf(\"Raj\"): " + list.lastIndexOf("Raj"));

		// returns -1 if value is not in List
		System.out.println("list.lastIndexOf(\"AA\"): " + list.lastIndexOf("AA"));

		/**
		 * To check specified element is present in List returns 'true' if value is
		 * present in the list returns 'false' if value is not present in the list
		 */
		System.out.println("contains(\"Ram\"): " + list.contains("Ram"));
		System.out.println("contains(\"AA\"): " + list.contains("AA"));
	}

}
