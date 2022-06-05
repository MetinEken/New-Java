package day17;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("rakamlar toplamini bulmak icin pozitif bir sayi giriniz");
		
		int sy=scan.nextInt();
		
		System.out.println("rakamlar toplami icin bir sinir deger giriniz");
		
		int snr=scan.nextInt();
		
		
		if(sy<=0) {
		System.out.println("lutfen pozitif bir tam sayi giriniz");

	}else {
		if(rakamlarToplami(sy)>snr) {
			System.out.println("girdiginiz sayinin rakamlar toplami : "+ rakamlarToplami(sy));
			System.out.println("girdiginiz sinir deger : "+ snr);
			System.out.println("girdiginiz sayinin rakalmlar toplami sinir degerden buyuktur");
		}else {
			System.out.println("girdiginiz sayinin rakamlar toplami : "+ rakamlarToplami(sy));
			System.out.println("girdiginiz sinir deger : "+ snr);
			System.out.println("girdiginiz sayinin rakamlar toplami sinir degerden kucuktur.");
		}
		
	}
scan.close();
}

	public static int rakamlarToplami(int x) {
		int top=0; // toplamlarini buraya eklemek icin
		String sy2=x+""; // gelen int sayisinin uzunlugunu bulmak icin string e cevirdik. length methoduyla 
						// uzunlugunu bulacaz
		for (int i = 1; i <=sy2.length(); i++) { // sadece kac basamakli oldugunu bulduk, islem baslar
			top+=x%10;
			x/=10;
		
		
		
		}
		return top;
}}