package com.collections.arrayList;

import java.util.ArrayList;

/**
 * To clone an ArrayList, clone() method is used. It returns Shallow copy of
 * ArrayList instance. Clone an ArrayList of type (for eg: String) to an another
 * ArrayList of type String. Whenever adding/removing few elements from Original
 * ArrayList, the cloned ArrayList didn't get affected. It means that the
 * clone() method just returns a Shallow copy of ArrayList
 */
public class ArrayListClone {

	public static void main(String args[]) {

		ArrayList<String> alOriginal = new ArrayList<String>();
		// Adding elements to the ArrayList
		alOriginal.add("Apple");
		alOriginal.add("Orange");
		alOriginal.add("Mango");
		alOriginal.add("Grapes");
		System.out.println("ArrayList Original: " + alOriginal);

		/**
		 * Clone ArrayList 'alOriginal' to another ArrayList 'alClone'
		 */
		ArrayList<String> alClone = (ArrayList<String>) alOriginal.clone();
		System.out.println("Shallow copy of ArrayList: " + alClone);

		alOriginal.add("Pomo");
		alOriginal.add("Watermelon");
		System.out.println("Original ArrayList after adding new values in Original: " + alOriginal);

		/**
		 * Shallow copy will not get affected when there is a change in the Original
		 * ArrayList
		 */
		System.out.println("Shallow copy ArrayList after adding new values in Original:" + alClone);

		alClone.add("Berry");
		System.out.println("\nAfter adding values in Clone:-");
		System.out.println("Original ArrayList after adding new values in Clone: " + alOriginal);
		System.out.println("Shallow copy ArrayList after adding new values in Clone: " + alClone);

	}
}
