package com.customexception.learning;
/*
 A try block can be followed by one or more catch blocks. 
 Each catch block must contain a different exception handler.
 */
public class MultipleCatch {
	public static void Multiple() {
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");
	}
	public static void main(String[] args) {  
		Multiple();           
 }  
}
