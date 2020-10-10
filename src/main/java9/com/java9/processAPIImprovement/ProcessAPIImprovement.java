package com.java9.processAPIImprovement;

/**
 * Java 9 Process API Improvement
 * 
 * Java has improved its process API in Java 9 version that helps to manage and
 * control operating system processes.
 * 
 * In earlier versions, it was complex to manage and control operating system
 * processes by using Java programming. Now, new classes and interfaces are
 * added to perform this task.
 * 
 * New methods are added to the java.lang.Process class
 * 
 * New interfaces ProcessHandle and ProcessHandle.Info are added.
 * 
 * Java ProcessHandle Interface :-
 * 
 * ProcessHandle helps to handle and control processes. We can monitor
 * processes, list its children, get information etc.
 * 
 * This interface contains static factory methods that return instances that are
 * value-based, immutable and thread-safe.
 * 
 * Java ProcessHandle.Info Interface
 * 
 * It is added to Java 9, and used to provide information about the process. It
 * is nested interface of ProcessHandle interface.
 */
public class ProcessAPIImprovement {
	public static void main(String[] args) {
		// Current processhandle
		ProcessHandle currentProcess = ProcessHandle.current();

		// Process id
		System.out.println("Process Id: " + currentProcess.pid());

		// Direct children of the process
		System.out.println("Direct children: " + currentProcess.children());

		// Class name
		System.out.println("Class name: " + currentProcess.getClass());

		// All current processes
		System.out.println("All processes: " + ProcessHandle.allProcesses());

		// Process info
		System.out.println("Process info: " + currentProcess.info());
		System.out.println("Is process alive: " + currentProcess.isAlive());

		// Parent of the process
		System.out.println("Process's parent " + currentProcess.parent());
	}
}
