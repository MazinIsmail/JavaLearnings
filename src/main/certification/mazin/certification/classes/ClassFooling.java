package mazin.certification.classes;

public class ClassFooling {
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			//f = 0; Cannot access f here. Fooling!!! Tricks
		} finally {
			//System.out.println(f); Cannot access f here. Fooling!!! Tricks
		}
	}
	
	public static void main(String[] args) {
		parse("invalid");
	}
}