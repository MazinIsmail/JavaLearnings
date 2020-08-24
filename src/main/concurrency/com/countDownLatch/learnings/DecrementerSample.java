package com.countDownLatch.learnings;

import java.util.concurrent.CountDownLatch;

public class DecrementerSample implements Runnable {

	CountDownLatch latch = null;

	public DecrementerSample(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			Thread.sleep(1000);
			/**
			 * Decrements the count of the latch, releasing all waiting threads if the count
			 * reaches zero. If the current count is greater than zero then it is
			 * decremented. If the new count is zero then all waiting threads are re-enabled
			 * for thread scheduling purposes.
			 * 
			 * If the current count equals zero then nothing happens.
			 */
			this.latch.countDown();

			Thread.sleep(1000);
			this.latch.countDown();

			Thread.sleep(1000);
			this.latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
