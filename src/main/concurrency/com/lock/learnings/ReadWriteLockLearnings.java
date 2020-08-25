package com.lock.learnings;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * A java.util.concurrent.locks.ReadWriteLock is an advanced thread lock
 * mechanism. It allows multiple threads to read a certain resource, but only
 * one to write it, at a time.
 * 
 * ReadWriteLock is an interface.
 * 
 * The idea is, that multiple threads can read from a shared resource without
 * causing concurrency errors. The concurrency errors first occur when reads and
 * writes to a shared resource occur concurrently, or if multiple writes take
 * place concurrently.
 * 
 * ReadWriteLock Locking Rules
 * 
 * Read Lock:- If no threads have locked the ReadWriteLock for writing, and no
 * thread have requested a write lock (but not yet obtained it). Thus, multiple
 * threads can lock the lock for reading.
 * 
 * Write Lock:- If no threads are reading or writing. Thus, only one thread at a
 * time can lock the lock for writing.
 * 
 * The interface ReadWriteLock specifies another type of lock maintaining a pair
 * of locks for read and write access. The idea behind read-write locks is that
 * it's usually safe to read mutable variables concurrently as long as nobody is
 * writing to this variable. So the read-lock can be held simultaneously by
 * multiple threads as long as no threads hold the write-lock. This can improve
 * performance and throughput in case that reads are more frequent than writes.
 */
public class ReadWriteLockLearnings {

	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		readWriteLock.readLock().lock();
		// multiple readers can enter this section
		// if not locked for writing, and not writers waiting
		// to lock for writing.
		readWriteLock.readLock().unlock();

		readWriteLock.writeLock().lock();
		// only one writer can enter this section,
		// and only if no threads are currently reading.
		readWriteLock.writeLock().unlock();

		/**
		 * Example:-
		 * 
		 * You'll notice that both read tasks have to wait the whole second until the
		 * write task has finished. After the write lock has been released both read
		 * tasks are executed in parallel and print the result simultaneously to the
		 * console. They don't have to wait for each other to finish because read-locks
		 * can safely be acquired concurrently as long as no write-lock is held by
		 * another thread.
		 */
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Map<String, String> map = new HashMap<>();
		ReadWriteLock lock = new ReentrantReadWriteLock();

		executor.submit(() -> {
			lock.writeLock().lock();
			try {
				Thread.sleep(1000);
				System.out.println("Putting value to map");
				map.put("foo", "bar");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.writeLock().unlock();
			}
		});

		Runnable readTask = () -> {
			lock.readLock().lock();
			try {
				System.out.println("Getting value from map");
				System.out.println(map.get("foo"));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lock.readLock().unlock();
			}
		};

		executor.submit(readTask);
		executor.submit(readTask);

		executor.shutdown();
	}
}
