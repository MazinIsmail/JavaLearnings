
static synchronized methods synchronize on the class object. If one thread is executing a static synchronized method, all other threads trying to execute any static synchronized methods, in the same class, will block.

non-static synchronized methods synchronize on "this" (the instance object). If one thread is executing a synchronized method, all other threads trying to execute any synchronized methods, in the same class, will block.

