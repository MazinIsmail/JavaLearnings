package mazin.certification.classes;

import java.util.HashSet;

public class SizeHashSet {
	private String s;
	public SizeHashSet(String s) { this.s = s; }
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		SizeHashSet ws1 = new SizeHashSet("aardvark");
		SizeHashSet ws2 = new SizeHashSet("aardvark");
		String s1 = new String("aardvark");
		String s2 = new String("aardvark");
		hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
		System.out.println(hs.size());
		
		String s3 = new String("aardvark");
		hs.add(s3);
		System.out.println(hs.size());
		SizeHashSet ws3 = new SizeHashSet("aardvark");
		hs.add(ws3);
		System.out.println(hs.size());
	} 
}
