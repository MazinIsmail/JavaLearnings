package com.solid.learnings;

public interface StudentInfoAgain {
	public String streamName();
}

class ScienceAgain implements StudentInfoAgain {
	public String streamName() {
		return "Science";
	}
}

class CommerceAgain implements StudentInfoAgain {
	public String streamName() {
		return "Commerce";
	}
}

class ArtsAgain implements StudentInfoAgain {
	public String streamName() {
		return "Arts";
	}
}
