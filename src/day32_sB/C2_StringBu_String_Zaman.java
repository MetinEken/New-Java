package day32_sB;

import java.time.LocalTime;

public class C2_StringBu_String_Zaman {

	public static void main(String[] args) {
		// 100000 kere islem yapip Strinbuilder ve string arasindaki hiza bakalim
		
		
		
		LocalTime saat = LocalTime.now();
		
		StringBuilder stB = new StringBuilder("Mehmet");
		
		String str= ("Mehmet");
		System.out.println(str+" "+stB.length()); // bir fazlasini verdi, normal
		
		System.out.println("stB baslangic : "+saat);
		for (int i = 0; i < 100000; i++) {
			stB.append(".");
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println("stB bitis     : "+saat2); // 0.2 mili saniye surdu. DAHA HIZLII
		System.out.println("   .......");
		
		
		System.out.println("str baslangic : "+saat2);
		for (int i = 0; i < 100000; i++) {
			str+=".";
		}
		LocalTime saat3 = LocalTime.now();
		System.out.println("str bitis     : "+saat3); // 2.5 sn surdu. DAHA YAVAS

	}

}
