package day30_Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class C1 {

	public static void main(String[] args) {
		// localAdte class dan obje olustururuz.
		//
		
		LocalDate tarih= LocalDate.now();
		System.out.println(tarih);
		
		System.out.println(tarih.plusDays(500)); // 500 gun sonra, hafta yil da hesaplanir
		
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i < 100000000; i++) {
			i+=i;
		}
	
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);
		
	
	
	}

	

}
