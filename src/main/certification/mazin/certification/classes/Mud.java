package mazin.certification.classes;

public class Mud {

	public static void main1(String...a) {
		System.out.println("hi");
	}
	/*public static void main1(String.* a) { // What the heck does this mean?
		System.out.println("hi");
	}*/
	public static void main2(String... a) {
		System.out.println("hi");
	}
	public static void main3(String[]... a) { // Correct. Variable arguments brackets first
		System.out.println("hi");
	}
	/*public static void main(String...[] a) { // Wrong
		System.out.println("hi");
	}*/

}
