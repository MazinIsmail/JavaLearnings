package mazin.certification.threads;

public class ThreadsIllegalMonitorStateException {

	public static class Threads2 implements Runnable {
		public void run() {
			System.out.println("run.");
		}
	
		public static void main(String[] args) throws InterruptedException {
			waitForSignal();
		}
		
		static void waitForSignal() throws InterruptedException {
			Object obj = new Object();
			synchronized (Thread.currentThread()/**/) {
			obj.wait();
			obj.notify();
			}
		}
	}
}

/*
If the thread calling wait() does not own the lock on the object, a IllegalMonitorStateException will be thrown.

Here we haven’t take lock for obj we are taking lock for current thread object.
*/