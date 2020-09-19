package com.collections.deque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * The Deque interface present in java.util package is a subtype of the queue
 * interface. The Deque is related to the double-ended queue that supports
 * addition or removal of elements from either end of the data structure. It can
 * either be used as a queue(first-in-first-out/FIFO) or as a
 * stack(last-in-first-out/LIFO). Deque is the acronym for double ended queue.
 * 
 * You can choose between the following Deque implementations in the Java
 * Collections API:
 * 
 * java.util.LinkedList
 * 
 * java.util.ArrayDeque
 */
public class DequeLearnings {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();

		deque.add("Element 1 (Tail)");
		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");
		// Add at the first
		deque.push("Element 4 (Head)");
		// Add at the last
		deque.offer("Element 5 (Tail)");
		// Add at the first
		deque.offerFirst("Element 6 (Head)");

		System.out.println(deque + "\n");
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing " + "first and last: " + deque);

	}
}
