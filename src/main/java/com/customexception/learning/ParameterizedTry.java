package com.customexception.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Java code illustrating try-with-resource 

public class ParameterizedTry {
	public static void main(String args[]) throws IOException {

		File file = new File("C:\\Users\\SU332095\\Desktop\\hello.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		// Original try-with-resources statement from JDK 7 or 8
		try (BufferedReader reader = br) {
			String st = reader.readLine();
			System.out.println(st);
		}
	}

}
