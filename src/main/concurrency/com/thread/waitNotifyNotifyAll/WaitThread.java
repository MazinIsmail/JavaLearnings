package com.thread.waitNotifyNotifyAll;

/**
 * 
 */
public class WaitThread {

	private static WaitThread locker1 = new WaitThread();
	private static WaitThread locker2 = new WaitThread();

	public void doSomething1() {
		synchronized (locker1) {
			/* locker1.wait(); */
		}
	}

	public void doSomething2() {
		synchronized (locker2) {
			// do something protected;
		}
	}

}
