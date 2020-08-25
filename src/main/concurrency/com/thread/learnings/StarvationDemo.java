package com.thread.learnings;

/**
 * In Starvation, threads are waiting for each other. But here waiting time is
 * not infinite after some interval of time, waiting thread always gets the
 * resources whatever is required to execute thread run() method.
 * 
 * Solution to Starvation : Aging
 * 
 * Aging is a technique of gradually increasing the priority of processes that
 * wait in the system for a long time. For example, if priority range from
 * 127(low) to 0(high), we could increase the priority of a waiting process by 1
 * Every 15 minutes. Eventually even a process with an initial priority of 127
 * would take no more than 32 hours for priority 127 process to age to a
 * priority-0 process.
 */
public class StarvationDemo extends Thread {
	static int threadcount = 1;

	public void run() {
		System.out.println(threadcount + " st Child" + " Thread execution starts");
		System.out.println("Child thread execution completes");
		threadcount++;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread execution starts");
		StarvationDemo thread1 = new StarvationDemo();
		thread1.setPriority(10);
		StarvationDemo thread2 = new StarvationDemo();
		thread2.setPriority(9);
		StarvationDemo thread3 = new StarvationDemo();
		thread3.setPriority(8);
		StarvationDemo thread4 = new StarvationDemo();
		thread4.setPriority(7);
		StarvationDemo thread5 = new StarvationDemo();
		thread5.setPriority(6);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		/**
		 * Here thread5 have to wait because of the other thread. But after waiting for
		 * some interval, thread5 will get the chance of execution. It is known as
		 * Starvation
		 */
		thread5.start();

		System.out.println("Main thread execution completes");
	}
}
