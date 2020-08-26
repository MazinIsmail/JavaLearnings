package com.atomic.learnings;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArrayLearnings {
	public static void main(String[] args) {
		AtomicReferenceArray array = new AtomicReferenceArray(10);
		Object[] source = new Object[10];
		source[5] = "Some string";
		array = new AtomicReferenceArray(source);
		Object element = array.get(5);

		String[] sourceString = new String[10];
		sourceString[5] = "Some string";

		AtomicReferenceArray<String> atomicReferenceArrayString = new AtomicReferenceArray<String>(sourceString);
		String elementString = atomicReferenceArrayString.get(5);

		atomicReferenceArrayString.set(5, "another object");

		String string1 = "string1";
		String string2 = "string2";
		sourceString = new String[10];
		sourceString[5] = string1;
		atomicReferenceArrayString = new AtomicReferenceArray<String>(sourceString);
		atomicReferenceArrayString.compareAndSet(5, string1, string2);
	}
}
