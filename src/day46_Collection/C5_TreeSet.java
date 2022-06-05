package day46_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C5_TreeSet {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("A");
		set1.add("c");
		set1.add("b");
		set1.add("A");
		set1.add("c");
		set1.add("b"); 
		
Set<String> set2 = new HashSet<>();
		
		set2.add("A");
		set2.add("c");
		set2.add("b");
		set2.add("A");
		set2.add("c");
		set2.add("b"); 
		
TreeSet<String> set3 = new TreeSet<>();
		
		set3.add("A");
		set3.add("c");
		set3.add("b");
		set3.add("A");
		set3.add("c");
		set3.add("b"); 
		
		System.out.println("LinkedHashSet");
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <10000; i++) {
			set1.add(""+i);
			
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("=============");
		System.out.println("HashSet");
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <10000; i++) {
			set2.add(""+i);
			
		}
		System.out.println(System.currentTimeMillis());
		
		System.out.println("=============");
		System.out.println("TreeSet");
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <10000; i++) {
			set3.add(""+i);
			
		}
		System.out.println(System.currentTimeMillis());
		
		

	}

}
