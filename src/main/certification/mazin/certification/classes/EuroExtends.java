package mazin.certification.classes;

class Money {
	private String country = "Canada";
	public String getC() { return country; }
}
class Yen extends Money {
	public String getC() {
		return null;
		//return super.country; //We use super keywords to call super class constructor or method, not for variable.
	}
}
public class EuroExtends extends Money {
	public String getC(int x) { return super.getC(); }
	public static void main(String[] args) {
		System.out.print(new Yen().getC() + " " + new EuroExtends().getC());
	}
}
