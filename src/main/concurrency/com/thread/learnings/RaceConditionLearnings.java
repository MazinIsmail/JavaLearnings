package com.thread.learnings;

/**
 * Race condition
 * 
 * A race condition occurs when two or more threads can access shared data and
 * they try to change it at the same time. Because the thread scheduling
 * algorithm can swap between threads at any time, you don't know the order in
 * which the threads will attempt to access the shared data. Therefore, the
 * result of the change in data is dependent on the thread scheduling algorithm,
 * i.e. both threads are "racing" to access/change the data.
 * 
 * The part of the program which accesses the shared resource is known as the
 * critical section. So, to avoid a race condition, we need to synchronize
 * access to the critical section.
 * 
 * 
 * Slipped Condition
 * 
 * Slipped conditions means, that from the time a thread has checked a certain
 * condition until it acts upon it, the condition has been changed by another
 * thread so that it is errornous for the first thread to act.
 * 
 * Slipped Condition is a special type of race condition that can occur in a
 * multithreaded application. In this, a thread is suspended after reading a
 * condition and before performing the activities related to it. It rarely
 * occurs, however, one must look for it if the outcome is not as expected.
 */
public class RaceConditionLearnings extends Thread {

}
