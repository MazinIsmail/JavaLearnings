package com.customexception.learning;
//If base class doesn’t throw any exception but child class can only throws an unchecked exception and not checked exception
class Building {
	void color()
	   {
	       System.out.println("Blue");
	   }  
	}
	class OnlyChildClassThrowsUncheckedException extends Building{
	   //It throws an unchecked exception
	   void color() throws NullPointerException
	   {
	       System.out.println("White");
	   }  
	   public static void main(String args[]){  
		   Building obj = new OnlyChildClassThrowsUncheckedException();  
	       obj.color(); 
	   } 

}
