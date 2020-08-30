package com.serializationdeserialization.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Serialization in java is a mechanism of writing the state of an object into a
 * byte stream. Serializable is a marker interface. It is mainly used in
 * Hibernate, RMI, JPA, EJB and JMS technologies. Used to travel object's state
 * on the network (known as marshaling).
 * 
 * Serialization is a mechanism of converting the state of an object into a byte
 * stream. Deserialization is the reverse process; where the byte stream is used
 * to recreate the actual Java object in memory. The byte stream created is
 * platform independent.
 * 
 * If a parent class has implemented Serializable interface then child class
 * doesn’t need to implement it but vice-versa is not true. Only non-static data
 * members are saved via Serialization process. Static data members and
 * transient data members are not saved via Serialization process. So, if you
 * don’t want to save value of a non-static data member then make it transient.
 * Constructor of object is never called when an object is deserialized.
 * 
 * Associated objects must be implementing Serializable interface.
 */

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
