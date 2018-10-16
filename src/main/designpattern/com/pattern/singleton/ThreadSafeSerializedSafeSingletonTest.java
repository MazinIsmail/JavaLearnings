package com.pattern.singleton;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.serializationdeserialization.learning.DeserializationLearning;

public class ThreadSafeSerializedSafeSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ThreadSafeSerializedSafeSingleton instanceOne = ThreadSafeSerializedSafeSingleton.getInstance();

		// serailize
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("src/main/resources/SerializedSingleton.txt"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		final String filaName = "SerializedSingleton.txt";
		// Loading the file from the current classloaders classpath
		BufferedInputStream bufferedInputStream = (BufferedInputStream) DeserializationLearning.class.getClassLoader()
				.getResourceAsStream(filaName);
		ObjectInput in = new ObjectInputStream(bufferedInputStream);
		ThreadSafeSerializedSafeSingleton instanceTwo = (ThreadSafeSerializedSafeSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}

}
