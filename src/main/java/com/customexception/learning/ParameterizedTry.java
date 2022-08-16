package com.customexception.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Introduced in Java 7.
 * 
 * Java code illustrating try-with-resource
 * 
 * The try -with-resources statement ensures that each resource is closed at the
 * end of the statement.
 */
public class ParameterizedTry {
	public static void main(String args[]) throws IOException {

		try {
			File file = new File("C:\\Users\\MA20011300\\Desktop\\hello.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			// Original try-with-resources statement from JDK 7 or 8
			try (BufferedReader reader = br) {
				String st = reader.readLine();
				System.out.println(st);
			}
			// Same as above
			BufferedReader reader = null;
			try {
				reader = br;
				String st = reader.readLine();
				System.out.println(st);
			} finally {
				reader.close();
			}
		} catch (Exception e) {
			System.out.println("File related issues.");
		}

	}

}
