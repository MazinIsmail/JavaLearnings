package com.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetMethods2 {

	public static void main(String[] args) {
		
		TreeSet <Integer>treeSetObject1 = new TreeSet<Integer>();
		TreeSet <Integer>treeSetObject2 = new TreeSet<Integer>();

		  treeSetObject2.add(3);
		  treeSetObject2.add(5);
		  treeSetObject2.add(4);
		  treeSetObject2.add(1);
		  treeSetObject2.add(2);
		  treeSetObject2.add(8);

		  treeSetObject1.add(9);
		  treeSetObject1.add(3);
		  treeSetObject1.add(5);
		  treeSetObject1.add(4);
		  treeSetObject1.add(1);
		  treeSetObject1.add(2);
		  
		  /*Higher() : This method returns the least element in the TreeSet which is strictly greater than the given element
		  *in the argument of this method, or it will return null if there is no such element
		  */
		  System.out.println("highest value than 7 :  " + treeSetObject1.higher(7) );
		  
		  /*isEmpty() : This method returns true if the set is empty or false if set contains any element
		   */
		  System.out.println("Is Tree Set empty ? " +treeSetObject1.isEmpty());
		  
		  /* iterator():
		   * This method gives an object of Iterator class by which we can retrieve list
		   */
		  System.out.println("treeSetObject1 values using Iterator ");
		  Iterator<Integer> iteratorobj = treeSetObject1.iterator();
		  while (iteratorobj.hasNext())
		  {
		    System.out.print(iteratorobj.next() + " ");
		  }
		  
		  /*last(): This method returns the highest element present in the Treeset*/
		  System.out.println("Last elememt in Tree Set object is: "+treeSetObject1.last());
		  
		  /*lower(Object o): This method returns the greatest element in this treeset which is strictly less than the given element in the set*/
		  System.out.println("Greatest Element Less than 5: "+treeSetObject1.lower(5));
		  
		  /*pollFirst(): This method returns as well as removes the lowest element*/
		  System.out.println("Values in Tree Set object before Pollfirst: " + treeSetObject1);
		  System.out.println("Element identified using Pollfirst method "+treeSetObject1.pollFirst());
		  System.out.println("Values in Tree Set object after Pollfirst: " + treeSetObject1);
		  
		/* pollLast(): This method retrieves as well as removes the highest element */
		  System.out.println("Values in Tree Set object before PollLast: " + treeSetObject1);
		  System.out.println("Element identified using PollLast method "+treeSetObject1.pollLast());
		  System.out.println("Values in Tree Set object after PollLast: " + treeSetObject1);

		  //remove()
		  System.out.println("Values in Tree Set Object: " +treeSetObject1);
		  System.out.println("Is element '6' removed ? " +treeSetObject1.remove(2));
		  
		  //subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive):
		  System.out.println("Subset : true : true "+treeSetObject2.subSet(1, true, 5, true));
		  System.out.println("Subset : false : false "+treeSetObject2.subSet(1, false, 5, false));
		  System.out.println("Subset : true : false "+treeSetObject2.subSet(1, true, 5, false));
		  System.out.println("Subset : false : true "+treeSetObject2.subSet(1, false, 5, true));
		  
		  /*SortedSet subSet(Object fromElement, Object toElement):*/
		  System.out.println("Normal Subset : "+treeSetObject2.subSet(1,5));


		  
	}

}
