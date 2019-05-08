package com.strings.learnings;

public class Example2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println("Hash code of String s1: " + s1.hashCode());
		System.out.println("Hash code of String s2: " + s2.hashCode());
		
		System.out.println("s1 == s2 returns ::" + (s1 == s2)); // returns hello
		System.out.println("[s1 and s2 refers to two different memory location]\n");
		
		String s3 = "Test";
		String s4 = "aaaa";
		System.out.println("Hash code of String s3: " + s3.hashCode());
		System.out.println("Hash code of String s4: " + s4.hashCode());
		System.out.println(s3 == s4);

//		because we are assigning s2 String to s1. Don’t get confused with == comparison operator.
		System.out.println("s1.equals(s2) returns ::" +  s1.equals(s2));// return true
		System.out.println("s3 == s4 returns ::" + (s3 == s4)   +"\n s3 is :"+ s3); 
		
	}

}
