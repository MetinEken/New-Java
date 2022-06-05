package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class C1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101,  "Ali, Veli, java");
		map1.put(102, "Veli, Can, java");
		map1.put(103, "Ali, Yan, C#");
		System.out.println(map1);	//{101=Ali, Veli, java, 102=Veli, Can, java, 103=Ali, Yan, C#}
		
		// integer degerleri(KEY); id gorevi goruyor. tekrari kabul edilmez.
		// AYNI KEY TEKRAREKLENMEK ISTENIRSE UPDATE EDILIR, ESKI VALUE DEGISTIRILIR.
		
		HashMap<Integer, String> map2 = new HashMap<>();
		
		map2.put(101,  "Ali, Veli, java");
		map2.put(102, "Veli, Can, java");
		map2.put(105,  "Ali, Veli, SQL");
		map2.put(104, "Veli, Can, SQL");
		map1.putAll(map2);
		System.out.println(map1);
		
		map1.putIfAbsent(102, "Ali, Veli, SQL"); // 102 varsa ekleme
		System.out.println(map1); // 102 tektrar eklenmedi
		
		System.out.println(map1.containsKey(101)); // true
		System.out.println(map1.containsValue("Ali")); // false value nun tamamini ister
		System.out.println(map1.containsValue("Ali, Veli, java")); // true

	}

}
