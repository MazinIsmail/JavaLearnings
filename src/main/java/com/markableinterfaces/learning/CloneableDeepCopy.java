/**
 * A Java program to demonstrate deep copy using clone() 
 */
package com.markableinterfaces.learning;

class Demo {
	int x, y;
}

// Contains a reference of Test and implements 
// clone with deep copy. 
class Demo2 implements Cloneable {
	int a, b;

	Demo c = new Demo();

	public Object clone() throws CloneNotSupportedException {
		// Assign the shallow copy to new refernce variable t
		Demo2 demo2object = (Demo2) super.clone();

		demo2object.c = new Demo();

		// Create a new object for the field c and assign it to shallow copy obtained,
		// to make it a deep copy
		return demo2object;
	}
}

public class CloneableDeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Demo2 demo2orginal = new Demo2();
		demo2orginal.a = 10;
		demo2orginal.b = 20;
		demo2orginal.c.x = 30;
		demo2orginal.c.y = 40;

		Demo2 demo2cloned = (Demo2) demo2orginal.clone();
		demo2cloned.a = 100;

		// Change in primitive type of t2 will not be reflected in t1 field
		demo2cloned.c.x = 300;

		// Change in object type field of t2 will not be reflected in t1(deep copy)
		System.out.println("values t1 : " + demo2orginal.a + " " + demo2orginal.b + " " + demo2orginal.c.x + " " + demo2orginal.c.y);
		System.out.println("values t3 : " + demo2cloned.a + " " + demo2cloned.b + " " + demo2cloned.c.x + " " + demo2cloned.c.y);

	}

}
