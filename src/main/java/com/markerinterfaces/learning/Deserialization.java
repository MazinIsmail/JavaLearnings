package com.markerinterfaces.learning;

import java.io.*;

/**
 * Deserialization is the process of reconstructing the object from the
 * serialized state.
 */
public class Deserialization {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			/* String filename = "D:\\file1.txt"; */
			Employee employee = new Employee();

			// Reading the object from a file
			fileInputStream = new FileInputStream("src/main/resources/Serialization.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			// Method for deserialization of object
			employee = (Employee) objectInputStream.readObject();

			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			System.out.println("Transient Value: " + employee.getTransientVariable());
			System.out.println("Static Value: " + Employee.getStaticVariable());
			System.out.println("Age: " + employee.getAge());
			System.out.println("Name: " + employee.getName());

		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		} finally {
			objectInputStream.close();
			fileInputStream.close();
		}

	}

}