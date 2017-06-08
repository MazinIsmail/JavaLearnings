package mazin.certification.threads;

public class ThreadsRuntimeException {

	public static class Threads2 implements Runnable {
		public void run() {
			System.out.println("run.");
			throw new RuntimeException("Problem");
		}
	
		public static void main(String[] args) {
			Thread t = new Thread(new Threads2());
			t.start();
			System.out.println("End of method.");
		}
		
		void waitForSignal() throws InterruptedException {
			Object obj = new Object();
			synchronized (Thread.currentThread()) {
			obj.wait();
			obj.notify();
			}
		}
	}
}


/*
When thread t will start to execute then there is surity that run() 
method will excute first before println(“End of method.”).

But if run() method is going to execute first then RuntimeException(“Problem”) will be next one
 and then prinln() method.So both D,E are correct answers.
*/

/*
There is no restriction on number of thread for deadlock.

*/