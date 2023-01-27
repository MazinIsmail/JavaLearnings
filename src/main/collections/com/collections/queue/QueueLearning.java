package com.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Queue
 * 
 * The Queue interface is present in java.util package and extends the
 * Collection interface is used to hold the elements about to be processed in
 * FIFO(First In First Out) order.
 * 
 * LinkedList, ArrayDeque and PriorityQueue are the most frequently used
 * implementations.
 */
public class QueueLearning {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> pQueue = new PriorityQueue<Integer>();
		Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();
	}
}
