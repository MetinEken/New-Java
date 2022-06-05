package day46_Collection;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet {

	public static void main(String[] args) {
		 
Set<String> set1 = new HashSet<>();
		
		set1.add("A");
		set1.add("c");
		set1.add("b");
		set1.add("A");
		set1.add("c");
		set1.add("b"); 
		
		set1.remove("A");
		 System.out.println(set1);
		

	}

}
