package mazin.certification.classes;

import java.io.*;
public class Forest implements Serializable {
	private Tree tree = new Tree();
	public static void main(String [] args) {
		Forest f = new Forest();
		try {
			FileOutputStream fs = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(fs); 
			os.close();
		} catch (Exception ex) { ex.printStackTrace(); }
	} }
	
class Tree { }
