package mazin.certification.classes;

import mazin.certification.support.SimpleCalc;

public class MultiCalc extends SimpleCalc {
	public void calculator() {
		value -= 3;
	}
	public void calculator(int multiplier) {
		calculator();
		super.calculator();
		value *= multiplier;
	}
	public static void main(String[] args) {
		MultiCalc calculator = new MultiCalc();
		calculator.calculator(2);
		System.out.println("Value is: "+calculator.value);
	}
}
