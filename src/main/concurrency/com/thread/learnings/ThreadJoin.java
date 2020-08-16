package com.thread.learnings;

/**
 * How can we achieve thread safety in Java?
 * 
 * There are several ways to achieve thread safety in java – synchronization,
 * atomic concurrent classes, implementing concurrent Lock interface, using
 * volatile keyword, using immutable classes and Thread safe classes.
 */
class ThreadJoining extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			}

			catch (Exception ex) {
				System.out.println("Exception has" + " been caught" + ex);
			}
			System.out.println(i);
		}
	}
}

class ThreadJoin {
	public static void main(String[] args) {

		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();
		t1.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			// Waits for this thread to die.
			t1.join();
		} catch (InterruptedException ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}
		t2.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			// Waits for this thread to die.
			t2.join();
		} catch (InterruptedException ex) {
			System.out.println("Exception has been" + " caught" + ex);
		}
		t3.start();

		try {
			/**
			 * public final void join(long millis) throws InterruptedException
			 * 
			 * Waits at most millis milliseconds for this thread to die. A timeout of 0
			 * means to wait forever. This implementation uses a loop of this.wait calls
			 * conditioned on this.isAlive. As a thread terminates the this.notifyAll method
			 * is invoked. It is recommended that applications not use wait, notify, or
			 * notifyAll on Thread instances.
			 * 
			 * Parameters:millis - the time to wait in milliseconds
			 * 
			 */
			t3.join(2000);
		} catch (InterruptedException e) {
			System.out.println("Exception has been" + " caught" + e);
		}
	}
}
