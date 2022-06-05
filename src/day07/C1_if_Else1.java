package day07;

import java.util.Scanner;

public class C1_if_Else1 {

	public static void main(String[] args) {
		
		// kare mi degil mi
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen uzunluk iriniz");
		double kose1=scan.nextDouble();
		System.out.println("ikinci koseyi giriniz");
		double kose2=scan.nextDouble();
		if (kose1==kose2) {
			System.out.println("kare");
		} else {
System.out.println("kare degil");
		}
		
		scan.close();
		
// if else de sadece 2 secenek vardir. baska bir secenek yok.
	}

}
