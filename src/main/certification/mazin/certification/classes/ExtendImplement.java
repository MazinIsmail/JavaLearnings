package mazin.certification.classes;

import mazin.certification.support.Shape;

public class ExtendImplement {

	public static void main(String[] args) {
		
		/*
		 * Shape is a Abstract class which contains one abstract method and one concrete method.
		 */

		/*
		class Circle implements Shape {
			private int radius;
		}
		abstract class Circle implements Shape {
			private int radius;
			public void draw();
		}
		abstract class Circle implements Shape {
			private int radius;
			public void draw() { code here  }
		}
		The type Shape cannot be a superinterface of Circle; a superinterface must be an interface
		*/
		
		/*
		Circle is a abstract class , so it doesn’t need to override the abstract method of parent class.
		*/
		abstract class Circle extends Shape {
			private int radius;
		}
		/*
		Circle is not a abstract class and the body of Circle contain a incomplete draw() method.
		If a class is not an abstract then it cannot contain incomplete method.
		In java, abstract keyword is compulsory to write in the front of incomplete method.
		class Circle1 extends Shape {
			private int radius;
			public void draw();
		}
		*/
		
		class Circle1 extends Shape {
			private int radius;
			public void draw() {/* code here */}
		}
		
	}
}
