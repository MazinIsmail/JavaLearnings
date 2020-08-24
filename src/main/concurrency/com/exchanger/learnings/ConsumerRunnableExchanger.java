package com.exchanger.learnings;

import java.util.concurrent.Exchanger;

public class ConsumerRunnableExchanger implements Runnable {
	private Exchanger<CountrySample> ex;

	ConsumerRunnableExchanger(Exchanger<CountrySample> ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				// Getting Country object from producer thread
				// giving dummy country object in return
				CountrySample country = ex.exchange(new CountrySample("Dummy"));
				System.out.println("In Consumer, got country object from Producer thread: " + country.getCountryName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
