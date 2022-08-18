package com.solid.learnings;

/**
 * Single Responsibility Principle
 * 
 * One class should have only one and only responsibility.
 * 
 * According to the single responsibility principle, there should be only one
 * reason due to which a class has to be changed.
 * 
 * When the Single Responsibility Principle is followed, testing is easier. With
 * a single responsibility, the class will have fewer test cases. Less
 * functionality also means fewer dependencies to other classes. It leads to
 * better code organization since smaller and well-purposed classes are easier
 * to search.
 * 
 * It’s recommended to use a single method for each class so that multiple
 * capabilities in a single class don’t mash up the code, and any changes made
 * to the code may influence the entire class.
 */
public class SingleResponsibilityPrinciple {

	/**
	 * The below is separated to different class.
	 */
	public class FinalExam {
		public void AddQuestion() {
			// functionality of the method
		}

		public void ExpectedAnswer() {
			// functionality of the method
		}

		public void Marksdistribution() {
			// functionality of the method
		}
	}

	/*
	 * Separated
	 */
	public class FinalExamAddQuestion {
		public void AddQuestion() {
			// functionality of the method
		}
	}

	public class FinalExamExpectedAnswer {
		public void ExpectedAnswer() {
			// functionality of the method
		}
	}

	public class FinalExamMarksdistribution {
		public void Marksdistribution() {
			// functionality of the method
		}
	}
}
