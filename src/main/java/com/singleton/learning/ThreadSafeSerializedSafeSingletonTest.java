package com.singleton.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ThreadSafeSerializedSafeSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ThreadSafeSerializedSafeSingleton instanceOne = ThreadSafeSerializedSafeSingleton.getInstance();
		
		// serailize
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("res/SerializedSingleton.txt"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("res/SerializedSingleton.txt"));
		ThreadSafeSerializedSafeSingleton instanceTwo = (ThreadSafeSerializedSafeSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}

}
