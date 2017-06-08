package mazin.certification.classes;

class Foo {
	public int a = 3;
	public void addFive() { a += 5; System.out.print("f "); }
}

class ExtendBar extends Foo {
	public int a = 8;
	public void addFive() { this.a += 5; System.out.print("b " ); }
	public static void main(String[] args) {
		Foo f = new ExtendBar();
		f.addFive();
		System.out.println(f.a);
		Foo f2 = new Foo();
		f2.addFive();
		System.out.println(f.a);
		
		ExtendBar b1 = new ExtendBar();
		b1.addFive();
		System.out.println(b1.a);
		ExtendBar b2 = (ExtendBar) new Foo(); // This is WRONG
		b2.addFive();
		System.out.println(b2.a);
	}
}
