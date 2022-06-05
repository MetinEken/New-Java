package day13;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// @gmail.com kontrolu, var mi yok mu
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir email girin");
		
		String gml = scan.next();
		
		System.out.println(gml.contains("@gmail.com") ? "kaydedildi " : "gecerli bir gmail girin");
		
//@gmail.com ile mi bitiyor ,,,,, indexOf ile cozumu
		
		int sondami = gml.indexOf("@gmail.com", gml.length()-10); // bunun sonucunda; dogruysa -1 den buyuk bir sayi 
		//atayacak. eger dogru degilse, yoksaa -1 diyecek
		// ikinci olarak girileen gmail @gmsil.com en sona yazilmis ise if else ile cevap vercez
		if(sondami>=0) {
			System.out.println("girilen bir gmail dir");
		}else {
			System.out.println("girdiginiz bir gmail degildir");
		}
		scan.close();
		

	}

}
