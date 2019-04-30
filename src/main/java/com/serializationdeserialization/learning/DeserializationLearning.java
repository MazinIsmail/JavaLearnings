package com.serializationdeserialization.learning;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/* Deserialization is the process of reconstructing the object from the serialized state. */

public class DeserializationLearning {
	public static void main(String[] args) {
		try {
			final String filaName = "SerializationLearning.txt";
			// Loading the file from the current classloaders classpath
			BufferedInputStream bufferedInputStream = (BufferedInputStream) DeserializationLearning.class
					.getClassLoader().getResourceAsStream(filaName);
			ObjectInputStream in = new ObjectInputStream(bufferedInputStream);
			Student s = (Student) in.readObject();
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
