package study.cls.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new HashSet<Integer>();

		System.out.println(set1.size());
		System.out.println(set1.isEmpty());

		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("E");
		
		System.out.println(set1.size());
		
		Iterator<String> i1 = set1.iterator();
		
		while(i1.hasNext()) {
			String n = i1.next();
			System.out.println(n);
			
		}
	}
}
