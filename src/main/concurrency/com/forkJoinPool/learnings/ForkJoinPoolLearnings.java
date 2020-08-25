package com.forkJoinPool.learnings;

import java.util.concurrent.ForkJoinPool;

/**
 * The ForkJoinPool was added to Java in Java 7. The ForkJoinPool is similar to
 * the Java ExecutorService but with one difference. The ForkJoinPool makes it
 * easy for tasks to split their work up into smaller tasks which are then
 * submitted to the ForkJoinPool too. Tasks can keep splitting their work into
 * smaller subtasks for as long as it makes to split up the task.
 * 
 * Fork
 * 
 * A task that uses the fork and join principle can fork (split) itself into
 * smaller subtasks which can be executed concurrently. This is illustrated in
 * the diagram 'fork'. By splitting itself up into subtasks, each subtask can be
 * executed in parallel by different CPUs, or different threads on the same CPU.
 * 
 * A task only splits itself up into subtasks if the work the task was given is
 * large enough for this to make sense. There is an overhead to splitting up a
 * task into subtasks, so for small amounts of work this overhead may be greater
 * than the speedup achieved by executing subtasks concurrently.
 * 
 * The limit for when it makes sense to fork a task into subtasks is also called
 * a threshold. It is up to each task to decide on a sensible threshold.
 * 
 * Join
 * 
 * When a task has split itself up into subtasks, the task waits until the
 * subtasks have finished executing.
 * 
 * Once the subtasks have finished executing, the task may join (merge) all the
 * results into one result. This is illustrated in the diagram 'join'. Of
 * course, not all types of tasks may return a result. If the tasks do not
 * return a result then a task just waits for its subtasks to complete. No
 * result merging takes place then.
 * 
 * ForkJoinPool
 * 
 * The ForkJoinPool is a special thread pool which is designed to work well with
 * fork-and-join task splitting.
 * 
 * Critique: http://coopsoft.com/ar/CalamityArticle.html
 */
public class ForkJoinPoolLearnings {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * public ForkJoinPool(int parallelism)
		 * 
		 * Creates a ForkJoinPool with the indicated parallelism level.
		 */
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);

		/**
		 * You submit tasks to a ForkJoinPool similarly to how you submit tasks to an
		 * ExecutorService. You can submit two types of tasks. A task that does not
		 * return any result (an "action"), and a task which does return a result (a
		 * "task"). These two types of tasks are represented by the RecursiveAction and
		 * RecursiveTask classes.
		 */
		RecursiveActionLearnings recursiveActionLearnings = new RecursiveActionLearnings(64);
		forkJoinPool.invoke(recursiveActionLearnings);

		// Added delay so above can be over by that time.
		Thread.sleep(5000);
		System.out.println();

		RecursiveTaskLearnings recursiveTaskLearnings = new RecursiveTaskLearnings(128);
		long mergedResult = forkJoinPool.invoke(recursiveTaskLearnings);
		System.out.println("mergedResult = " + mergedResult);

	}
}
