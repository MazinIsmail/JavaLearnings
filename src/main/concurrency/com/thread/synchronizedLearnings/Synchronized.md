Synchronization is a modifier which is used for method and block only. With the help of synchronized modifier we can restrict a shared resource to be accessed only by one thread. The process by which we can achieve data consistency between multiple threads it is called Synchronization.

These methods or blocks can be static or non-static both.

Java synchronization will throw NullPointerException if object used in synchronized block is null. For example, if lock is initialized as null, the “synchronized (lock)” will throw NullPointerException.

A synchronized method synchronizes on the object instance or the class. A thread only executes a synchronized method after it has acquired the lock for the method's object or class.

Non-synchronized method won't make use of the lock.