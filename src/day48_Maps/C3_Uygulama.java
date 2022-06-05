package day48_Maps;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class C3_Uygulama {

	public static void main(String[] args) {
Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101,  "Ali, Veli, java");
		map1.put(102, "Veli, Can, java");
		map1.put(103, "Ali, Yan, C#");
		map1.put(104,  "Mehmet, Veli, java");
		map1.put(105, "Ahmet, Can, java");
		map1.put(106, "Metin, Yan, C#");
		map1.put(107, "Metin, java, C#");
		System.out.println(map1);
		
		String bolum ="java";
		
		List<String> sonuc= javaBilenler(map1, bolum);
		System.out.println("Java bilenlerin isim listesi asagidadir.");
		System.out.println(sonuc);
		
		
	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String bolum) {
	
		List<String> kisiIsmi= new ArrayList<>();
		
		for (String each : map1.values()) {
			String arr[]=each.split(", ");
			
			for (String x : arr) {
			if (x.equalsIgnoreCase(bolum)) {
				kisiIsmi.add(arr[0]);
				
				//  burada sadece bolumu java olanlar degil, java kelimesi gecenlerin hepsinin
				// ismi alindi.
			}
			}
			
		}
		
		
		return kisiIsmi;
	}

}
