package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * ArrayDeque class which is implemented in the collection framework provides us
 * with a way to apply resizable-array. This is a special kind of array that
 * grows and allows users to add or remove an element from both sides of the
 * queue. Array deques have no capacity restrictions and they grow as necessary
 * to support usage.
 * 
 * The Java ArrayDeque class stores its elements internally in an array. If the
 * number of elements exceeds the space in the array, a new array is allocated,
 * and all elements moved over. In other words, the ArrayDeque grows as needed,
 * even if it stores its elements in an array.
 * 
 * They are not thread-safe which means that in the absence of external
 * synchronization, ArrayDeque does not support concurrent access by multiple
 * threads.
 * 
 * ArrayDeque class is likely to be faster than Stack when used as a stack.
 * ArrayDeque class is likely to be faster than LinkedList when used as a queue.
 */
public class ArrayDequeLearnings {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		// add() method to insert
		dq.add("For");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");
		System.out.println(dq);
		System.out.println(dq.pop());
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());

		System.out.println();
		dq.add("For");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");

		for (Iterator itr = dq.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
	}
}
