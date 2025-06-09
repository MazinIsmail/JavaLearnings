package com.sealed.learnings;

/**
 * Sealed classes in Java was introduced in Java 15.
 * 
 * In Java, we have the concept of abstract classes. It is mandatory to inherit
 * from these classes since objects of these classes cannot be instantiated. On
 * the other hand, there is a concept of a final class in Java, which cannot be
 * inherited or extended by any other class.
 * 
 * What if we want to restrict the number of classes that can inherit from a
 * particular class? The answer is sealed class. Sealed classes combine the
 * features of both abstract and final classes.
 * 
 * the programmer must specify the list of classes that can inherit it.
 */
public class SealedClass {

	// Human is the parent class of Manish, Vartika, and Anjali. It is a sealed
	// class so; other classes cannot inherit it.
	sealed class Human permits Manish, Vartika, Anjali {
		public void printName() {
			System.out.println("Default");
		}
	}

	// Manish, Vartika, and Anjali are child classes of the Human class, and it is
	// necessary to make them either sealed, non-sealed, or final. Child classes of
	// a sealed class must be sealed, non-sealed, or final.
	non-sealed class Manish extends Human {
		public void printName() {
			System.out.println("Manish Sharma");
		}
	}

	sealed class Vartika extends Human permits Sam {
		public void printName() {
			System.out.println("Vartika Dadheech");
		}
	}

	final class Anjali extends Human {
		public void printName() {
			System.out.println("Anjali Sharma");
		}
	}

	non-sealed class Sam extends Vartika {
		public void printName() {
			System.out.println("Sam Sharma");
		}
	}

}
