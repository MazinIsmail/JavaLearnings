package com.thread.learnings;

/**
 * Monitor
 * 
 * The mechanism that Java uses to support synchronization is the monitor.
 * 
 * Java's monitor supports two kinds of thread synchronization: mutual exclusion
 * and cooperation. Mutual exclusion, which is supported in the Java virtual
 * machine via object locks, enables multiple threads to independently work on
 * shared data without interfering with each other. Cooperation, which is
 * supported in the Java virtual machine via the wait and notify methods of
 * class Object, enables threads to work together towards a common goal.
 * 
 * A monitor is like a building that contains one special room that can be
 * occupied by only one thread at a time. The room usually contains some data.
 * From the time a thread enters this room to the time it leaves, it has
 * exclusive access to any data in the room. Entering the monitor building is
 * called "entering the monitor." Entering the special room inside the building
 * is called "acquiring the monitor." Occupying the room is called "owning the
 * monitor," and leaving the room is called "releasing the monitor." Leaving the
 * entire building is called "exiting the monitor."
 * 
 * Cooperation:-
 * 
 * Cooperation is important when one thread needs some data to be in a
 * particular state and another thread is responsible for getting the data into
 * that state. For example, one thread, a "read thread," may be reading data
 * from a buffer that another thread, a "write thread," is filling. The read
 * thread needs the buffer to be in a "not empty" state before it can read any
 * data out of the buffer. If the read thread discovers that the buffer is
 * empty, it must wait. The write thread is responsible for filling the buffer
 * with data. Once the write thread has done some more writing, the read thread
 * can do some more reading.
 * 
 * The form of monitor used by the Java virtual machine is called a "Wait and
 * Notify" monitor. (It is also sometimes called a "Signal and Continue"
 * monitor.) In this kind of monitor, a thread that currently owns the monitor
 * can suspend itself inside the monitor by executing a wait command. When a
 * thread executes a wait, it releases the monitor and enters a wait set. The
 * thread will stay suspended in the wait set until some time after another
 * thread executes a notify command inside the monitor. When a thread executes a
 * notify, it continues to own the monitor until it releases the monitor of its
 * own accord, either by executing a wait or by completing the monitor region.
 * After the notifying thread has released the monitor, the waiting thread will
 * be resurrected and will reacquire the monitor.
 * 
 * The waiting thread suspended itself because the data protected by the monitor
 * wasn't in a state that would allow the thread to continue doing useful work.
 * Also, the notifying thread presumably executed the notify command after it
 * had placed the data protected by the monitor into the state desired by the
 * waiting thread. But because the notifying thread continued, it may have
 * altered the state after the notify such that the waiting thread still can't
 * do useful work. Alternatively, a third thread may have acquired the monitor
 * after the notifying thread released it but before the waiting thread acquired
 * it, and the third thread may have changed the state of the protected data. As
 * a result, a notify must often be considered by waiting threads merely as a
 * hint that the desired state may exist. Each time a waiting thread is
 * resurrected, it may need to check the state again to determine whether it can
 * move forward and do useful work. If it finds the data still isn't in the
 * desired state, the thread could execute another wait or give up and exit the
 * monitor.
 */
public class MonitorLearnings {

}
