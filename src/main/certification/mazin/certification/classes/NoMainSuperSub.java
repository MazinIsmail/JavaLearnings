package mazin.certification.classes;

class Super {
	private int a;
	protected Super(int a) { this.a = a; }
	
}

class Sub extends Super {
	public Sub(int a) { super(a); }
	// public Sub() { this.a = 5; } // No implicit super constructor Super()
	
	//Correct
	//public Sub() { this(5); }
	//public Sub() { super(5); }
	
}
