package com.blockingQueue.learnings;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * The SynchronousQueue is a queue that can only contain a single element
 * internally. A thread inserting an element into the queue is blocked until
 * another thread takes that element from the queue. Likewise, if a thread tries
 * to take an element and no element is currently present, that thread is
 * blocked until a thread insert an element into the queue.
 * 
 * Calling this class a queue is a bit of an overstatement. It's more of a
 * rendesvouz point.
 */
public class SynchronousQueueLearning {
	public static void main(String[] args) {
		/**
		 * creates a SynchronousQueue with nonfair access policy. That means if multiple
		 * threads are waiting, they will be granted access in unspecified order.
		 */
		BlockingQueue<String> syncQueue = new SynchronousQueue<String>();
		/**
		 * creates a SynchronousQueue with a fairness access policy (fair = true): the
		 * waiting threads will be granted access in FIFO (First-In First-Out) order.
		 */
		syncQueue = new SynchronousQueue<>(true);
	}

}
