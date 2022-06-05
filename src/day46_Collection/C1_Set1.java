package day46_Collection;

import java.util.HashSet;
import java.util.Set;

public class C1_Set1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		set1.add("A");
		set1.add("c");
		set1.add("b");
		set1.add("A");
		set1.add("c");
		set1.add("b"); // SET HER ELEMANDAN 1 TANE EKLER. KUME MANTIGI. KUME DE BU VAR ZATEN DIYOR.
						// ALFABETIK SIRALAMA YAPIYOR GIBI GORUNSEDE BUNUN GARANTISI YOKTUR.
		
		System.out.println(set1);
		
		System.out.println(set1.hashCode());
		
		//hashcode tum elemanlarin hash code larinin toplamini verir.
		// elemanlari siralamssi kendince bir sirayla yapar.
		
		set1.add("k");
		set1.add("l");
		set1.add("p");
System.out.println(set1);
		
		System.out.println(set1.hashCode());
		
		
	}

}
