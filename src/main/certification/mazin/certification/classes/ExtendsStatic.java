package mazin.certification.classes;

public class ExtendsStatic extends Hobbit {
	public static void main(String[] args) {
		Short myGold = 7;
		//System.out.println(countGold(myGold, 6)); // Static function can call only static functions
	}
}

class Hobbit {
	int countGold(int x, int y) { return x + y; }
}
