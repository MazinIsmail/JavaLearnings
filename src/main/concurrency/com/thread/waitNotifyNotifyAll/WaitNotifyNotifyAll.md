The Object class in Java has three final methods that allow threads to communicate about the locked status of a resource.

wait()
It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify(). It is not possible for us to implement the wait() method purely in Java. It is a native method.

notify()
It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource. It tells a waiting thread that that thread can wake up. However, the lock is not actually given up until the notifier’s synchronized block has completed.

notifyAll()
It wakes up all the threads that called wait() on the same object. The highest priority thread will run first in most of the situation, though not guaranteed.


In general, a thread that uses the wait() method confirms that a condition does not exist (typically by checking a variable) and then calls the wait() method. When another thread establishes the condition (typically by setting the same variable), it calls the notify() method. The wait-and-notify mechanism does not specify what the specific condition/ variable value is. It is on developer’s hand to specify the condition to be checked before calling wait() or notify().

Producer Consumer problem using wait() and notify():-

Producer thread produce a new resource in every 1 second and put it in ‘taskQueue’.
Consumer thread takes 1 seconds to process consumed resource from ‘taskQueue’.
Max capacity of taskQueue is 5 i.e. maximum 5 resources can exist inside ‘taskQueue’ at any given time.
Both threads run infinitely.

