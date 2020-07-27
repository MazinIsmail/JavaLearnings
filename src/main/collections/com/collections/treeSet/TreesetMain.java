package com.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TREESET
 * 
 * Elements will be sorted(default: ascending order). Will not maintain
 * insertion order. TreeSet cannot contain null value. TreeSet class is not
 * thread-safe. TreeSet internally uses a TreeMap to store elements. TreeSet
 * duplicate values are not allowed. TreeSet is basically implementation of a
 * self-balancing binary search tree like Red-Black Tree. The elements in a
 * TreeSet are sorted as per their natural ordering, or based on a custom
 * Comparator that is supplied at the time of creation of the TreeSet. TreeSet
 * does not allow to insert Heterogeneous objects. It will throw
 * classCastException at Runtime
 * 
 */
public class TreesetMain {

	public static void main(String[] args) {

		TreeSet<Integer> al = new TreeSet<Integer>();
		al.add(554);
		al.add(9);
		al.add(8);
		al.add(15);
		// Traversing elements using
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}