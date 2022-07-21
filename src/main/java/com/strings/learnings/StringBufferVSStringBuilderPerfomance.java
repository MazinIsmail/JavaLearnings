package com.strings.learnings;

public class StringBufferVSStringBuilderPerfomance {

	public static void main(String[] args) {
		// This is to iterate for loop N times
		int N = 77777777;
		/**
		 * StringBuffer is tested
		 */
		{
			StringBuffer sb = new StringBuffer();
			// current time is assigned to t
			long beforeTime = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			long afterTime = System.currentTimeMillis();
			System.out.println("Time taken by StringBuffer is: " + (afterTime - beforeTime));
		}
		/**
		 * StringBuilder is tested
		 */
		{
			StringBuilder sb = new StringBuilder();
			// current time is assigned to t before loop
			long beforeTime = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			long afterTime = System.currentTimeMillis();
			System.out.println("Time taken by StringBuilder is: " + (afterTime - beforeTime));
		}
	}

}
