package com.pattern.factorymethod;

/**
 * In class-based programming, the factory method pattern is a creational
 * pattern that uses factory methods to deal with the problem of creating
 * objects without having to specify the exact class of the object that will be
 * created.
 * 
 * This is done by creating objects by calling a factory method—either specified
 * in an interface and implemented by child classes, or implemented in a base
 * class and optionally overridden by derived classes—rather than by calling a
 * constructor.
 * 
 * Problem: A framework needs to standardize the architectural model for a range
 * of applications, but allow for individual applications to define their own
 * domain objects and provide for their instantiation.
 * 
 * Factory Method is to creating objects as Template Method is to implementing
 * an algorithm. A superclass specifies all standard and generic behavior (using
 * pure virtual "placeholders" for creation steps), and then delegates the
 * creation details to subclasses that are supplied by the client.
 * 
 * Factory Methods are routinely specified by an architectural framework, and
 * then implemented by the user of the framework.
 * 
 */
public class FactoryMethodLearnings {
	public static void main(String[] args) {
		DecodedImage decodedImage;
		ImageReader reader = null;
		String image = "test.jpeg";
		String format = image.substring(image.indexOf('.') + 1, (image.length()));
		if (format.equals("gif")) {
			reader = new GifReader(image);
		}
		if (format.equals("jpeg")) {
			reader = new JpegReader(image);
		}
		assert reader != null;
		decodedImage = reader.getDecodeImage();
		System.out.println(decodedImage);
	}
}
