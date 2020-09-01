package com.blockingQueue.learnings;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * The DelayQueue blocks the elements internally until a certain delay has
 * expired.
 * 
 * DelayQueue is a specialized Priority Queue that orders elements based on
 * their delay time. It means that only those elements can be taken from the
 * queue whose time has expired.
 * 
 * If no delay has expired, then there is no head and poll will return null.
 * DelayQueue accepts only those elements that belong to a class of type
 * Delayed. DelayQueue implements the getDelay() method to return the remaining
 * delay time. The elements must implement the interface
 * java.util.concurrent.Delayed.
 */
public class DelayQueueLearnings {
	public static void main(String[] args) {

		BlockingQueue<DelaySample> delayQueue = new DelayQueue<DelaySample>();
		delayQueue.add(new DelaySample("A", 1));
		delayQueue.add(new DelaySample("B", 2));
		delayQueue.add(new DelaySample("C", 3));
		delayQueue.add(new DelaySample("D", 4));
		System.out.println("DelayQueue: " + delayQueue);
		// create object of DelayQueue
		// using DelayQueue(Collection c) constructor
		BlockingQueue<DelaySample> DQ2 = new DelayQueue<DelaySample>(delayQueue);
		System.out.println("DelayQueue: " + DQ2);

		System.out.println();
		BlockingQueue<DelaySample> DQ3 = new DelayQueue<DelaySample>(delayQueue);
		System.out.println("Head of DelayQueue: " + DQ3.peek());
		System.out.println("Size of DelayQueue: " + DQ3.size());
		System.out.println("Head of DelayQueue: " + DQ3.poll());
		System.out.println("Size of DelayQueue: " + DQ3.size());
		delayQueue.clear();
		System.out.println("Size of DelayQueue" + " after clear: " + DQ3.size());
	}
}
