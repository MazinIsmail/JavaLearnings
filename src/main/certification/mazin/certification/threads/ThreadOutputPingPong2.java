package mazin.certification.threads;

class PingPong2 {
	synchronized void hit(long n) {
		for(int i = 1; i < 3; i++)
			System.out.print(n + "-" + i + " ");
	}
}

public class ThreadOutputPingPong2 implements Runnable {
	static PingPong2 pp2 = new PingPong2();
	public static void main(String[] args) {
		new Thread(new ThreadOutputPingPong2()).start();
		new Thread(new ThreadOutputPingPong2()).start();
	}
	
	public void run() {
		pp2.hit(Thread.currentThread().getId()); 
	}
}

/*
public long getId()
Returns the identifier of this Thread. 
The thread ID is a positive long number generated when this thread was created. 
The thread ID is unique and remains unchanged during its lifetime. 
When a thread is terminated, this thread ID may be reused.
*/
