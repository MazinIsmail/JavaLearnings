package com.oops.inheritance;

public class NestedClassSample {
	public int id;
	public int type;
	public int name;
	public Image image;
	public Image thumbnail;

	public class Image {
		public int url;
		public int width;
		public int height;
	}

}
