package day44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Uygulama {

	public static void main(String[] args) {
		// bir listede istenen araliktaki elemanlari veren bir program yaziniz.
		// ayni liste uzerinden gostersin
		
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

// istenen aralik 20-40(dahil)

		while (li1.hasNext()) {
			
			int temp = (int) li1.next(); 
			
			if (temp<20 || temp>40) { // temp yerine li1.next yazarsak 2 defa yazmamiz gerekecek. 2 2 gidecek
										// hata verecek. due to; temp yaptik
				li1.remove();
				
			}
			
			
		}
		
		System.out.println(str);

	}

}
