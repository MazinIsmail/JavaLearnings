package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Raj");
		list.add("Ravi");
		list.add("Sai");
		list.add("Raj");

		System.out.println("Values in the list are : " + list);

		// Iterate using for loop
		System.out.println("For Loop");
		for (int count = 0; count < list.size(); count++) {
			System.out.println(list.get(count));
		}

		// Advanced For Loop
		System.out.println("Advanced For Loop");
		for (String str : list) {
			System.out.println(str);
		}

		// While Loop
		System.out.println("While Loop");
		int countWhile = 0;
		while (countWhile < list.size()) {
			System.out.println(list.get(countWhile));
			countWhile++;
		}

		// Iterator
		/**
		 * Iterator is an Interface and can be applied to any Collection Objects
		 * Iterator object can be created by using iterator() method present in
		 * Collection Interface
		 */
		System.out.println("Iterator Loop");
		/**
		 * Here 'list' is any Collection object 'iterator' is of type Iterator interface
		 * and refers to Collection object 'list'
		 */
		Iterator iterator = list.iterator();
		/**
		 * hasNext() returns boolean value and returns true if it has more iteration
		 * next() returns Next element in the Iteration
		 */
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Iterator with remove() method
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(5);
		listInt.add(2);
		listInt.add(10);
		listInt.add(11);
		listInt.add(25);
		listInt.add(15);
		listInt.add(20);
		System.out.println("Integer List values : " + listInt);
		Iterator iteratorInt = listInt.iterator();
		while (iteratorInt.hasNext()) {
			int value = (Integer) iteratorInt.next();
			if (value % 2 == 0) {
				iteratorInt.remove();
				System.out.println("The value after remove method : " + listInt);
			}
		}

	}

}
