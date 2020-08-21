package com.blockingQueue.learnings;

import java.util.concurrent.BlockingQueue;

public class ProducerSample implements Runnable {

	protected BlockingQueue blockingQueue = null;

	public ProducerSample(BlockingQueue queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			blockingQueue.put("1");
			Thread.sleep(2000);
			blockingQueue.put("2");
			Thread.sleep(2000);
			blockingQueue.put("3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
