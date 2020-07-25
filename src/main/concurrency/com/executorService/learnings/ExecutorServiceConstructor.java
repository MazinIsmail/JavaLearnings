package com.executorService.learnings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceConstructor {

	public static void main(String[] args) {

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 1000, 120, TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(300));

		ExecutorService executorService = threadPoolExecutor;

		try {
			executorService.execute(new RunnableSample());
		} catch (RejectedExecutionException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();

	}

}
