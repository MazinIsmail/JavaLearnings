package com.oops.abstractlearnings;

// extends for abstract implementation
class AbstractionImplementationLearnings extends AbstractionLearnings {

	void run() {
		System.out.println("Running...");
	}

	public static void main(String args[]) {
		AbstractionLearnings obj = new AbstractionImplementationLearnings();
		obj.run();
	}
}
