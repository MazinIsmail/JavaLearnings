package com.javamemorymanagement.learning;

/**
 * 
 * Garbage Collection Process
 * 
 * All objects that are in red (garbage-eligible.jpg) are eligible to be
 * collected by the garbage collector. You might notice that there is an object
 * on the heap, which has strong references to other objects that are also on
 * the heap (e.g. could be a list that has references to its items, or an object
 * that has two referenced type fields). However, since the reference from the
 * stack is lost, it cannot be accessed anymore, so it is garbage as well.
 * 
 * This process is triggered automatically by Java, and it is up to Java when
 * and whether or not to start this process.
 * 
 * It is actually an expensive process. When the garbage collector runs, all
 * threads in your application are paused (depending on the GC type).
 * 
 * This is actually a more complicated process than just garbage collecting and
 * freeing up memory.
 * 
 * You may explicitly call System.gc(). You only kind of ask Java to run the
 * garbage collector, but it’s, again, up to it whether or not to do that.
 * Anyway, explicitly calling System.gc() is not advised.
 * 
 * Garbage Collector Types:-
 * 
 * JVM has three types of garbage collectors, and the programmer can choose
 * which one should be used. By default, Java chooses the garbage collector type
 * to be used based on the underlying hardware.
 * 
 * 1. Serial GC: A single thread collector. Mostly applies to small applications
 * with small data usage. Can be enabled by specifying the command line option:
 * -XX:+UseSerialGC
 * 
 * 2. Parallel GC: Even from the naming, the difference between Serial and
 * Parallel would be that Parallel GC uses multiple threads to perform the
 * garbage collecting process. This GC type is also known as the throughput
 * collector. It can be enabled by explicitly specifying the option:
 * -XX:+UseParallelGC
 * 
 * 3. Mostly concurrent GC: If you remember, earlier in this article, it was
 * mentioned that the garbage collecting process is actually pretty expensive,
 * and when it runs, all thread are paused. However, we have this mostly
 * concurrent GC type, which states that it works concurrent to the application.
 * However, there is a reason why it is “mostly” concurrent. It does not work
 * 100% concurrently to the application. There is a period of time for which the
 * threads are paused. Still, the pause is kept as short as possible to achieve
 * the best GC performance. Actually, there are 2 types of mostly concurrent
 * GCs:
 * 
 * 3.1 Garbage First: High throughput with a reasonable application pause time.
 * Enabled with the option: -XX:+UseG1GC
 * 
 * 3.2 Concurrent Mark Sweep: The application pause time is kept to a minimum.
 * It can be used by specifying the option: -XX:+UseConcMarkSweepGC. As of JDK
 * 9, this GC type is deprecated.
 */
public class GarbageCollectionProcess {

}
