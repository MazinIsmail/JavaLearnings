package com.stringlearnings.com;

public class StringTemplatesLearnings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Compose Strings in Java
		plusOperator();
		usingStringBufferStringBuilder();
		usingStringFormat();

		//

	}

	/**
	 * The create a template expression, we need two things:
	 * 
	 * A template processor. A template containing wrapped expressions like \{name}
	 */
	private static void templateExpressions() {
		var name = "Ben";
		var tempC = 28;

		// String Template is a preview feature and disabled by default. Use
		// --enable-preview to enable
		// var greeting = STR."Hello \{this.user.firstname()}, how are you?\nIt's
		// \{tempC}°C today!";
	}

	// A new String gets allocated each time we use the + operator.
	private static void plusOperator() {
		var name = "Ben";
		var tempC = 28;
		var greeting = "Hello " + name + ", how are you?\nIt's " + tempC + "°C today!";
		System.out.println(greeting);
	}

	// Their major downside is their verbosity
	//
	private static void usingStringBufferStringBuilder() {
		var name = "Ben";
		var tempC = 28;
		var greeting = new StringBuilder().append("Hello ").append(name).append(", how are you?\nIt's").append(tempC)
				.append("°C today!").toString();
		System.out.println(greeting);
	}

	// JVM has to parse/validate the template String.
	private static void usingStringFormat() {
		var name = "Ben";
		var tempC = 28;
		var format = "Hello %s, how are you?\nIt's %d°C today!";
		var greeting = String.format(format, name, tempC);
		System.out.println(greeting);
	}

}
