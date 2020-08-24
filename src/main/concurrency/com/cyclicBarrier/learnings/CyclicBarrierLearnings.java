package com.cyclicBarrier.learnings;

import java.util.concurrent.CyclicBarrier;

/**
 * The java.util.concurrent.CyclicBarrier class is a synchronization mechanism
 * that can synchronize threads progressing through some algorithm. In other
 * words, it is a barrier that all threads must wait at, until all threads reach
 * it, before any of the threads can continue.
 * 
 * The threads wait for each other by calling the await() method on the
 * CyclicBarrier. Once N threads are waiting at the CyclicBarrier, all threads
 * are released and can continue running.
 * 
 * When you create a CyclicBarrier you specify how many threads are to wait at
 * it, before releasing them.
 * 
 * A CountDownLatch can be used only once in a program(until it’s count reaches
 * 0). A CyclicBarrier can be used again and again once all the threads in a
 * barriers is released.
 * 
 * The CyclicBarrier uses an all-or-none breakage model for failed
 * synchronization attempts: If a thread leaves a barrier point prematurely
 * because of interruption, failure, or timeout, all other threads waiting at
 * that barrier point will also leave abnormally via BrokenBarrierException (or
 * InterruptedException if they too were interrupted at about the same time).
 * 
 * CountDownLatch can not be reset, however, CyclicBarrier can.
 */
public class CyclicBarrierLearnings {
	public static void main(String[] args) {
		RunnableSampleOne runnableSampleOne = new RunnableSampleOne();
		/**
		 * Creates a new CyclicBarrier that will trip when the given number of parties
		 * (threads) are waiting upon it, and which will execute the given barrier
		 * action when the barrier is tripped, performed by the last thread entering the
		 * barrier.
		 * 
		 * Parameters:
		 * 
		 * parties - the number of threads that must invoke await() before the barrier
		 * is tripped
		 * 
		 * barrierAction - the command to execute when the barrier is tripped, or null
		 * if there is no action
		 */
		CyclicBarrier barrier1 = new CyclicBarrier(2, runnableSampleOne);
		RunnableSampleTwo runnableSampleTwo = new RunnableSampleTwo();
		CyclicBarrier barrier2 = new CyclicBarrier(2, runnableSampleTwo);

		CyclicBarrierRunnable barrierRunnable1 = new CyclicBarrierRunnable(barrier1, barrier2);
		CyclicBarrierRunnable barrierRunnable2 = new CyclicBarrierRunnable(barrier1, barrier2);

		new Thread(barrierRunnable1).start();
		new Thread(barrierRunnable2).start();
	}
}
