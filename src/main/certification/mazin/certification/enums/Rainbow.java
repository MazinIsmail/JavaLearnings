package mazin.certification.enums;

public class Rainbow {
	public enum MyColor {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		MyColor(int rgb) { this.rgb = rgb; }
		public int getRGB() { return rgb; }
	};

	public static void main(String[] args) {
		// To access GREEN we have to use enum name like MyColor.GREEN
		MyColor treeColor = MyColor.GREEN;
		
		/*
		MyColor skyColor = BLUE; // What the heck is this? Simply BLUE!!!
		if(RED.getRGB() < BLUE.getRGB()) { }
		MyColor purple = new MyColor(0xff00ff);
		MyColor purple = MyColor.BLUE + MyColor.RED; // Cannot use + operator here
		*/
		
	}
}
