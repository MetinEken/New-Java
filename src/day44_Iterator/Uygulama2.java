package day44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Uygulama2 {

	public static void main(String[] args) {
		// listenin elemanlarini tersten yaziralim.
		// ilk olarak bos bir method ile cursore u sona almamiz gerekiyor
		// sonda olan kursoru geri geri calistiracagiz = .haspreevious ile
		// geleni yazdirdik, liste degismedi
		// yeni bir liste olusturabilirdik
		
		List<Integer> str = new ArrayList<>();
		str.add(1);
		str.add(23);
		str.add(33);
		str.add(13);
		str.add(66);
		str.add(2);
		str.add(73);
		str.add(43);
		str.add(53);
		str.add(86);
		str.add(24);
		str.add(34);
		str.add(25);
		str.add(36);
		System.out.println(str);
@SuppressWarnings("rawtypes")
ListIterator li1 = str.listIterator();


		while (li1.hasNext()) {
			li1.next(); // hepsini getirdik ama islem yapmadik
			// kursor sona gelmis oldu
		}
		
		while (li1.hasPrevious()) {
			System.out.print(li1.previous()+", "); // ONEMLI : hasPrevious degil, sadece li1.previous yazilmalidir
		}
		
		System.out.println("");
		System.out.println(str);
		
	}

}
