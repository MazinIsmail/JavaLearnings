package com.exchanger.learnings;

import java.util.concurrent.Exchanger;

/**
 * The java.util.concurrent.Exchanger class represents a kind of rendezvous
 * point where two threads can exchange objects.
 * 
 * It facilitates the exchange of elements between a pair of threads by creating
 * a synchronization point. It simplifies the exchange of data between two
 * threads. Its operation is simple: it simply waits until two separate threads
 * call its exchange() method. When that occurs, it exchanges the data supplied
 * by the threads. It can also be viewed as a bidirectional SynchronousQueue.
 * 
 */
public class ExchangerLearnings {
	public static void main(String[] args) {
		Exchanger<CountrySample> exchanger = new Exchanger<CountrySample>();
		// Starting two threads
		ProducerRunnableExchanger producerRunnableExchanger = new ProducerRunnableExchanger(exchanger);
		Thread producerRunnableExchangerThread = new Thread(producerRunnableExchanger);
		producerRunnableExchangerThread.start();

		ConsumerRunnableExchanger consumerRunnableExchanger = new ConsumerRunnableExchanger(exchanger);
		Thread consumerRunnableExchangerThread = new Thread(consumerRunnableExchanger);
		consumerRunnableExchangerThread.start();

	}
}
