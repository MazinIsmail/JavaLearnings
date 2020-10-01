package com.javamemorymanagement.learning;

/**
 * Java Runtime class is used to interact with java runtime environment. Java
 * Runtime class provides methods to execute a process, invoke GC, get total and
 * free memory etc. There is only one instance of java.lang.Runtime class is
 * available for one java application.
 * 
 * The Runtime.getRuntime() method returns the singleton instance of Runtime
 * class.
 */
public class RuntimeClass {
	public static void main(String args[]) throws Exception {
		// will open a new notepad
		// Runtime.getRuntime().exec("notepad");

		/**
		 * You can use -s switch to shutdown system, -r switch to restart system and -t
		 * switch to specify time delay.
		 * 
		 * Runtime.getRuntime().exec("shutdown -s -t 0");
		 * Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
		 * Runtime.getRuntime().exec("shutdown -r -t 0");
		 */

		System.out.println("availableProcessors: " + Runtime.getRuntime().availableProcessors());

		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 10000; i++) {
			new RuntimeClass();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());

	}
}
