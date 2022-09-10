package com.collections.deque;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue
 * 
 * A PriorityQueue is used when the objects are supposed to be processed based
 * on the priority. It is known that a Queue follows the First-In-First-Out
 * algorithm, but sometimes the elements of the queue are needed to be processed
 * according to the priority, that’s when the PriorityQueue comes into play.
 * 
 * The elements of the priority queue are ordered according to the natural
 * ordering, or by a Comparator provided at queue construction time, depending
 * on which constructor is used.
 * 
 * PriorityQueue doesn’t permit null.
 * 
 * Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue
 * class that implements the BlockingQueue interface to use in a java
 * multithreading environment.
 */
public class PriorityQueueLearnings {
	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(pQueue.poll());

		// Printing the top element again
		System.out.println(pQueue.peek());

		Queue<String> testStringsPQ = new PriorityQueue<>();
		testStringsPQ.add("abcd");
		testStringsPQ.add("1234");
		testStringsPQ.add("23bc");
		testStringsPQ.add("zzxx");
		testStringsPQ.add("abxy");
		System.out.println("\nStrings Stored in Natural Ordering in a Priority Queue: -");
		while (!testStringsPQ.isEmpty()) {
			System.out.println(testStringsPQ.poll());
		}

		System.out.println("\nUsing Comparator: -");
		customComparing();
	}

	private static void customComparing() {
		// A custom comparator that compares two Strings by their length.
		Comparator<String> stringLengthComparator = (s1, s2) -> {
			return s1.length() - s2.length();
		};

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
		namePriorityQueue.add("Lisa");
		namePriorityQueue.add("Robert");
		namePriorityQueue.add("John");
		namePriorityQueue.add("Chris");
		namePriorityQueue.add("Angelina");
		namePriorityQueue.add("Joe");
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}

	}
}
