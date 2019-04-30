/**
 * A Java program to demonstrate shallow copy using clone()
 */
package com.markableinterfaces.learning;


class Test1 
{ 
    int x, y; 
} 
  
// Contains a reference of Test and implements clone with shallow copy. 
class Test2 implements Cloneable 
{ 
    int a; 
    int b; 
    Test1 c = new Test1(); 
    
    public Object clone() throws
                   CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
} 

public class CloneableShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		 Test2 test2orginal = new Test2(); 
	       test2orginal.a = 10; 
	       test2orginal.b = 20; 
	       test2orginal.c.x = 30; 
	       test2orginal.c.y = 40; 
	  
	       Test2 test2cloned = (Test2)test2orginal.clone(); 
	  
	       // Creating a copy of object t1 and passing   it to t2 
	       test2cloned.a = 100; 
	  
	       // Change in primitive type of t2 will not  be reflected in t1 field 
	       test2cloned.c.x = 300; 
	  
	       // Change in object type field will be reflected in both t2 and t1(shallow copy) 
	       System.out.println("values t1 : "+test2orginal.a + " " + test2orginal.b + " " + "valus in Test1 : "+test2orginal.c.x + " " + test2orginal.c.y); 
	       System.out.println("values t2 : "+test2cloned.a + " " + test2cloned.b + " " + "valus in Test1 : "+test2cloned.c.x + " " + test2cloned.c.y); 

	}

}
