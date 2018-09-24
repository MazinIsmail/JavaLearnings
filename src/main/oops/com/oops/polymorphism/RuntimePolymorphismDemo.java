package com.oops.polymorphism;

/*Polymorphism that is resolved during compiler time is known as Compile Time Polymorphism (Static Polymorphism).
 *Method overloading is an example of compile time polymorphism.
 *1. Number of parameters.
 *2. Data type of parameters.
 *3. Sequence of Data type of parameters.*/
public class RuntimePolymorphismDemo {

	public static void main(String args[]) {
		SimpleCalculator obj = new SimpleCalculator();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
	}
}
