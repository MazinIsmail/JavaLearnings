package com.executorService.learnings;

import java.util.concurrent.Callable;

public class CallableSample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(3000);
		return 23;
	}

}
