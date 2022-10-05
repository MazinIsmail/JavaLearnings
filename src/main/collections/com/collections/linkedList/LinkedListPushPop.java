package com.collections.linkedList;

import java.util.LinkedList;

public class LinkedListPushPop {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the LinkedList
		list.add("Harry");
		list.add("Ajeet");
		list.add("Tom");
		list.add("Steve");
		list.add("John");
		list.add("Tom");

		// Inserts value at the front of the list
		list.push("Tom");
		System.out.println("Push Value: " + list);

		// removes front value from the list
		String temp = list.pop();
		System.out.println("Pop Value: " + list);
		System.out.println("Poped Value: " + temp);
	}
}
