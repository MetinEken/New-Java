package day44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> str = new ArrayList<>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		
		@SuppressWarnings("rawtypes")
		ListIterator li1 = str.listIterator();
		
		while (li1.hasNext()) {
			
			//li1.next(); // ASAGIDA YAZILDIGI ICIN KALDIRDIK
			String temp=(String) li1.next();
			li1.set(temp+"B");
		}

		System.out.println("list sonrasi : "+str);
	}

}
