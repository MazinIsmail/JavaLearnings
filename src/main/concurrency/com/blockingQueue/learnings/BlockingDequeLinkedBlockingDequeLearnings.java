package com.blockingQueue.learnings;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * A deque is short for "Double Ended Queue". Thus, a deque is a queue which you
 * can insert and take elements from, from both ends.
 * 
 * A BlockingDeque could be used if threads are both producing and consuming
 * elements of the same queue. It could also just be used if the producing
 * thread needs to insert at both ends of the queue, and the consuming thread
 * needs to remove from both ends of the queue.
 * 
 * A thread will produce elements and insert them into either end of the queue.
 * If the deque is currently full, the inserting thread will be blocked until a
 * removing thread takes an element out of the deque. If the deque is currently
 * empty, a removing thread will be blocked until an inserting thread inserts an
 * element into the deque.
 * 
 * The BlockingDeque interface extends the BlockingQueue interface.
 */
public class BlockingDequeLinkedBlockingDequeLearnings {
	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<String> deque = new LinkedBlockingDeque<String>();
		deque.addFirst("1");
		deque.addLast("2");
		String two = deque.takeLast();
		String one = deque.takeFirst();

		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);
		System.out.println("Linked Blocking Deque1: " + LBD);
		System.out.println("Size of Linked Blocking Deque1: " + LBD.size());

		LinkedBlockingDeque<Integer> LBD1 = new LinkedBlockingDeque<Integer>(3);
		LBD1.add(7855642);
		LBD1.add(35658786);
		LBD1.add(5278367);
		try {
			// adding the 4th element
			// will throw exception for Deque full
			LBD1.add(74381793);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		System.out.println("Linked Blocking Deque2: " + LBD1);
		System.out.println("Size of Linked Blocking Deque2: " + LBD1.size());

		LinkedBlockingDeque<Integer> LBD2 = new LinkedBlockingDeque<Integer>(LBD1);
		System.out.println("Linked Blocking Deque3: " + LBD2);
	}
}
