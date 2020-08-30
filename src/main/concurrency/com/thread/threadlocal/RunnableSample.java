package com.thread.threadlocal;

public class RunnableSample implements Runnable {

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	@Override
	public void run() {
		threadLocal.set((int) (Math.random() * 100D));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Inside thread run: " + threadLocal.get());
	}

}
