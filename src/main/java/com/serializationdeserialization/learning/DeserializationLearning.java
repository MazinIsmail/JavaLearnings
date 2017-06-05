package com.serializationdeserialization.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.generic.models.Student;

/* Deserialization is the process of reconstructing the object from the serialized state. */

public class DeserializationLearning {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("SerializationLearning.txt"));
			Student s = (Student) in.readObject();
			System.out.println(s.getId() + " " + s.getName());
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
