package mazin.certification.classes;

import mazin.certification.support.TestA;

public class Test {
	public static void main(String[] args) {
		System.out.println(
			new TestA() {
				public String toString() { return "test"; }
			}
		);
		//You have actually defined a class that implements the interface and instantiated the class at the same time.
	}

}
