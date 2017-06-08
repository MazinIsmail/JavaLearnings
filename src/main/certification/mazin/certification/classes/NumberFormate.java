package mazin.certification.classes;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormate {
	public static void main(String[] args) {
		double input = 314159.26;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
		String b;
		b = nf.format(input);
		
		
		NumberFormat nf1 = NumberFormat.getInstance();
		nf1.setMaximumFractionDigits(4);
		nf1.setMinimumFractionDigits(2);
		String a = nf1.format(3.14155026);
		String a1 = nf1.format(2);
		
		System.out.println(a+" "+a1);
		
	}
}
