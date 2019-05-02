package com.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetMethods1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		TreeSet<Integer> treeSetObject1 = new TreeSet<Integer>();
		TreeSet<Integer> treeSetObject2 = new TreeSet<Integer>();
		// add() method
		treeSetObject1.add(3);
		// treeSetObject1.add(5);
		treeSetObject1.add(1);
		treeSetObject1.add(2);

		System.out.println("Values in TreeSetObject1 after addition: " + treeSetObject1);

		treeSetObject2.add(9);
		treeSetObject2.add(11);
		treeSetObject2.add(1);
		treeSetObject2.add(8);
		treeSetObject2.add(7);
		// addAll() method.
		treeSetObject1.addAll(treeSetObject2);

		System.out.println("Values in TreeSetObject2 : " + treeSetObject2);
		System.out.println("Values in TreeSetObject1 after addAll : " + treeSetObject1);

		/*
		 * CEILING method : This method retrieves the least element which is greater
		 * than or equal to the given element in the argument list, or null if there is
		 * no such element in the set
		 */
		System.out.println("Ceiling value of '5' TreeSetObject1 in is:" + treeSetObject1.ceiling(5));

		
		/*FLOOR method returns the greatest element which is less than or equal to the given element in the argument list,
		 * or null if there is no such element as shown in the following program:
		 */
		System.out.println("Floor value of '5' : " +treeSetObject1.floor(5));		
		
		// Clear() method.
		System.out.println("Values in TreeSetobject2 before clear:" + treeSetObject2);
		treeSetObject2.clear();
		System.out.println("Values in TreeSetobject2 after clear:" + treeSetObject2);

		// Clone() method : This method returns a shallow copy of set.
		treeSetObject2 = (TreeSet<Integer>) treeSetObject1.clone();
		System.out.println("Values in Cloned TreeSetobject2:" + treeSetObject2);

		// Comparator method : This method returns the object of Comparator Class which
		// is used to order the elements,
		// or it returns null if it is using natural ordering
		System.out.println("Value in Tree Set Comparator: " + treeSetObject1.comparator());

		// contains() method
		System.out.println("Checking if Tree Set Object contains element '0' : " + treeSetObject1.contains(0));

		// descendingIterator() method : This method retrieves an object of Iterator class,
		// which is set in decreasing order of the elements in the Set
		System.out.println("Using descendingIterator()");
		Iterator<Integer> iteratorobj = treeSetObject1.descendingIterator();
		while (iteratorobj.hasNext()) {
			System.out.print(iteratorobj.next() + " ");
		}
		
		//descendingSet() Method : This method returns a all the elements in Decreasing order
		treeSetObject2.clear();
		treeSetObject2.add(6);
		System.out.println("\nValues in TreeSetObject1 : " + treeSetObject1);
		System.out.println("Values in TreeSetObject2 before descendingSet() : " + treeSetObject2);
		treeSetObject2= (TreeSet<Integer>) treeSetObject1.descendingSet();
		System.out.println("Values in TreeSetObject2 after descendingSet(): " +treeSetObject2);
		
		//First() : This method returns the first element in the Set.
		System.out.println("Lowest element in the tree set is : " +treeSetObject2.first());
		
		//headSet(Object toElement): This method returns group of elements that are strictly less than toElement, excluding the parameter.
		treeSetObject2=(TreeSet<Integer>) treeSetObject1.headSet(7);
		System.out.println("Values in Tress Set Head Set : " + treeSetObject2 );
		
		//headSet(Object toElement, boolean inclusive):
		System.out.println("Values in Tress Set inclusive true: " + treeSetObject1.headSet(7, true));
		System.out.println("Values in Tress Set inclusive false: " + treeSetObject1.headSet(7, false) );


	}

}
