package com.blockingQueue.learnings;

import java.util.Comparator;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * The PriorityBlockingQueue is an unbounded concurrent queue. It uses the same
 * ordering rules as the java.util.PriorityQueue class. You cannot insert null
 * into this queue.
 * 
 * All elements inserted into the PriorityBlockingQueue must implement the
 * java.lang.Comparable interface. The elements thus order themselves according
 * to whatever priority you decide in your Comparable implementation. Notice
 * that the PriorityBlockingQueue does not enforce any specific behaviour for
 * elements that have equal priority (compare() == 0).
 * 
 * Also notice, that in case you obtain an Iterator from a
 * PriorityBlockingQueue, the Iterator does not guarantee to iterate the
 * elements in priority order.
 */
public class PriorityBlockingQueueLearnings {
	public static void main(String[] args) {

		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		pbq.add(5);
		System.out.println("PriorityBlockingQueue:" + pbq);

		// Creating a Collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);

		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue(Collection c) constructor
		pbq = new PriorityBlockingQueue<Integer>(v);

		// print queue
		System.out.println("PriorityBlockingQueue:" + pbq);

		int capacity = 15;
		// create object of PriorityBlockingQueue
		// using PriorityBlockingQueue(int initialCapacity) constructor
		pbq = new PriorityBlockingQueue<Integer>(capacity);
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		System.out.println("PriorityBlockingQueue:" + pbq);

		pbq = new PriorityBlockingQueue<Integer>(capacity, Comparator.reverseOrder());
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		System.out.println("PriorityBlockingQueue:" + pbq);
	}
}
