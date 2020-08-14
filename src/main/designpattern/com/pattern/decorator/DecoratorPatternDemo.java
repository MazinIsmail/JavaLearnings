package com.pattern.decorator;

/**
 * Structural pattern as this pattern acts as a wrapper to existing class.
 * 
 * Decorator Pattern is also known as Wrapper.
 * 
 * This pattern creates a decorator class which wraps the original class and
 * provides additional functionality keeping class methods signature intact. The
 * decorator design pattern allows us to dynamically add functionality and
 * behavior to an object without affecting the behavior of other existing
 * objects in the same class. Decorator design patterns are most often used for
 * applying single responsibility principles since we divide the functionality
 * into classes with unique areas of concern.
 * 
 * We use inheritance to extend the behavior of the class. This takes place at
 * compile time, and all of the instances of that class get the extended
 * behavior. Decorator design patterns allow us to add functionality to an
 * object (not the class) at runtime, and we can apply this customized
 * functionality to an individual object based on our requirement and choice. It
 * provides greater flexibility than static inheritance. Decorator design
 * pattern uses abstract classes or interfaces with the composition to implement
 * the wrapper. Decorator design patterns create decorator classes, which wrap
 * the original class and provide additional functionality by keeping the class
 * methods signature unchanged.
 * 
 * Identification: Decorator can be recognized by creation methods or
 * constructor that accept objects of the same class or interface as a current
 * class.
 * 
 * Examples in Java:-
 * 
 * All subclasses of java.io.InputStream, OutputStream, Reader and Writer have
 * constructors that accept objects of their own type.
 * 
 * java.util.Collections, methods checkedXXX(), synchronizedXXX() and
 * unmodifiableXXX().
 * 
 * javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
 * 
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new ColorShapeDecorator(new Circle());
		Shape redRectangle = new ColorShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
