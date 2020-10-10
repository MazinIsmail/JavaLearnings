package com.java9.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Java introduced try-with-resource feature in Java 7 that helps to close
 * resource automatically after being used. In other words, we can say that we
 * don't need to close resources (file, connection, network etc) explicitly,
 * try-with-resource close that automatically by using AutoClosable interface.
 * 
 * In Java 7, try-with-resources has a limitation that requires resource to
 * declare locally within its block.
 */
public class TryWithResourceLearnings {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		try (fileStream) {
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
