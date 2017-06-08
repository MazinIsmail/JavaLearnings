package mazin.certification.classes;

public class PrintfFormate {
	public static void main(String[] args) {
		double d = 12.345;
		System.out.printf("|%2.3f|\n",d); //Delusional
		System.out.printf("|%2.2f|\n",d);
		System.out.printf("|%2.1f|\n",d);
		System.out.printf("|%2.8f|\n",d);
		
		System.out.printf("\n");
		System.out.printf("|%6.3f|\n",d);
		System.out.printf("|%7.3f|\n",d);
		System.out.printf("|%8.3f|\n",d);

		System.out.printf("\n");
		System.out.printf("|%3.7f| \n", d);
		System.out.printf("|%7f| \n", d);
		System.out.printf("|%7.1f| \n", d);
		
		//First Value is for the total length(Can be irrelevant), decimal value for decimal length
	}
}