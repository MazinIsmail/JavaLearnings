package com.customexception.learning;

import java.io.IOException;

public class Vehicle { 
	   void brand() throws IOException
	   {
	       System.out.println("Yamaha");
	   }  
	}
	class Bike extends Vehicle{
	    void brand() throws IOException
	    {
	        System.out.println("Bajaj");
	    }  
	    public static void main(String args[]){  
	    	Vehicle obj = new Bike();  
	        try{
		   obj.brand();
		}catch(Exception e){
		   System.out.println(e);
		 }
	    } 
	}


