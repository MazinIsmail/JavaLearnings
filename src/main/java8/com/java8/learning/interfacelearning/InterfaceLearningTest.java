package com.java8.learning.interfacelearning;

public class InterfaceLearningTest implements InterfaceLearning {

	public static void main(String[] args) {
		InterfaceLearning interfaceLearning = new InterfaceLearning() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		System.out.println(interfaceLearning.calculate(100)) ; // 100.0
		System.out.println(interfaceLearning.sqrt(-23)); // 0.0
		System.out.println(InterfaceLearning.positive(-4)); // 0.0

		// Formula formula2 = (a) -> sqrt( a * 100);
	}

	@Override
	public double calculate(int a) {
		System.out.println("Implemented abstract method");
		return 0;
	}
}
