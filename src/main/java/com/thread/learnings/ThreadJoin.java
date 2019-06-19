package com.thread.learnings;

//Java program to explain the 
//concept of joining a thread. 
import java.io.*;

//Creating thread by creating the 
//objects of that class 
/**
 * 
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

		// creating two threads
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();

		// thread t1 starts
		t1.start();

		// starts second thread after when
		// first thread t1 has died.
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		}

		catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}

		// t2 starts
		t2.start();

		// starts t3 after when thread t2 has died.
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t2.join();
		}

		catch (Exception ex) {
			System.out.println("Exception has been" + " caught" + ex);
		}

		t3.start();
	}
}
