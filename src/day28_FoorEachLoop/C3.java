package day28_FoorEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C3 {

	public static void main(String[] args) {
		// Arraydeki elemanlari list e ekleyelim for each ile
		
		String arr[]= {"Ali", "ayse", "fatma"};
		
		List<String> list = new ArrayList<>();
		
		list=(listeyeCevir(arr));
		//List<String> list =listeyeCevir(arr);   bu sekilde de olusturabiliriz.
		
		System.out.println(list);
		
	}

	private static List<String> listeyeCevir(String[] arr) { // parametresi String bir list
		
		List<String> geciciList = new ArrayList<>();
		for (String x : arr) {
			geciciList.add(x);
			
		}
		return geciciList;
		
		
	}

}
