package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Collection in Java is a framework that provides an architecture to store
 * and manipulate the group of objects.
 * 
 * 
 * Collection framework: The Collection framework represents a unified
 * architecture for storing and manipulating a group of objects. It has:
 * Interfaces and its implementations, i.e., classes, and Algorithm.
 * 
 * Java collection class is used exclusively with static methods that operate on
 * or return collections.
 */
public class CollectionsClass {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("Shoes");
		items.add("Toys");

		// Add one or more elements
		Collections.addAll(items, "Fruits", "Bat", "Ball");

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		// Sorting according to default ordering
		System.out.println("\nSorting...");
		Collections.sort(items);

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		System.out.println();

		// Sorting according to reverse ordering
		Collections.sort(items, Collections.reverseOrder());
		//Collections.reverseOrder(items);

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		// BinarySearch on the List
		System.out.println("\nThe index of Horse is " + Collections.binarySearch(items, "Toys"));

		List<String> destination_List = new ArrayList<>();
		destination_List.add("Shoes");
		destination_List.add("Toys");
		destination_List.add("Horse");
		destination_List.add("Tiger");
		List<String> source_List = new ArrayList<>();
		source_List.add("Bat");
		source_List.add("Frog");
		source_List.add("Lion");
		// Copy the elements from source to destination.
		// After the operation, the index of each copied element in the destination
		// list will be identical to its index in the source list.
		Collections.copy(destination_List, source_List);
		System.out.println("\nThe Destination List After copying:  ");
		for (int i = 0; i < destination_List.size(); i++) {
			System.out.print(destination_List.get(i) + " ");
		}

		// Check if disjoint or not
		System.out.println("\ndisjoint check: " + Collections.disjoint(destination_List, source_List));
	}

}
