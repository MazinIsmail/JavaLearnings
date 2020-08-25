package com.forkJoinPool.learnings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * A RecursiveTask is a task that returns a result. It may split its work up
 * into smaller tasks, and merge the result of these smaller tasks into a
 * collective result. The splitting and merging may take place on several
 * levels.
 */
public class RecursiveTaskLearnings extends RecursiveTask<Long> {

	private static final long serialVersionUID = 1L;
	private long workLoad = 0;

	public RecursiveTaskLearnings(long workLoad) {
		this.workLoad = workLoad;
	}

	@Override
	protected Long compute() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// if work is above threshold, break tasks up into smaller tasks
		if (this.workLoad > 16) {
			System.out.println("RecursiveTaskLearnings: Splitting workLoad : " + this.workLoad);
			List<RecursiveTaskLearnings> subtasks = new ArrayList<RecursiveTaskLearnings>();
			subtasks.addAll(createSubtasks());
			for (RecursiveTaskLearnings subtask : subtasks) {
				subtask.fork();
			}
			long result = 0;
			for (RecursiveTaskLearnings subtask : subtasks) {
				/**
				 * Returns the result of the computation when it is done.
				 */
				result += subtask.join();
			}
			return result;
		} else {
			System.out.println("RecursiveTaskLearnings: Doing workLoad myself: " + this.workLoad);
			return workLoad * 3;
		}
	}

	private List<RecursiveTaskLearnings> createSubtasks() {
		List<RecursiveTaskLearnings> subtasks = new ArrayList<RecursiveTaskLearnings>();
		RecursiveTaskLearnings subtask1 = new RecursiveTaskLearnings(this.workLoad / 2);
		RecursiveTaskLearnings subtask2 = new RecursiveTaskLearnings(this.workLoad / 2);
		subtasks.add(subtask1);
		subtasks.add(subtask2);
		return subtasks;
	}
}