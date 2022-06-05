package day28_FoorEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C5 {

	public static void main(String[] args) {
		// hepsinin karesinin toplamini bulunuz
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(62);
		list.add(75);
		list.add(8);
		list.add(90);
		System.out.println(list);
		int toplam=0;
		for (Integer x : list) {
			
			toplam+=x*x;
		}
		
		System.out.println("karelerinin tolami ...: "+toplam);
	}

}
