package mazin.certification.classes;

public class FucntionCallsBarn {
	public static void main(String[] args) {
		/*new FucntionCalls().go("hi", 1);
		new FucntionCalls().go("hi", "world", 2);*/
		new FucntionCallsBarn().go1(2, "hi", "world");
	}
	
	/*public void go(String... y, int x) {
		System.out.print(y[y.length - 1] + " ");
	}*/
	
	public void go1(int x, String... y) {
		System.out.print(y[y.length - 1] + " ");
	}
	
	/*
		Legal:
		void doStuff(int... x) { } // expects from 0 to many ints as parameters
		void doStuff2(char c, int... x) { } // expects first a char, then 0 to many ints
		void doStuff3(Animal... animal) { } // 0 to many Animals

		Illegal:
		void doStuff4(int x...) { } // bad syntax
		void doStuff5(int... x, char... y) { } // too many var-args
		void doStuff6(String... s, byte b) { } // var-arg must be last
	*/
	
}
