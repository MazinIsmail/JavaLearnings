package com.customexception.learning;

import java.io.IOException;

public class Animal {
	void color() throws IOException
	{
		  System.out.println("Black");
	}  
}
class Dog extends Animal{
	  void color()
	  {
		  System.out.println("White");
	  }  
	  public static void main(String args[]){  
		   Animal obj = new Dog();  
		   try{
		   obj.color();
		   }catch(Exception e){
			   System.out.println(e);
		   }
	  } 

}
