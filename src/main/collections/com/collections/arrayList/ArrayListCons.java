package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCons {
	public static void main(String args[]) {

		/**
		 * no args constructor creates ArrayList with default initial capacity as 10 but
		 * after Java 8 its 0.
		 */
		ArrayList<String> noArgsObj = new ArrayList<String>();
		noArgsObj.add("Tom");
		noArgsObj.add("Jerry");
		System.out.println("No args Constructor: " + noArgsObj);

		/**
		 * args constructor creates an ArrayList with initial capacity as 11
		 */
		ArrayList<String> argsObj = new ArrayList<String>(11);
		argsObj.add("Tom");
		argsObj.add("Jerry");
		argsObj.add("Tom");
		argsObj.add("Ram");
		argsObj.add("Raj");
		argsObj.add("Harry");
		argsObj.add("Cena");
		argsObj.add("Bella");
		argsObj.add("James");
		argsObj.add("Becky");
		argsObj.add("Raj");
		argsObj.add("Tonny");
		System.out.println("Args Constructor: " + argsObj);

		/**
		 * convert and pass an ordinary array as an argument to the ArrayList
		 * constructor Creating a Normal array
		 */
		String sArray[] = { "Tom", "Jerry", "Tom", "Ram", "Raj", "Harry" }; // ordinary good old array

		/**
		 * It takes an array sArray and creates a wrapper that implements List<String>,
		 * which makes the original array available as a list. Nothing is copied and
		 * all, only a single wrapper object is created.
		 */
		List<String> list = Arrays.asList(sArray);
		ArrayList<String> argObjArr = new ArrayList<String>(list);
		System.out.println("Values of Arrays to ArrayList: " + argObjArr);

	}
}
