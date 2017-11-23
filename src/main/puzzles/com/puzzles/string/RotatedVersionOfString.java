package com.puzzles.string;

/*If ¡§JavaJ2eeStrutsHibernate¡¨ is a string then below are some rotated versions of this string.
¡§StrutsHibernateJavaJ2ee¡¨, ¡§J2eeStrutsHibernateJava¡¨, ¡§HibernateJavaJ2eeStruts¡¨.*/
public class RotatedVersionOfString {
	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		} else {
			String s3 = s1 + s1;
			if (s3.contains(s2)) {
				System.out.println("s2 is a rotated version of s1");
			} else {
				System.out.println("s2 is not rotated version of s1");
			}
		}
	}
}
