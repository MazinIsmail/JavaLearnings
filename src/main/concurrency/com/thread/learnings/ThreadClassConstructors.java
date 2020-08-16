package com.thread.learnings;

public class ThreadClassConstructors {

	public static void main(String[] args) {

		ThreadSample threadSample = new ThreadSample();
		ThreadRunnableSample threadRunnableSample = new ThreadRunnableSample();

		/**
		 * This constructor has the same effect as Thread (null, null, gname), where
		 * gname is a newly generated name. Automatically generated names are of the
		 * form "Thread-"+n, where n is an integer.
		 */
		Thread thread = new Thread();

		/**
		 * public Thread(Runnable target)
		 * 
		 * Allocates a new Thread object. This constructor has the same effect as Thread
		 * (null, target, gname), where gname is a newly generated name. Automatically
		 * generated names are of the form "Thread-"+n, where n is an integer.
		 * 
		 * Parameters:
		 * 
		 * target - the object whose run method is invoked when this thread is started.
		 * If null, this classes run method does nothing.
		 */
		Thread threadConstructorRunnable = new Thread(threadRunnableSample);
		threadConstructorRunnable.start();

		/**
		 * public Thread(String name)
		 * 
		 * Allocates a new Thread object. This constructor has the same effect as Thread
		 * (null, null, name).
		 * 
		 * Parameters:name - the name of the new thread.
		 */
		Thread threadName = new Thread("Name");
		threadName.start();

		/**
		 * public Thread(Runnable target, String name)
		 * 
		 * Allocates a new Thread object. This constructor has the same effect as Thread
		 * (null, target, name).
		 * 
		 * Parameters:
		 * 
		 * target - the object whose run method is invoked when this thread is started.
		 * If null, this thread's run method is invoked.
		 * 
		 * name - the name of the new thread.
		 * 
		 */
		threadName = new Thread(threadSample, "Name");
		threadName.start();

		ThreadGroup threadGroupA = new ThreadGroup("Group A");
		/**
		 * public Thread(ThreadGroup group, String name)
		 * 
		 * Allocates a new Thread object. This constructor has the same effect as Thread
		 * (group, null, name).
		 * 
		 * Parameters:
		 * 
		 * group - the thread group. If null and there is a securitymanager, the group
		 * is determined by SecurityManager.getThreadGroup(). If there is not a security
		 * manager or SecurityManager.getThreadGroup() returns null, the group is set to
		 * the current thread's thread group.
		 * 
		 * name - the name of the new thread
		 */
		Thread threadConstructorThreadGroup = new Thread(threadGroupA, "Name threadConstructorThreadGroups");

		/**
		 * public Thread(ThreadGroup group, Runnable target)
		 * 
		 * Allocates a new Thread object. This constructor has the same effect as Thread
		 * (group, target, gname), where gname is a newly generated name. Automatically
		 * generated names are of the form "Thread-"+n, where n is an integer.
		 * 
		 * Parameters:
		 * 
		 * group - the thread group. If null and there is a securitymanager, the group
		 * is determined by SecurityManager.getThreadGroup().If there is not a security
		 * manager or SecurityManager.getThreadGroup() returns null, the group is set to
		 * the current thread's thread group.
		 * 
		 * target - the object whose run method is invoked when this thread is started.
		 * If null, this thread's run method is invoked.
		 */
		threadConstructorThreadGroup = new Thread(threadGroupA, threadRunnableSample);

		/**
		 * <Same as above>
		 * 
		 * name - the name of the new thread
		 */
		threadConstructorThreadGroup = new Thread(threadGroupA, threadRunnableSample,
				"Name threadConstructorThreadGroups");

		/**
		 * This constructor is identical to Thread(ThreadGroup,Runnable,String) with the
		 * exception of the fact that it allows the thread stack size to be specified.
		 * The stack size is the approximate number of bytes of address space that the
		 * virtual machine is to allocate for this thread's stack. The effect of the
		 * stackSize parameter, if any, is highly platform dependent.
		 * 
		 * On some platforms, specifying a higher value for the stackSize parameter may
		 * allow a thread to achieve greater recursion depth before throwing a
		 * StackOverflowError.Similarly, specifying a lower value may allow a greater
		 * number of threads to exist concurrently without throwing an OutOfMemoryError
		 * (or other internal error). The details of the relationship between the value
		 * of the stackSize parameter and the maximum recursion depth and concurrency
		 * level are platform-dependent. On some platforms, the value of the stackSize
		 * parameter may have no effect whatsoever.
		 * 
		 * The virtual machine is free to treat the stackSizeparameter as a suggestion.
		 * If the specified value is unreasonably low for the platform, the virtual
		 * machine may instead use some platform-specific minimum value; if the
		 * specified value is unreasonably high, the virtual machine may instead use
		 * some platform-specific maximum. Likewise, the virtual machine is free to
		 * round the specified value up or down as it sees fit (or to ignore it
		 * completely).
		 * 
		 * Specifying a value of zero for the stackSize parameter will cause this
		 * constructor to behave exactly like the Thread(ThreadGroup, Runnable, String)
		 * constructor.
		 * 
		 * Due to the platform-dependent nature of the behavior of this constructor,
		 * extreme care should be exercised in its use.The thread stack size necessary
		 * to perform a given computation will likely vary from one JRE implementation
		 * to another. In light of this variation, careful tuning of the stack size
		 * parameter may be required,and the tuning may need to be repeated for each JRE
		 * implementation on which an application is to run.
		 * 
		 * Implementation note: Java platform implementers are encouraged to document
		 * their implementation's behavior with respect to the stackSize parameter.
		 * 
		 * stackSize - the desired stack size for the new thread, or zero to indicate
		 * that this parameter is to be ignored.
		 */
		threadConstructorThreadGroup = new Thread(threadGroupA, threadRunnableSample,
				"Name threadConstructorThreadGroups", 100l);

	}
}
