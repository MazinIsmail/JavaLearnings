package com.markableinterfaces.learning;

import java.io.*;

/**
 * Serialization is a mechanism of converting the state of an object into a byte
 * stream. Deserialization is the reverse process; where the byte stream is used
 * to recreate the actual Java object in memory. The byte stream created is
 * platform independent
 * If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
 * Only non-static data members are saved via Serialization process.
 * Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
 * Constructor of object is never called when an object is deserialized.
 * Associated objects must be implementing Serializable interface.
  */

class Serialization {
	public static void main(String[] args) throws IOException {

		Employee employee = new Employee(10, 1000, "Hello", 20);
		/* String filename = "D:\\file1.txt"; */
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		// Serialization
		try {
			// Saving of object in a file
			fileOutputStream = new FileOutputStream("src/main/resources/Serialization.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// Method for serialization of object
			objectOutputStream.writeObject(employee);

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			System.out.println("getTransientVariable : " + employee.getTransientVariable());
			System.out.println("getStaticVariable : " + Employee.getStaticVariable());
			System.out.println("Age : " + employee.getAge());
			System.out.println("Name : " + employee.getName());
			Employee.setStaticVariable(2000);
			
			// value of static variable changed
			// employee.setStaticVariable(2000);

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} finally {
			objectOutputStream.close();
			fileOutputStream.close();
		}

	}
}
