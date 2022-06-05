package day46_Collection;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C4_linkedHashSet {

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
		
		System.out.println("LinkedHashSet");
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <100000; i++) {
			set1.add(""+i);
			
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("=============");
		System.out.println("HashSet");
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i <100000; i++) {
			set2.add(""+i);
			
		}
		System.out.println(System.currentTimeMillis());
		
		//HashSet daha hizli
	}

}
