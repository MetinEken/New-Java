package day29_PassByValue_Referance;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		// java pass by value dur
		// %10, %20, %25 indirim yapan bir program yapin.
		// yapilan alisveris 200 ise %10
		//300chf ise %20
		// 500chf ise %25 indirim yapin
		Scanner scan = new Scanner(System.in);
		double fiyat=25;
		System.out.println("kac adet alacaginizi girin...");
		int adet=scan.nextInt();
		double toplam=adet*fiyat;
		
		yuzdeOn(toplam);
		yuzdeYirmi(toplam);
		yuzdeYirmiBes(toplam);
		
		if (toplam>=100 && toplam<300) {
			System.out.println("normal toplam : " + toplam);
		System.out.println("%10 fiyati : " + yuzdeOn(fiyat));	
		} else if(toplam>=300 && toplam<500){
			System.out.println("normal toplam : " + toplam);
			System.out.println("%20 indirimli : "+yuzdeYirmi(fiyat));
		}else if(toplam>=500) {
			System.out.println("normal toplam : " + toplam);
			System.out.println("%25 fiyati : "+yuzdeYirmiBes(toplam));
		}else {
			System.out.println("indirim uygulanamadi");
			System.out.println("toplam ucret : "+toplam);
		}
		
		scan.close();
		
		

	}

	private static double yuzdeYirmiBes(double toplam) {
		
		 toplam=toplam*0.75;
		 return toplam;
	}

	private static double yuzdeYirmi(double toplam) {
		// TODO Auto-generated method stub
		 toplam=toplam*0.80;
		 return toplam;
	}

	private static double yuzdeOn(double toplam) {
		return toplam=toplam*0.90;
		
	}

}
