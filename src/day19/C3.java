package day19;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		// gecerli bir sifre isteyin
		//sartlar
		//kucuk hafr
		//buyuk harf
		//ozel karakter
		//enaz 8 karakter olmali
		// gecerli sifre girilirse "basarili" degilse "gecersiz" deyin
		// sifredeki hatalari yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gecerli bir sifre griniz...");
		String sfr="";

		
		
		int sonuc=0;
		
		do {
			
			sfr=scan.next();
			
			 sonuc= buyukHarfVarMi(sfr) + kucukHarVArmi(sfr) + ozelKrktVm(sfr)+rakamVm(sfr)+uzunluk(sfr);
			
			 if (buyukHarfVarMi(sfr)==0) {
				System.out.println("lutfen buyukharf de giriniz");
			} 
			 if (kucukHarVArmi(sfr)==0) {
					System.out.println("kucuk harf de giriniz");
				} 
			 if(ozelKrktVm(sfr)==0) {
				 System.out.println("lutfen ozel karakterde giriniz");
			 }
			 if(rakamVm(sfr)==0) {
				 System.out.println("lutfen rakam da giriniz");
			 }
			 if(uzunluk(sfr)==0) {
				 System.out.println("sifreniz en az 8 karakter olmalidir");
			 }
			 System.out.println("TEKRAR SIFRE GIRINIZ...");
		} while (sonuc!=5);
		System.out.println("sifreniz basariyla kaydedildi...");
scan.close();
	}

	private static int uzunluk(String sfr) {
		int sonucuzunluk=0;
		if(sfr.length()>=8) {
			sonucuzunluk=1;
		}
		return sonucuzunluk;
	}

	private static int rakamVm(String sfr) {
		int flagrakam=0;
		int index=0;
		while (index<sfr.length()) {
			
			if (sfr.charAt(index)>='0' && sfr.charAt(index)<='9') {
				flagrakam=1;
			} 
			index++;
		}

		return flagrakam;
	}

	public static int ozelKrktVm(String sfr) {
		int flagozel=0;
		int index=0;
		while (index<sfr.length()) {
			
			if (sfr.charAt(index)>=' ' && sfr.charAt(index)<='/') {
				flagozel=1;
			} 
			index++;
		}

		return flagozel;
	}

	public static int kucukHarVArmi(String sfr) {
		int flagkucuk=0;
		int index=0;
		while (index<sfr.length()) {
			
			if (sfr.charAt(index)>='a' && sfr.charAt(index)<='z') {
				flagkucuk=1;
			} 
			index++;
		}

		return flagkucuk;
	}

	private static int buyukHarfVarMi(String sfr) {
		int flagbuyuk=0;
		int index=0;
		while (index<sfr.length()) {
			
			if (sfr.charAt(index)>='A' && sfr.charAt(index)<='Z') {
				flagbuyuk=1;
			} 
			index++;
		}

		return flagbuyuk;
		
	}

}
