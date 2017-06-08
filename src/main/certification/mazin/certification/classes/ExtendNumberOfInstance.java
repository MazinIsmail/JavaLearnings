package mazin.certification.classes;

class ClassA {
	public int numberOfInstances;
	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}

public class ExtendNumberOfInstance extends ClassA {
	private ExtendNumberOfInstance(int numberOfInstances) {
		super(numberOfInstances);
	}
	public static void main(String[] args) {
		ExtendNumberOfInstance ext = new ExtendNumberOfInstance(420);
		System.out.print(ext.numberOfInstances);
	}
}

// Try Debuuging for knowing the flow
