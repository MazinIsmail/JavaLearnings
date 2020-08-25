package com.lock.learnings;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * Java 8 ships with a new kind of lock called StampedLock which also support
 * read and write locks just like in the example above. In contrast to
 * ReadWriteLock the locking methods of a StampedLock return a stamp represented
 * by a long value. You can use these stamps to either release a lock or to
 * check if the lock is still valid. Additionally stamped locks support another
 * lock mode called optimistic locking.
 * 
 * Obtaining a read or write lock via readLock() or writeLock() returns a stamp
 * which is later used for unlocking within the finally block. Keep in mind that
 * stamped locks don't implement reentrant characteristics. Each call to lock
 * returns a new stamp and blocks if no lock is available even if the same
 * thread already holds a lock. So you have to pay particular attention not to
 * run into deadlocks.
 * 
 * Just like in the previous ReadWriteLock example both read tasks have to wait
 * until the write lock has been released. Then both read tasks print to the
 * console simultaneously because multiple reads doesn't block each other as
 * long as no write-lock is held.
 */
public class StampedLockLearnings {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Map<String, String> map = new HashMap<>();
		StampedLock lock = new StampedLock();

		executor.submit(() -> {
			long stamp = lock.writeLock();
			try {
				System.out.println("writeLock stamp: " + stamp);
				Thread.sleep(1000);
				System.out.println("Putting value to map");
				map.put("foo", "bar");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("writeLock stamp: " + stamp);
				System.out.println();
				/**
				 * public void unlockWrite(long stamp)
				 * 
				 * If the lock state matches the given stamp, releases the exclusive lock.
				 */
				lock.unlockWrite(stamp);
			}
		});

		Runnable readTask = () -> {
			long stamp = lock.readLock();
			try {
				System.out.println("readLock stamp: " + stamp);
				System.out.println("Getting value from map");
				System.out.println(map.get("foo"));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("readLock stamp: " + stamp);
				/**
				 * public void unlockRead(long stamp)
				 * 
				 * If the lock state matches the given stamp, releases the non-exclusive lock.
				 * 
				 * Parameters: stamp - a stamp returned by a read-lock operation
				 */
				lock.unlockRead(stamp);
			}
		};
		executor.submit(readTask);
		executor.submit(readTask);
		executor.submit(readTask);
		executor.submit(readTask);
		executor.submit(readTask);
		executor.shutdown();

		Thread.sleep(7000);
		System.out.println();
		System.out.println();

		// Optimistic locking

		executor = Executors.newFixedThreadPool(2);
		StampedLock lockOptimisticRead = new StampedLock();

		executor.submit(() -> {
			/**
			 * public long tryOptimisticRead()
			 * 
			 * Returns a stamp that can later be validated, or zero if exclusively locked.
			 * 
			 * Returns:a stamp, or zero if exclusively locked
			 */
			long stamp = lockOptimisticRead.tryOptimisticRead();
			try {
				System.out.println("Optimistic Lock Valid: " + lockOptimisticRead.validate(stamp));
				Thread.sleep(1000);
				System.out.println("Optimistic Lock Valid: " + lockOptimisticRead.validate(stamp));
				Thread.sleep(2000);
				System.out.println("Optimistic Lock Valid: " + lockOptimisticRead.validate(stamp));
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lockOptimisticRead.unlock(stamp);
			}
		});

		executor.submit(() -> {
			long stamp = lockOptimisticRead.writeLock();
			try {
				System.out.println("Optimistic Write Lock acquired");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				lockOptimisticRead.unlock(stamp);
				System.out.println("Optimistic Write done");
			}
		});

		executor.shutdown();

		Thread.sleep(5000);
		System.out.println();
		System.out.println();

		/**
		 * Output:
		 * 
		 * Optimistic Lock Valid: true
		 * 
		 * Optimistic Write Lock acquired
		 * 
		 * Optimistic Lock Valid: false
		 * 
		 * Optimistic Write done
		 * 
		 * Optimistic Lock Valid: false
		 * 
		 * The optimistic lock is valid right after acquiring the lock. In contrast to
		 * normal read locks an optimistic lock doesn't prevent other threads to obtain
		 * a write lock instantaneously. After sending the first thread to sleep for one
		 * second the second thread obtains a write lock without waiting for the
		 * optimistic read lock to be released. From this point the optimistic read lock
		 * is no longer valid. Even when the write lock is released the optimistic read
		 * locks stays invalid.
		 */

		// tryConvertToWriteLock() method

		/**
		 * Sometimes it's useful to convert a read lock into a write lock without
		 * unlocking and locking again. StampedLock provides the method
		 * tryConvertToWriteLock() for that purpose
		 */
		executor = Executors.newFixedThreadPool(2);
		StampedLock lockTryConvertToWriteLock = new StampedLock();

		executor.submit(() -> {
			long stamp = lockTryConvertToWriteLock.readLock();
			int count = 0;
			try {
				if (count == 0) {
					/**
					 * If the lock state matches the given stamp, performs one of the following
					 * actions. If the stamp represents holding a write lock, returns it. Or, if a
					 * read lock, if the write lock is available, releases the read lock and returns
					 * a write stamp. Or, if an optimistic read, returns a write stamp only if
					 * immediately available. This method returns zero in all other cases.
					 */
					stamp = lockTryConvertToWriteLock.tryConvertToWriteLock(stamp);
					if (stamp == 0L) {
						System.out.println("Could not convert to write lock");
						stamp = lockTryConvertToWriteLock.writeLock();
					}
					count = 23;
				}
				System.out.println(count);
			} finally {
				lockTryConvertToWriteLock.unlock(stamp);
			}
		});

		executor.shutdown();
	}
}
