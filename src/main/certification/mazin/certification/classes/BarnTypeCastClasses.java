package mazin.certification.classes;

class Building { }

public class BarnTypeCastClasses extends Building {
	public static void main(String[] args) {
		Building build1 = new Building();;
		BarnTypeCastClasses barn1 = new BarnTypeCastClasses();
		
		BarnTypeCastClasses barn2 = (BarnTypeCastClasses) build1;
		Building build2 = (Building) barn1;
		
		Object obj1 = (Object) build1;
		// String str1 = (String) build1; Cannot cast this.
		
		BarnTypeCastClasses build3 = (BarnTypeCastClasses) barn1;
		BarnTypeCastClasses build4 = (BarnTypeCastClasses) build2;
		// You can type cast superclass to subclass and subclass to superclass. 
		// And yes Object is a superclass of every class.
	}
}
