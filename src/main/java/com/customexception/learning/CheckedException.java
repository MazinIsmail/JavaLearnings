package com.customexception.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Checked Exception: -
 * 
 * The classes that directly inherit the Throwable class except RuntimeException
 * and Error are known as checked exceptions.
 * 
 * For example, IOException, SQLException, etc. Checked exceptions are checked
 * at compile-time.
 */
public class CheckedException {

	public static void excepMethod() throws IOException {
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++) {
			System.out.println("Inside for loop");
			System.out.println(fileInput.readLine());
			fileInput.close();
		}
	}

	public static void main(String[] args) {
		try {
			excepMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
