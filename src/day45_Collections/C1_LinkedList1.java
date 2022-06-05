package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList1 {

	public static void main(String[] args) {
		// linked bagli demektir
		// elemanlar tren gibi birbirine baglidir

			List<String> liste = new LinkedList<>();
			
			liste.add("A");
			liste.add("c");
			liste.add("b");
			liste.add("A");
			liste.add("c");
			liste.add("b");
			
			System.out.println(liste);
			liste.remove("A");  // ilk objeyi kaldiriyor
			
			System.out.println(liste);
			
			
	}

}
