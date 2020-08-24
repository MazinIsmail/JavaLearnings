package com.countDownLatch.learnings;

import java.util.concurrent.CountDownLatch;

public class WaiterSample implements Runnable {

	CountDownLatch latch = null;

	public WaiterSample(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Waiter Released");
	}
}
