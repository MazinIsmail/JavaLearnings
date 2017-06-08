package mazin.certification.threads;

public class ThreadError {
	
	public static void main (String[] args) {
		new ThreadError().go();
	}
	
	public void go() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("foo");
				}
		};
		Thread t = new Thread(r);
		t.start();
		t.start();
		/*
		This will throw exception as you can’t start one thread object more than one.
		*/
	}
	
}
