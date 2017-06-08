package mazin.certification.stringing;

import java.text.MessageFormat;


public class VariableArgument {

	/**
	 * @param args
	 */
	public static String[] parameters; 
	public static void main(String[] args) {
		String[] parameters = {"mazin","test","one"};
		arguments(parameters);
	}
	
	@SuppressWarnings("unused")
	private static void arguments(String... params) {
		parameters = params;
		String messDesc = "This is {0} {1} {2}";
		int length = parameters.length;
		String messDescParams = MessageFormat.format(messDesc, parameters);
		System.out.println(messDescParams);
	}

}
