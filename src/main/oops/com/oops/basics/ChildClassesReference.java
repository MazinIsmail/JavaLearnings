package com.oops.basics;

/**
 * A child class cannot be used as a reference to an object of super
 * class.Compilation error will occur
 */
public class ChildClassesReference {

	void myMethod() {
		System.out.println("GeeksforGeeks");
	}
}


class Derived extends ChildClassesReference {

/*public class Derived extends ChildClassasReference {
>>>>>>> branch 'master' of https://github.com/MazinIsmail/JavaLearnings.git
	void myMethod() {
		System.out.println("GFG");
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		ChildClassesReference object = new ChildClassesReference();
		object.myMethod();
	}
}
=======
		Derived object = new ChildClassasReference();
		object.myMethod();
	}
}*/
}

