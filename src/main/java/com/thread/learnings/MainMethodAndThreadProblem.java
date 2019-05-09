package com.thread.learnings;
/**
 * Below program demonstrate a use case why we need thread
 * When we need a functionality which is long running and we need other functionality 
 * works with out any delay : go for thread.
 */
class MyTask{
	void executeTask() {
		for (int doc = 0; doc <=10; doc++) {
			System.out.println("job 2:Printing Document #" + doc + " :Printer2");
		}
	
	}
}

public class MainMethodAndThreadProblem {
//	Main method represent main thread
//	every java program has at least one thread - main thread 
	public static void main(String[] args) {

		//job1
		System.out.println("*********application started**********");
		
		//job 2
		MyTask task = new MyTask();
		task.executeTask();
		
		//job 3 will execute only if job 2 is completed
		//in case job 3 is a long running operation ie:10000+ docs to be printed 
		//job 3 has to wait till then
		
		//job 3
		for (int doc = 0; doc <=10; doc++) {
			System.out.println("job 1:Printing Document #" + doc + " :Printer1");
		}
		System.out.println("*********application end**********");
	
	}

}
