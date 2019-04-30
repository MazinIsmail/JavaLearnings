package com.markableinterfaces.learning;

/**
 * Serialization is a mechanism of converting the state of an object into a byte stream.
 *  Deserialization is the reverse process;
 *  where the byte stream is used to recreate the actual Java object in memory.
 *  The byte stream created is platform independent
 *  
 *  TODO: Realtime  example???
 */

import java.io.*;

class Serialization {
	public static void main(String[] args) {
		
		Student student = new Student(1, "Demo");
		String filename = "D:\\file.txt";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method to write the data into file
			out.writeObject(student);

			out.close();
			file.close();

			System.out.println("Object has been serialized");
			System.out.println("a = " + student.a);
			System.out.println("b = " + student.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		Student object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Student) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}
		
		// TODO:  array of objects, 

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
