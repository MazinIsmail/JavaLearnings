package mazin.certification.classes;

class ClassAA {}
class ClassB extends ClassAA {}
class ClassC extends ClassAA {}

class ExtendClassABC {
	public static void main(String [] args) {
		ClassAA p0 = new ClassAA();
		ClassB p1 = new ClassB();
		ClassC p2 = new ClassC();
		
		ClassAA p3 = new ClassB();
		ClassAA p4 = new ClassC();
		
		/*ClassB p5 = new ClassAA();
		ClassC p6 = new ClassAA();*/
		
		p0 = p1;
		
		/*p1 = p2;
		p2 = p4; 
		p2 = (ClassC)p1;*/
		
		p1 = (ClassB)p3;
		p2 = (ClassC)p4;
		
	}
}
