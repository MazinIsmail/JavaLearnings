package com.java8.learning.nashorn;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import jdk.internal.loader.Resource;

/**
 * Nashorn, a much improved javascript engine is introduced, to replace the
 * existing Rhino. Nashorn provides 2 to 10 times better performance, as it
 * directly compiles the code in memory and passes the bytecode to JVM.
 */
public class NashornLearning {

	public static void main(String[] args) throws Exception {
		// Using ScriptEngineManager, JavaScript code can be called and interpreted in
		// Java.
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		String file = "src/test/resources/fileTest.txt";
		engine.eval(new FileReader("res/nashorn1.js"));

		Invocable invocable = (Invocable) engine;
		Object result = invocable.invokeFunction("fun1", "Peter Parker");
		System.out.println(result);
		System.out.println(result.getClass());

		invocable.invokeFunction("fun2", new Date());
		invocable.invokeFunction("fun2", LocalDateTime.now());
		invocable.invokeFunction("fun2", new Person());
	}

}
