package com.collections.arrayList;

//Collections is a class which is present in util package
import java.util.List;
import java.util.ArrayList;

public class ArrayListLearnings {

	public static void main(String args[]) {

		// List is an Interface and hence creating reference to the List
		/**
		 * List is an Interface which extends from Collection Interface List is an
		 * Ordered Collection and allows duplicate elements ArrayList is a class which
		 * implements from List Interface
		 */

		/**
		 * Creating an ArrayList with default constructor Initial capacity of an
		 * ArrayList is by default 10 till java1.7 Since java1.8, the initial capacity
		 * of an ArrayList is 0
		 */
		ArrayList<String> listObj = new ArrayList<String>();

		// add, remove, size, get and set
		// To find the size of the list
		System.out.println("Initial ArrayList size :" + listObj.size());

		// Adding values to the list(List1)
		listObj.add("Ram");
		listObj.add("Raj");
		listObj.add("Ravi");
		listObj.add("Raj");
		listObj.add("Sai");
		System.out.println("The values in the list are :" + listObj);

		// Create new List(List2) and Add values to the list using Index
		List<String> listIndexObj = new ArrayList<String>();
		listIndexObj.add(0, "Sri");
		listIndexObj.add(1, "Tom");
		// It displays all the values in the list
		System.out.println("The values in the list with Index position : " + listIndexObj);

		// To remove an element from the specified index of the list
		listObj.remove(1);
		System.out.println("After removing an element from the specified index of the list : " + listObj);

		// adds values of List2 to List1
		listObj.addAll(2, listIndexObj);
		System.out.println("The values added in the list from the specified Index position : " + listObj);

		/*
		 * Exception in thread "main" The values in the list with Index position : [Sri,
		 * Tom] java.lang.IndexOutOfBoundsException: Index: 4, Size: 3 at
		 * java.util.ArrayList.rangeCheckForAdd(ArrayList.java:665) at
		 * java.util.ArrayList.addAll(ArrayList.java:605) at
		 * com.collections.arrayList.ListLearnings.main(ListLearnings.java:32)
		 */
		// listObj.addAll(6,listIndexObj);
		// System.out.println("The values in the list with Index position : "+listObj);

		// To get a specific value from the list
		System.out.println("The value retrived from the Index position : " + listObj.get(2));

		// To replace the value of an element in the list
		listObj.set(4, "Tester");
		System.out.println("The value replaced in the specified Index position : " + listObj);

		// To remove all the elements from the list
		listObj.removeAll(listIndexObj);
		System.out.println("After removing all the elements of List2 from List1 : " + listObj);
		System.out.println("Initial ArrayList size :" + listObj.size());

		// To retain all the elements from the list
		System.out.println("Retaining Values");
		listObj.addAll(2, listIndexObj);
		System.out.println("The values in List1(listObj) before retain method : " + listObj);
		System.out.println("The values in the List2(listIndexObj) before retain method : " + listIndexObj);
		listObj.retainAll(listIndexObj);
		System.out.println("After retaining all the elements from the list : " + listObj);

	}

}
