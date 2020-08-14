package com.pattern.template;

/**
 * 
 * Behavioral design pattern.
 * 
 * Template method design pattern is to define an algorithm as a skeleton of
 * operations and leave the details to be implemented by the child classes. The
 * overall structure and sequence of the algorithm is preserved by the parent
 * class. Template method consists of steps. This steps can be an abstract
 * method which will be implemented by its subclasses.
 * 
 * The template method is used in frameworks.
 * 
 * Control at what points subclassing is allowed. As opposed to a simple
 * polymorphic override, where the base method would be entirely rewritten
 * allowing radical change to the workflow, only the specific details of the
 * workflow are allowed to change.
 * 
 * Example in Java:-
 * 
 * All non-abstract methods of java.io.InputStream, java.io.OutputStream,
 * java.io.Reader and java.io.Writer. All non-abstract methods of
 * java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
 * 
 * It makes it easier to implement complex algorithms by encapsulating logic in
 * a single method.
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
