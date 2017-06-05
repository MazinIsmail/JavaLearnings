package com.serializationdeserialization.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.generic.models.Student;

/* Serialization in java is a mechanism of writing the state of an object into a byte stream.
 * Serializable is a marker interface. */

public class SerializationLearning {

	public static void main(String[] args) {

		Student s1 = new Student(211, "ravi");

		ObjectOutputStream out;
		try {
			FileOutputStream fout = new FileOutputStream("SerializationLearning.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("success");
	}

}
