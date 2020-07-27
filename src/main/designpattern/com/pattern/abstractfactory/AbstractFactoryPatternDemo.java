package com.pattern.abstractfactory;

/**
 * Creational pattern and almost similar to Factory Pattern except the fact that
 * it’s more like factory of factories. Abstract Factory pattern is robust and
 * avoid conditional logic of Factory pattern.
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config :: " + pc);
		System.out.println("AbstractFactory Server Config :: " + server);
	}
}
