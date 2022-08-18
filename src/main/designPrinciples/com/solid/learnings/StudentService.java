package com.solid.learnings;

public class StudentService {

	public static void main(String[] args) {
		/*
		 * You will have to change existing code in StudentInfo if you want to create
		 * arts.
		 */
		StudentInfo studentInfo = new StudentInfo();
		Stream stream = new Science();
		String streamName = studentInfo.streamName(stream);
		System.out.println(streamName);

		/*
		 * You can create new class for arts and will not have to change existing code.
		 */
		StudentInfoAgain studentInfoAgain = new ArtsAgain();
		streamName = studentInfoAgain.streamName();
		System.out.println(streamName);
	}
}
