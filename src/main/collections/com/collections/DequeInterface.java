package com.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * Deque Interface
 * 
 * Deque interface extends the Queue interface. In Deque, we can remove and add
 * the elements from both the side. Deque stands for a double-ended queue which
 * enables us to perform the operations at both the ends.
 */
public class DequeInterface implements Deque {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFirst(Object e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLast(Object e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean offerFirst(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
