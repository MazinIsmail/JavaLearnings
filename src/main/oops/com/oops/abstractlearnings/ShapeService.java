package com.oops.abstractlearnings;

public class ShapeService {

	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.draw();

		shape = new Circle();
		shape.draw();
	}
}
