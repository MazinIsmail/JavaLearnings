package mazin.certification.classes;

public class Regex {

	public static void main(String[] args) {
		String test = "Test A. Test B. Test C.";
		String regex = "\\.\\s";
		String[] result = test.split(regex);
		System.out.println(result[0]);
	}

}
