package mazin.certification.classes;

import mazin.certification.support.SuperCalc;

public class ExtendSuperCalc extends SuperCalc{
	public static int multiply(int a, int b) {
		// int c = super.multiply(a, b);
		int c = SuperCalc.multiply(a, b);
		return c;
	}
	public static void main(String [] args) {
		ExtendSuperCalc extendSuperCalc = new ExtendSuperCalc();
		int s =extendSuperCalc.multiply(3, 7);
		System.out.println(s);
	}
}

