package com.customexception.learning;

import java.io.IOException;
//When child class method is throwing border checked exception compared to the same method of base class
 class Animal {
	void color() throws IOException
	{
		  System.out.println("Black");
	}  
}
class ChildClassThrowsBroaderException extends Animal{
	  void color()
	  {
		  System.out.println("White");
	  }  
	  public static void main(String args[]){  
		  Animal obj = new ChildClassThrowsBroaderException();  
		   try{
		   obj.color();
		   }catch(Exception e){
			   System.out.println(e);
		   }
	  } 

}
