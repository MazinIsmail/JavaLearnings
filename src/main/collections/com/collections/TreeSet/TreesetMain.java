package com.collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*Doesn't allow duplicate values, It will automatically remove the duplicate one.
Will not maintain insertion order
Elements will be sorted*/

public class TreesetMain {

	public static void main(String[] args) {

		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		
	}

}
}