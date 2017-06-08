package mazin.certification.classes;

import java.util.TreeSet;

public class TreeSetExplorer {
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for(int i = 606; i < 613; i++) 
			if(i%2 == 0) 
				s.add(i);
		subs = (TreeSet)s.subSet(608, true, 612, false);
		s.add(609);
		System.out.println(s + " " + subs);
		
		
		call();
	}

	private static void call() {
		System.out.println("Start Call");
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for(int i = 606; i < 613; i++)
			if(i%2 == 0) 
				s.add(i);
		subs = (TreeSet)s.subSet(608, true, 611, true);
		s.add(629);
		System.out.println(s + " " + subs);
	}
}
