package com.pattern.singleton;

import java.util.concurrent.Callable;

public class CallableGetInstance implements Callable<ThreadSafeSingleton2> {

	@Override
	public ThreadSafeSingleton2 call() throws Exception {
		ThreadSafeSingleton2 instance = ThreadSafeSingleton2.getInstanceUsingDoubleLocking();
		return instance;
	}

}
