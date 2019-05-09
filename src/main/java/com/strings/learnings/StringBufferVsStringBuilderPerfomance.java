package com.strings.learnings;
public class StringBufferVsStringBuilderPerfomance {

	public static void main(String[] args) {
		// This is to iterate for loop N times
		int N = 77777777;
		long t;
		/**
		 * StringBuffer is tested
		 */
		{
			StringBuffer sb = new StringBuffer();
			// current time is assigned to t
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println("Time taken by StringBuffer is : " + (System.currentTimeMillis() - t));
		}
		/**
		 * StringBuilder is tested
		 */
		{
			StringBuilder sb = new StringBuilder();
			// current time is assigned to t before loop
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			System.out.println("Time taken by StringBuilder is :" + (System.currentTimeMillis() - t));
		}
	}

}
