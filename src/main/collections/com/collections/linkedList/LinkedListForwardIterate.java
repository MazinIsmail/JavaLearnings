package com.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListForwardIterate {

	public static void main(String args[]) {
		LinkedList<String> listObjString = new LinkedList<String>();
		// Adding values to the list(List1)
		listObjString.add("Ram");
		listObjString.add("Raj");
		listObjString.add("Ravi");
		listObjString.add("Raj");
		listObjString.add("Sai");
		listObjString.add("Steve");
		listObjString.add("John");
		listObjString.add("Tom");
		listObjString.add("John");
		System.out.println(listObjString);

		Iterator it = listObjString.iterator();
		while (it.hasNext()) {
			// it.remove();
			System.out.println(it.next());
		}
	}

}
