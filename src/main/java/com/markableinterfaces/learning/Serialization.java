package com.markableinterfaces.learning;

import java.io.*;

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
