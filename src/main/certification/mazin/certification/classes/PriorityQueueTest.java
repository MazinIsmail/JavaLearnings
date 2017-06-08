package mazin.certification.classes;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("banana");
		pq.add("pear");
		
		pq.add("apple");
		/*pq.add("applc");
		pq.add("applcccc");*/
		
		System.out.println(pq.poll() + " " + pq.peek());
	}
}
