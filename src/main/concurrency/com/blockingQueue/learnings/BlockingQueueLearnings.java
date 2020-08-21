package com.blockingQueue.learnings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Multiple threads can be inserting and taking elements concurrently from a
 * Java BlockingQueue, without any concurrency issues arising.
 * 
 * A BlockingQueue is typically used to have one thread produce objects, which
 * another thread consumes.
 * 
 * The producing thread will keep producing new objects and insert them into the
 * BlockingQueue, until the queue reaches some upper bound on what it can
 * contain. It's limit, in other words. If the blocking queue reaches its upper
 * limit, the producing thread is blocked while trying to insert the new object.
 * It remains blocked until a consuming thread takes an object out of the queue.
 * 
 * The consuming thread keeps taking objects out of the BlockingQueue to
 * processes them. If the consuming thread tries to take an object out of an
 * empty queue, the consuming thread is blocked until a producing thread puts an
 * object into the queue.
 * 
 * It is not possible to insert null into a BlockingQueue.
 * 
 * It is also possible to access all the elements inside a BlockingQueue, and
 * not just the elements at the start and end.
 * 
 * following implementations of the BlockingQueue interface:
 * 
 * -ArrayBlockingQueue -DelayQueue -LinkedBlockingQueue -PriorityBlockingQueue
 * -SynchronousQueue
 */
public class BlockingQueueLearnings {

	public static void main(String[] args) throws Exception {

		BlockingQueue blockingQueue = new ArrayBlockingQueue(1024);

		ProducerSample producerSample = new ProducerSample(blockingQueue);
		ConsumerSample consumerSample = new ConsumerSample(blockingQueue);

		new Thread(producerSample).start();
		new Thread(consumerSample).start();

		Thread.sleep(4000);
	}

}
