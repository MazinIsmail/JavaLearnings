package com.customexception.learning;
/*
 *This code will demonstrate the Exception handling using the keywords try,catch and finally.
 *Exception: An event which disrupts the normal flow of the program
 *Exception Handling: A mechanism to handle runtime errors
 *This is an example for Unchecked exception.
 *Unchecked Exception: Classes which inherit Runtime Exception.
 */
public class UncheckedException {
	public static void ArithException() {
		try  
        {  
        int data=50/0; //may throw exception   
        }  
		
        //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
		
		//Java finally block is always executed whether exception is handled or not.
//        finally
//        {
//        	System.out.println("finally block is always executed");
//        }
        System.out.println("rest of the code");  
	}
	 public static void main(String[] args) {  
		 ArithException();
	    }  
}
