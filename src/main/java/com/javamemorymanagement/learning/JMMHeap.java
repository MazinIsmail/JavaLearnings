package com.javamemorymanagement.learning;

/**
 * Heap:-
 * 
 * This part of memory stores the actual object in memory. Those are referenced
 * by the variables from the stack.
 * 
 * The new keyword is responsible for ensuring that there is enough free space
 * on heap. There exists only one heap memory for each running JVM process.
 * Therefore, this is a shared part of memory regardless of how many threads are
 * running.
 * 
 * The heap itself is divided into a few parts, which facilitates the process of
 * garbage collection.
 * 
 * JVM Heap memory is physically divided into two parts – Young Generation and
 * Old Generation.
 * 
 * 1. Young Generation
 * 
 * The young generation is the place where all the new objects are created. When
 * the young generation is filled, garbage collection is performed. This garbage
 * collection is called Minor GC. Young Generation is divided into three parts –
 * Eden Memory and two Survivor Memory spaces.
 * 
 * Most of the newly created objects are located in the Eden memory space.
 * 
 * When Eden space is filled with objects, Minor GC is performed and all the
 * survivor objects are moved to one of the survivor spaces.
 * 
 * Minor GC also checks the survivor objects and move them to the other survivor
 * space. So at a time, one of the survivor space is always empty.
 * 
 * Objects that are survived after many cycles of GC, are moved to the Old
 * generation memory space. Usually, it’s done by setting a threshold for the
 * age of the young generation objects before they become eligible to promote to
 * Old generation.
 * 
 * 2. Old Generation
 * 
 * Old Generation memory contains the objects that are long-lived and survived
 * after many rounds of Minor GC. Usually, garbage collection is performed in
 * Old Generation memory when it’s full. Old Generation Garbage Collection is
 * called Major GC and usually takes a longer time.
 * 
 * 
 * 
 * Minor GC is very fast and the application doesn’t get affected by this.
 * However, Major GC takes a long time because it checks all the live objects.
 * Major GC should be minimized because it will make your application
 * unresponsive for the garbage collection duration.
 * 
 * Memory Pool: Memory Pools are created by JVM memory managers to create a pool
 * of immutable objects. Memory Pool can belong to Heap or Perm Gen, depending
 * on JVM memory manager implementation.
 * 
 * Runtime Constant Pool: Runtime constant pool is a per-class runtime
 * representation of a constant pool in a class. It contains class runtime
 * constants and static methods. Runtime constant pool is part of the method
 * area.
 */
public class JMMHeap {

}
