package com.blockingQueue.learnings;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelaySample implements Delayed {
	private String name;
	private long time;

	public DelaySample(String name, long delayTime) {
		this.name = name;
		this.time = System.currentTimeMillis() + delayTime;
	}

	// Implementing getDelay() method of Delayed
	@Override
	public long getDelay(TimeUnit unit) {
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	// Implementing compareTo() method of Delayed
	public int compareTo(Delayed obj) {
		if (this.time < ((DelaySample) obj).time) {
			return -1;
		}
		if (this.time > ((DelaySample) obj).time) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "\n{" + "name=" + name + ", time=" + time + "}";
	}
}