package com.collections.LinkedhashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetConstructorExample {

	public static void main(String[] args) {

		// Default
		LinkedHashSet<String> linset = new LinkedHashSet<String>();

		ArrayList<String> Arr = new ArrayList<String>();
		Arr.add("Uno");

		// Parameterized : converting other collections
		LinkedHashSet<String> linset2 = new LinkedHashSet<String>(Arr);
		System.out.println(linset2);

		// Set mentioning the initial capacity
		LinkedHashSet<String> linset3 = new LinkedHashSet<String>(2);
		linset3.add("one");
		System.out.println(linset3);

		// Default capacity : 16 and Load Factor : 0.75
		LinkedHashSet<String> linset4 = new LinkedHashSet<>(32, 8);
		linset3.add("one");
		System.out.println(linset4);

	}

}
