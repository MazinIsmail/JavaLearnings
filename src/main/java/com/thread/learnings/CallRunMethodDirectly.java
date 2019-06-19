package com.thread.learnings;

/**
 * 
 * Each thread starts in a separate call stack. Invoking the run() method from
 * main thread, the run() method goes onto the current call stack rather than at
 * the beginning of a new call stack.
 * 
 * you can see in the above program that there is no context-switching 
 * because here t1 and t2 will be treated as normal object not thread object.
 */
class CallRunMethodDirectly extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		CallRunMethodDirectly t1 = new CallRunMethodDirectly();
		CallRunMethodDirectly t2 = new CallRunMethodDirectly();
		t1.run();// fine, but does not start a separate call stack

		t2.run();
//		t1.start();// fine, but does not start a separate call stack

//		t2.start();

	}
}
