package com.thread.waitNotifyNotifyAll;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWaitNotify {
	public static void main(String[] args) {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread producerThread = new Thread(new ProducerThread(taskQueue, MAX_CAPACITY), "Producer");
		Thread consumerThread = new Thread(new ConsumerThread(taskQueue), "Consumer");
		producerThread.start();
		consumerThread.start();
	}
}
