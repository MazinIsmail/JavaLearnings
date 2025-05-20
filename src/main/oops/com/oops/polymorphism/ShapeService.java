package com.oops.polymorphism;

class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
}

class ShapeService {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Square();
		/*
		 * When we call the draw() method on these objects, the correct implementation
		 * is called based on the actual type of the object.
		 * 
		 * This is known as runtime polymorphism or dynamic polymorphism. Will discuss
		 * more on this...
		 */
		s1.draw(); // Output: "Drawing a circle"
		s2.draw(); // Output: "Drawing a square"

	}
}
