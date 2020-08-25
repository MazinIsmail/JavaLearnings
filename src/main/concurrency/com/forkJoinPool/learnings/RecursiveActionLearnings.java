package com.forkJoinPool.learnings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * A RecursiveAction is a task which does not return any value. It just does
 * some work, e.g. writing data to disk, and then exits.
 * 
 * A RecursiveAction may still need to break up its work into smaller chunks
 * which can be executed by independent threads or CPUs.
 */
public class RecursiveActionLearnings extends RecursiveAction {

	private static final long serialVersionUID = 1L;
	private long workLoad = 0;

	public RecursiveActionLearnings(long workLoad) {
		this.workLoad = workLoad;
	}

	@Override
	protected void compute() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// if work is above threshold, break tasks up into smaller tasks
		if (this.workLoad > 16) {
			System.out.println("RecursiveActionLearnings: Splitting workLoad : " + this.workLoad);
			List<RecursiveActionLearnings> subtasks = new ArrayList<RecursiveActionLearnings>();
			subtasks.addAll(createSubtasks());
			for (RecursiveActionLearnings subtask : subtasks) {
				/**
				 * Arranges to asynchronously execute this task in the pool the current task is
				 * running in, if applicable, or using the ForkJoinPool.commonPool() if not
				 * inForkJoinPool().
				 */
				subtask.fork();
			}
		} else {
			System.out.println("RecursiveActionLearnings: Doing workLoad myself: " + this.workLoad);
		}
	}

	private List<RecursiveActionLearnings> createSubtasks() {
		List<RecursiveActionLearnings> subtasks = new ArrayList<RecursiveActionLearnings>();
		RecursiveActionLearnings subtask1 = new RecursiveActionLearnings(this.workLoad / 2);
		RecursiveActionLearnings subtask2 = new RecursiveActionLearnings(this.workLoad / 2);
		subtasks.add(subtask1);
		subtasks.add(subtask2);
		return subtasks;
	}

}
