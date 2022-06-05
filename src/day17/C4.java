package day17;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("faktoriyel hesabiicin 40 dan kucuk pozitif bir sayi giriniz");
		
		int sy=scan.nextInt();

		if(sy<=0 || sy>=40) {
			System.out.println("40 dan kucuk pozitif bir sayi giriniz");
		}else {
			System.out.println("girdiginiz sayinin faktoriyel hesabi : "+faktoriyelHesapla(sy));
		}
		scan.close();
	}

	public static long faktoriyelHesapla(int x) {
		long toplam=1; // carpma islemi oldugu icin baslangic degeri 1 olmai
						// 0 olursa sonnuc hep 0 olur
		for (int i = 1; i <= x; i++) {
			toplam*=i;
			
		}
		return toplam;
		
			}

}
