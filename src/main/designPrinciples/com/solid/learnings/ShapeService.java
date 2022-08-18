package com.solid.learnings;

public class ShapeService {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Square Square = new Square();
		/*
		 * The below classes do not obey LSP because you cannot replace the Rectangle
		 * base class with its derived class Square. The Square class has extra
		 * constraints, i.e., the height and width must be the same. Therefore,
		 * substituting Rectangle with Square class may result in unexpected behaviour.
		 */
		Rectangle rectangleSquare = new Square();
	}
}
