package com.oops.basics;
/**
 * In Java, we can access grandparent’s members only through the parent class.
 *
 */
class Grandparent1 { 
    public void Print() { 
        System.out.println("Grandparent's Print()"); 
    } 
} 
   
class Parent1 extends Grandparent1 { 
    public void Print() { 
        super.Print(); 
        System.out.println("Parent's Print()"); 
    } 
} 
   
class Child1 extends Parent1 { 
    public void Print() { 
        super.Print(); 
        System.out.println("Child's Print()"); 
    } 
} 
public class SuperSuperKeywordDemo2 {

	public static void main(String[] args) {
		Child1 c = new Child1(); 
        c.Print(); 

	}

}
