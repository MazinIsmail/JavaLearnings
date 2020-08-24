package com.countDownLatch.learnings;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch is a concurrency construct that allows one or more threads to
 * wait for a given set of operations to complete.
 * 
 * A CountDownLatch is initialized with a given count. This count is decremented
 * by calls to the countDown() method. Threads waiting for this count to reach
 * zero can call one of the await() methods. Calling await() blocks the thread
 * until the count reaches zero.
 * 
 * A CountDownLatch can be used only once in a program(until it’s count reaches
 * 0). A CyclicBarrier can be used again and again once all the threads in a
 * barriers is released.
 */
public class CountDownLatchLearnings {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);

		WaiterSample waiterSample = new WaiterSample(latch);
		Thread waiterSampleThread = new Thread(waiterSample);

		DecrementerSample decrementerSample = new DecrementerSample(latch);
		Thread decrementerSampleThread = new Thread(decrementerSample);

		waiterSampleThread.start();
		decrementerSampleThread.start();
		Thread.sleep(4000);
	}
}
