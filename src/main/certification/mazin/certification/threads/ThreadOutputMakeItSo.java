package mazin.certification.threads;

public class ThreadOutputMakeItSo extends Thread {

	private int x = 2;
	public static void main(String[] args) throws Exception {
		new ThreadOutputMakeItSo().makeItSo();
	}
	public ThreadOutputMakeItSo() {
		x = 5;
		start();
	}
	
	public void makeItSo() throws Exception {
		join();
		x = x -1;
		System.out.println(x);
	}

	public void run() {
		x *= 2;
	}
}
