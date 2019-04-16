package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDiff {

	public static void main(String args[]) {

		/**
		 * When trying to add all the values from one List to another List, the dataType
		 * of both lists should be of same type. If both are of different types, then it
		 * will not possible to add values from one List to another List
		 */
		List<String> listObj = new ArrayList<String>();

		// To find the size of the list
		System.out.println("Initial ArrayList size :" + listObj.size());

		// Adding values to the list(List1)
		listObj.add("Ram");
		listObj.add("Raj");
		listObj.add("Ravi");
		listObj.add("Raj");
		listObj.add("Raj");
		listObj.add("Sai");

		// Adding values to the list of type Double
		ArrayList<Double> listObjDouble = new ArrayList<Double>();
		listObjDouble.add((double) 15);
		listObjDouble.add((double) 30);
		listObjDouble.add((double) 45);
		System.out.println("Double Datatype : " + listObjDouble);

		// Adding values to the list of type Float
		ArrayList<Float> listObjFloat = new ArrayList<Float>();
		listObjFloat.add(15f);
		listObjFloat.add(30f);
		listObjFloat.add(45f);
		System.out.println("Float Datatype : " + listObjFloat);

		/**
		 * The method addAll(Collection<? extends Double>) in the type ArrayList<Double>
		 * is not applicable for the arguments (ArrayList<Float>). Since, here trying to
		 * add List of type Float to another List of type Double
		 */
		// listObjDouble.addAll(listObjFloat);
	}
}
