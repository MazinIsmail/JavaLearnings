package com.exchanger.learnings;

import java.util.concurrent.Exchanger;

public class ProducerRunnableExchanger implements Runnable {

	private Exchanger<CountrySample> ex;

	ProducerRunnableExchanger(Exchanger<CountrySample> ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			CountrySample country = null;
			if (i == 0)
				country = new CountrySample("India");
			else
				country = new CountrySample("Bhutan");
			try {
				// exchanging with an dummy Country object
				CountrySample dummyCountry = ex.exchange(country);
				System.out.println(
						"In Producer, got country object from Consumer thread: " + dummyCountry.getCountryName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
