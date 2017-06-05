package com.java8.learning.interfacelearning;

public class InterfaceLearningTest {
	
	public static void main(String[] args) {
		InterfaceLearning interfaceLearning = new InterfaceLearning() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		interfaceLearning.calculate(100); // 100.0
		interfaceLearning.sqrt(-23); // 0.0
		InterfaceLearning.positive(-4); // 0.0

		// Formula formula2 = (a) -> sqrt( a * 100);
	}
}
