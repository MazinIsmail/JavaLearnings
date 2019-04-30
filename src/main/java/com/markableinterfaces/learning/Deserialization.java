package com.markableinterfaces.learning;

import java.io.*;

public class Deserialization {
	public static void printdata(Employee employee) {
		System.out.println("name = " + employee.name);
		System.out.println("age = " + employee.age);
		System.out.println("a = " + employee.a);
		System.out.println("b = " + employee.b);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("ab", 20, 2, 1000);
		String filename = "D:\\file1.txt";
		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(employee);
			// value of static variable changed
			//employee.b = 2000;
			employee.age=77;
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
		employee = null;
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			employee = (Employee) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(employee);
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}