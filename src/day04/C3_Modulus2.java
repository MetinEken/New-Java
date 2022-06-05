package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");

		int sayi=scan.nextInt();
		
		int birlerBasamagi= sayi%10;
		sayi = sayi/10;
		// birler basamagini bulduk, sayiyiu 3 basamakli hale getirdik.
		
		int onlarBasamagi = sayi%10;
		sayi = sayi/10;
		// onlar basamagini bulduk, 2 basamakli yaptik.
		
		int yuzlerBasamagi = sayi%10;
		sayi = sayi/10;
		// yuzler basamagi bulundu, sayi tek basamakli oldu.
		
		int binlerBasamagi = sayi;
		System.out.println("birler ; "+birlerBasamagi);
		System.out.println("onlar :"+onlarBasamagi);
		System.out.println("yuzler : "+yuzlerBasamagi);
		System.out.println("binler : "+binlerBasamagi);
		
		System.out.println("tersten yazilisi ; "+birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi);
		
		
		scan.close();
		
		
	}

}
