package day48_Maps;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class C4_Uygulama {

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
				
				Map<Integer, String> sonuc= javaBilenler(map1, bolum);
				System.out.println("Java bilenlerin isim listesi asagidadir.");
				System.out.println(sonuc);
				
				
			}

	private static Map<Integer, String> javaBilenler(Map<Integer, String> map1, String bolum) {
		
		Map<Integer, String> temp = new HashMap<>();
		Set<Entry<Integer, String>> mapdenSet =	map1.entrySet();
		
	for (Entry<Integer, String> each : mapdenSet ) {
		
		if (each.getValue()==bolum) {
			
		}
	
		
		
	}
	return temp;

			
			}
}
		
