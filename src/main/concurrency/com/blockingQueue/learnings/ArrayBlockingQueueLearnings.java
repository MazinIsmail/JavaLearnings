package com.blockingQueue.learnings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * ArrayBlockingQueue is a bounded, blocking queue that stores the elements
 * internally in an array. That it is bounded means that it cannot store
 * unlimited amounts of elements. There is an upper bound on the number of
 * elements it can store at the same time. You set the upper bound at
 * instantiation time, and after that it cannot be changed.
 * 
 * The ArrayBlockingQueue stores the elements internally in FIFO (First In,
 * First Out) order.
 * 
 */
public class ArrayBlockingQueueLearnings {
	public static void main(String[] args) throws Exception {

		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		queue.put("1");
		/**
		 * Retrieves and removes the head of this queue, waiting if necessary until an
		 * element becomes available.
		 */
		String string = queue.take();
		// Check remaining capacity
		int remainingCapacity = queue.remainingCapacity();
		System.out.println("Remaining Capacity:" + remainingCapacity);

		queue.put("1");
		queue.put("1");
		remainingCapacity = queue.remainingCapacity();
		System.out.println("Remaining Capacity:" + remainingCapacity);

		/**
		 * Inserts the specified element into this queue if it is possible to do so
		 * immediately without violating capacity restrictions, returning true upon
		 * success and false if no space is currently available. When using a
		 * capacity-restricted queue, this method is generally preferable to add(E),
		 * which can fail to insert an element only by throwing an exception.
		 */
		boolean status = queue.offer("2");
		remainingCapacity = queue.remainingCapacity();
		System.out.println("Remaining Capacity:" + remainingCapacity);
	}
}
