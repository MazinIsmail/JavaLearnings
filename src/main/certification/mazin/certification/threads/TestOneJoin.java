package mazin.certification.threads;

public class TestOneJoin implements Runnable {
	public static void main (String[] args) throws Exception {
		Thread t = new Thread(new TestOneJoin());
		t.start();
		System.out.print("Started");
		t.join();
		System.out.print("Complete");
	}
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.print(i);
		}
	}
	public synchronized void go() { /* code here */ }
	void go1() {
		synchronized(Object.class) { /* code here */ }
	}
}
