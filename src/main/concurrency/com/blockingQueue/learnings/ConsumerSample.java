package com.blockingQueue.learnings;

import java.util.concurrent.BlockingQueue;

public class ConsumerSample implements Runnable {

	protected BlockingQueue blockingQueue = null;

	public ConsumerSample(BlockingQueue queue) {
		this.blockingQueue = queue;
	}

	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
