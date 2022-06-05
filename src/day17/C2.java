package day17;

import java.util.Scanner;

public class C2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("rakamlar toplamini bulmak icin bir sayi giriniz");
		
		int sy=scan.nextInt();
		
		if(sy<=0) {
			System.out.println("lutfen pozitif tam sayi giriniz");
		}else {
			rakamToplami(sy);
		}
		
scan.close();
	}

	private static void rakamToplami(int x) {
		int top=0; // toplamlarini buraya eklemek icin
		String sy2=x+""; // gelen int sayisinin uzunlugunu bulmak icin string e cevirdik. length methoduyla 
						// uzunlugunu bulacaz
		for (int i = 1; i <=sy2.length(); i++) { // sadece kac basamakli oldugunu bulduk, islem baslar
			top+=x%10;
			x/=10;
			
			
		}
		System.out.println("girilen sayinin rakamlar toplami : " + top +" dir.");
	
	}
}
