package com.serializationdeserialization.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* Serialization in java is a mechanism of writing the state of an object into a byte stream.
 * Serializable is a marker interface.
 * It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
 * Used to travel object's state on the network (known as marshaling).*/

public class SerializationLearning {

	public static void main(String[] args) {
		Student s1 = new Student(211, "ravi", 22);
		ObjectOutputStream out;
		try {
			FileOutputStream fout = new FileOutputStream("src/main/resources/SerializationLearning.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
