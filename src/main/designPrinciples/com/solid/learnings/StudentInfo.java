package com.solid.learnings;

public class StudentInfo {
	public String streamName(Stream st) {
		if (st instanceof Science) {
			return "Science";
		}
		if (st instanceof Commerce) {
			return "Commerce";
		}
		// You will have to add if statements to add streams here.
		return null;
	}
}

class Stream {
}

class Science extends Stream {
}

class Commerce extends Stream {
}
