package com.solid.learnings;

public class Rectangle {
	private double height;
	private double width;

	public void setHeight(double h) {
		height = h;
	}

	public void setWidth(double w) {
		width = w;
	}

}

class Square extends Rectangle {
	public void setHeight(double h) {
		super.setHeight(h);
		super.setWidth(h);
	}

	public void setWidth(double w) {
		super.setHeight(w);
		super.setWidth(w);
	}
}
