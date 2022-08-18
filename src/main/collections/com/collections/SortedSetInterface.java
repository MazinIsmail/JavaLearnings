package com.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet Interface
 * 
 * SortedSet is the alternate of Set interface that provides a total ordering on
 * its elements. The elements of the SortedSet are arranged in the increasing
 * (ascending) order.
 */
public class SortedSetInterface implements SortedSet {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Comparator comparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet subSet(Object fromElement, Object toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet headSet(Object toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet tailSet(Object fromElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object last() {
		// TODO Auto-generated method stub
		return null;
	}

}
