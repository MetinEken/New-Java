package day49_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps01 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		
		Map<Integer,String> map1= new HashMap<>();
		map1.put(101,  "Ali, Veli, java");
		map1.put(102, "Veli, Can, java");
		map1.put(103, "Ali, Yan, C#");
		map1.put(104,  "Mehmet, Veli, java");
		map1.put(105, "Ahmet, Can, java");
		map1.put(106, "Metin, Yan, C#");
		map1.put(107, "Metin, java, C#");
		map1.putIfAbsent(102, "Ali, Yas, SQL"); // bunu eklemedi, zaten var dedi
		System.out.println(map1);
		System.out.println(map1.size()); // 7 eleman var dedi
		
		System.out.println(map1.entrySet()); // set e cevirdi
		
		System.out.println(map1.entrySet().size()); // 7

		Set<Entry<Integer, String>> mapdenSet =	map1.entrySet();
		System.out.println("==========");
		System.out.println(mapdenSet);
		String isim="java";
	System.out.println(	mapdenSet.contains(isim));
		
	}

}
