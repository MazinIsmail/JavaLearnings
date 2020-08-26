package com.atomic.learnings;

/**
 * Blocking Concurrency Algorithms
 * 
 * A blocking concurrency algorithm is an algorithm which either:
 * 
 * A: Performs the action requested by the thread - OR
 * 
 * B: Blocks the thread until the action can be performed safely
 * 
 * Many types of algorithms and concurrent data structures are blocking. For
 * instance, the different implementations of the
 * java.util.concurrent.BlockingQueue interface are all blocking data
 * structures. If a thread attempts to insert an element into a BlockingQueue
 * and the queue does not have space, the inserting thread is blocked
 * (suspended) until the BlockingQueue has space for the new element.
 * 'blocking-algorithms.png' diagram illustrates the behaviour of a blocking
 * algorithm guarding a shared data structure.
 * 
 * 
 * Non-blocking Concurrency Algorithms
 * 
 * A non-blocking concurrency algorithm is an algorithm which either:
 * 
 * A: Performs the action requested by the thread - OR
 * 
 * B: Notifies the requesting thread that the action could not be performed
 * 
 * Java contains several non-blocking data structures too. The AtomicBoolean,
 * AtomicInteger, AtomicLong and AtomicReference are all examples of
 * non-blocking data structures. 'non-blocking-algorithms.png' diagram
 * illustrates the behaviour of a non-blocking algorithm guarding a shared data
 * structure:
 * 
 * 
 * Non-blocking vs Blocking Algorithms
 * 
 * The main difference between blocking and non-blocking algorithms lies in the
 * second step of their behaviour as described in the above two sections. In
 * other words, the difference lies in what the blocking and non-blocking
 * algorithms do when the requested action cannot be performed:
 * 
 * Blocking algorithms block the thread until the requested action can be
 * performed. Non-blocking algorithms notify the thread requesting the action
 * that the action cannot be performed.
 * 
 * 
 * Non-blocking Concurrent Data Structures
 * 
 * If the algorithm guarding a concurrent data structure is blocking (uses
 * thread suspension), it is said to be a blocking algorithm. The data structure
 * is thus said to be a blocking, concurrent data structure.
 * 
 * If the algorithm guarding a concurrent data structure is non-blocking, it is
 * said to be a non-blocking algorithm. The data structure is thus said to be a
 * non-blocking, concurrent data structure.
 */
public class NonBlockingAndBlockingAlgorithm {

}
