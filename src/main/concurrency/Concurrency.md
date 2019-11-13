

Concurrency is the ability to run several programs or several parts of a program in parallel.
The backbone of java concurrency are threads. A thread is a lightweight process which has its own call stack, but can access shared data of other threads in the same process.
A good example of thread safe class is java servlets which have no fields and references, no fields from other classes etc. They are stateless.

Object level lock vs Class level lock
