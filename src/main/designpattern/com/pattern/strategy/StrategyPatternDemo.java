package com.pattern.strategy;

/**
 * Strategy is a behavioral pattern in Gang of Four Design pattern list. Defines
 * a set of encapsulated algorithms that can be swapped to carry out a specific
 * behaviour.
 * 
 * Where Would I Use This Pattern?
 * 
 * The Strategy pattern is to be used where you want to choose the algorithm to
 * use at runtime. The Strategy pattern provides a way to define a family of
 * algorithms, encapsulate each one as an object, and make them interchangeable.
 * 
 * Strategy pattern enables a client code to choose from a family of related but
 * different algorithms and gives it a simple way to choose any of the algorithm
 * in runtime depending on the client context.
 * 
 * Strategy pattern is based upon Open Closed design principle of SOLID
 * principals. We don’t need to modify the context [closed for modification],
 * but can choose and add any implementation [open for extension].
 * 
 * It allows to add new algorithm without modifying existing algorithms or
 * context class, which uses algorithm or strategies.
 * 
 * For example, in Collections.sort() – we don’t need to change the sort method
 * to achieve different sorting results. We can just supply different
 * comparators in runtime. Java Collections.sort(list, comparator) method where
 * client actually passes suitable comparator based on the requirement in
 * runtime to the method and the method is generic to accept any comparator
 * type. Based on the comparator being passed, same collection can be sorted
 * differently. Other Examples: encryption, compression or sorting algorithm.
 */

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
