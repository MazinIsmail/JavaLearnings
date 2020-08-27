package com.volatilekeyword.learning;

/**
 * 
 * You cannot use 'Volatile' as a variable or method name.
 * 
 * The Java volatile keyword is used to mark a Java variable as "being stored in
 * main memory". More precisely that means, that every read of a volatile
 * variable will be read from the computer's main memory, and not from the CPU
 * cache, and that every write to a volatile variable will be written to main
 * memory, and not just to the CPU cache.
 * 
 * Two important features of locks and synchronization:-
 * 
 * 1. Mutual Exclusion: It means that only one thread or process can execute a
 * block of code (critical section) at a time.
 * 
 * 2. Visibility: It means that changes made by one thread to shared data are
 * visible to other threads.
 * 
 * Java’s synchronized keyword guarantees both mutual exclusion and visibility.
 * 
 * In some cases we may only desire the visibility and not atomicity. Use of
 * synchronized in such situation is an overkill and may cause scalability
 * problems. Here volatile comes to the rescue. Volatile variables have the
 * visibility features of synchronized but not the atomicity features. The
 * values of volatile variable will never be cached and all writes and reads
 * will be done to and from the main memory. However, use of volatile is limited
 * to very restricted set of cases as most of the times atomicity is desired.
 * 
 * Variable Visibility Problems:-
 * 
 * In a multithreaded application where the threads operate on non-volatile
 * variables, each thread may copy variables from main memory into a CPU cache
 * while working on them, for performance reasons. If your computer contains
 * more than one CPU, each thread may run on a different CPU. That means, that
 * each thread may copy the variables into the CPU cache of different CPUs. This
 * is illustrated in 'volatile.png' and 'volatile2.png'.
 * 
 * With non-volatile variables there are no guarantees about when the Java
 * Virtual Machine (JVM) reads data from main memory into CPU caches, or writes
 * data from CPU caches to main memory.
 * 
 * The Java volatile Visibility Guarantee:-
 * 
 * The Java volatile keyword is intended to address variable visibility
 * problems. By declaring the counter variable volatile all writes to the
 * counter variable will be written back to main memory immediately. Also, all
 * reads of the counter variable will be read directly from main memory.
 * 
 * public volatile int counter = 0;
 * 
 * Declaring a variable volatile thus guarantees the visibility for other
 * threads of writes to that variable.
 * 
 * In the scenario given above, where one thread (T1) modifies the counter, and
 * another thread (T2) reads the counter (but never modifies it), declaring the
 * counter variable volatile is enough to guarantee visibility for T2 of writes
 * to the counter variable.
 * 
 * If, however, both T1 and T2 were incrementing the counter variable, then
 * declaring the counter variable volatile would not have been enough. More on
 * that later.
 * 
 * 
 * 
 */
public class VolatileLearnings {
	/**
	 * The number variable piggybacks on the memory visibility enforced by the ready
	 * variable. Put simply, even though it's not a volatile variable, it is
	 * exhibiting a volatile behavior.
	 */
	public class TaskRunner {
		private int number; // not volatile
		private volatile boolean ready;
	}

	/**
	 * The udpate() method writes three variables, of which only days is volatile.
	 * 
	 * The full volatile visibility guarantee means, that when a value is written to
	 * days, then all variables visible to the thread are also written to main
	 * memory. That means, that when a value is written to days, the values of years
	 * and months are also written to main memory.
	 */
	public class MyClass {
		private int years;
		private int months;
		private volatile int days;

		public void update(int years, int months, int days) {
			this.years = years;
			this.months = months;
			this.days = days;
		}

		/**
		 * When reading the values of years, months and days you could do it like below.
		 * Notice the totalDays() method starts by reading the value of days into the
		 * total variable. When reading the value of days, the values of months and
		 * years are also read into main memory. Therefore you are guaranteed to see the
		 * latest values of days, months and years with the above read sequence.
		 */
		public int totalDays() {
			int total = this.days;
			total += months * 30;
			total += years * 365;
			return total;
		}
	}

	private static int first = 1;
	private static int second = 2;
	private static int third = 3;
	private static volatile boolean hasValue = false;

	/**
	 * Instruction Reordering Challenges
	 * 
	 * The Java VM and the CPU are allowed to reorder instructions in the program
	 * for performance reasons, as long as the semantic meaning of the instructions
	 * remain the same.
	 */
	public static void main(String[] args) {
		// For instance, look at the following instructions:
		int a = 1;
		int b = 2;
		a++;
		b++;

		// These instructions could be reordered to the following sequence without
		// losing the semantic meaning of the program:

		// int a = 1;
		// a++;
		// int b = 2;
		// b++;

		happenBefore();
	}

	/**
	 * The Java volatile Happens-Before Guarantee
	 * 
	 * To address the instruction reordering challenge, the Java volatile keyword
	 * gives a "happens-before" guarantee, in addition to the visibility guarantee.
	 */
	private static void happenBefore() {
		/**
		 * When the statements involve accessing a volatile variable, then it will never
		 * move a statement occurring before a volatile write after it. Which means, it
		 * will never transform this –
		 */
		first = 5; // write before volatile write
		second = 6; // write before volatile write
		third = 7; // write before volatile write
		hasValue = true;

		// into this –

		// first = 5;
		// second = 6;
		// hasValue = true;
		// third = 7; // Order changed to appear after volatile write! This will never
		// happen!

		/**
		 * Similarly, the JVM will also not change the order of a statement which
		 * appears after a volatile variable read to appear before the access. Which
		 * means the following –
		 */
		System.out.println("Flag is set to : " + hasValue); // volatile read
		System.out.println("First: " + first); // Read after volatile read
		System.out.println("Second: " + second); // Read after volatile read
		System.out.println("Third: " + third); // Read after volatile read

		// Will never be transformed by the JVM into this –
		// System.out.println("First: " + first); // Read before volatile read! Will
		// never happen!
		// System.out.println("Fiag is set to : " + hasValue); // volatile read
		// System.out.println("Second: " + second);
		// System.out.println("Third: " + third);

		/**
		 * However, the JVM can certainly reorder the last three reads among them, as
		 * long as they keep appearing after the volatile read.
		 */
	}

	/**
	 * In case only one thread reads and writes the value of a volatile variable and
	 * other threads only read the variable, then the reading threads are guaranteed
	 * to see the latest value written to the volatile variable. Without making the
	 * variable volatile, this would not be guaranteed.
	 */
}

/**
 * The synchronized and volatile constructs, as well as the Thread.start() and
 * Thread.join() methods, can form happens-before relationships.
 */
