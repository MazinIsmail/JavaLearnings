package com.collections.vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector
 * 
 * They are very similar to ArrayList, but Vector is synchronized and has some
 * legacy methods that the collection framework does not contain.
 * 
 * Vector is synchronized. Vector proves to be very useful if you don't know the
 * size of the array in advance or you just need one that can change sizes over
 * the lifetime of a program.
 * 
 * If the increment is not specified, then the vector’s capacity gets doubled in
 * each allocation cycle. Vector increments 100% means doubles the array size if
 * the total number of elements exceeds its capacity.
 * 
 * Vector is a legacy class.
 */
public class VectorLearning {
	public static void main(String args[]) {
		Vector<Number> v1 = new Vector<Number>();
		System.out.println("Initial size v1: " + v1.size());
		System.out.println("Initial capacity v1: " + v1.capacity());
		Vector<Number> v2 = new Vector<Number>(20);
		System.out.println("Initial size v2: " + v2.size());
		System.out.println("Initial capacity v2: " + v2.capacity());
		System.out.println("");

		// initial size is 3, increment is 2
		Vector<Number> v = new Vector<Number>(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Current capacity after 4 elements: " + v.capacity());

		v.addElement(5.45);
		System.out.println("Current capacity after 5 elements: " + v.capacity());

		v.addElement(6.08);
		v.addElement(7);
		System.out.println("Current capacity after 7 elements: " + v.capacity());

		v.addElement(9.4);
		v.addElement(10);
		System.out.println("Current capacity after 9 elements: " + v.capacity());

		v.addElement(11);
		System.out.println("Current capacity after 10 elements: " + v.capacity());

		System.out.println("");
		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Integer) v.lastElement());

		if (v.contains(3))
			System.out.println("Vector contains 3.");

		// enumerate the elements in the vector.
		Enumeration<Number> vEnum = v.elements();
		System.out.println("\nElements in vector:");

		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		System.out.println();
	}
}
