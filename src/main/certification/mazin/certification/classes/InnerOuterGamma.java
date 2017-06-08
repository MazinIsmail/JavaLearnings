package mazin.certification.classes;

class Inner {
	private int x;
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
}
class Outer {
	private Inner y;
	public void setY(Inner y){
		this.y = y;
	}
	public Inner getY(){
		return y;
	}
}

public class InnerOuterGamma {
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = new Inner();
		int n = 10;
		i.setX(n);
		o.setY(i);
		
		//o.getY().setX(100);
		//i.setX(100); Any change in this "i" will also effect the change in i present inside o.
		
		
		System.out.println(o.getY().getX());
		
		String test = "Test";
		int ch = 4;
		if(ch == test.length()){
			System.out.println("Win");
		}
	}
}
