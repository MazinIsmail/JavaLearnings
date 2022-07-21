package com.oops.inheritance;

public class IsARelationship {
	public static void main(String args[]) {
		Mammal m = new Mammal();
		Dog d = new Dog();

		// instanceof operator to check determine whether Mammal is actually an Animal
		System.out.println("Mammal instanceof Animal? " + (m instanceof Animal));
		System.out.println("Dog instanceof Mammal? " + (d instanceof Mammal));
		System.out.println("Dog instanceof Animal? " + (d instanceof Animal));
		System.out.println("Dog instanceof Object? " + (d instanceof Object));
		System.out.println("Dog instanceof Object? " + (m instanceof Dog));

		/**
		 * Connecting a method call to the method body is known as binding.
		 * 
		 * When type of the object is determined at compiled time(by the compiler), it
		 * is known as static binding.
		 */
		Dog d1 = new Dog();

		// When type of the object is determined at run-time, it is known as dynamic
		// binding.
		Animal a = new Dog();
	}

}

class Animal {
}

//Animal is the superclass of Mammal class.
//Mammal is a subclasses.
//Mammal is a subclasses of Animal class.
//Mammal IS-A Animal
class Mammal extends Animal {
}

//Animal is the superclass of Reptile class.
//Reptile is a subclasses.
//Reptile is a subclasses of Animal class.
//Reptile IS-A Animal
class Reptile extends Animal {
}

//Dog is the subclass of both Mammal and Animal classes
//Dog IS-A Mammal. Hence: Dog IS-A Animal as well
class Dog extends Mammal {
}
