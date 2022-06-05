package day15_MethodCreation;

import java.util.Scanner;

public class Uygulama {

	 	public static void main(String[] args) {
	 		
	 		Scanner scan = new Scanner(System.in);
	 		
	 		System.out.println("lutfen kac sayi gireceginizi yaziniz");
	 		
	 		int ad=scan.nextInt();
	 		
	 		if(ad<2) {
	 			System.out.println("en az 2 say en fazla 4 sayi girebilirsiniz");
	 		} else if(ad==2) {
	 			ikiTopla(); // burda method a gonderecek bisey yok. 
	 			// method icinde sayi istiyoruz
	 		} else if(ad==3) {
	 			uctpla();
	 		}else if(ad==4) {
	 			dortTopla();
	 		}else {
	 			System.out.println("cok sayi girdiniz toplayamam");
	 		}
	 		scan.close();
	 	}

		private static void dortTopla() {
Scanner scan = new Scanner(System.in);
	 		
	 		System.out.println("lutfen 4 sayi giriniz");
	 		double sy1=scan.nextDouble();
	 		double sy2=scan.nextDouble();
	 		double sy3=scan.nextDouble();
	 		double sy4=scan.nextDouble();
	 		System.out.println("dort sayinin toplami : " +(sy1+sy2+sy3+sy4));
	 		scan.close();
		}

		private static void uctpla() {
Scanner scan = new Scanner(System.in);
	 		
	 		System.out.println("lutfen 3 sayi giriniz");
	 		double sy1=scan.nextDouble();
	 		double sy2=scan.nextDouble();
	 		double sy3=scan.nextDouble();
	 		System.out.println("uc sayinin toplami : " +(sy1+sy2+sy3));
	 		scan.close();
		}

		private static void ikiTopla() {
Scanner scan = new Scanner(System.in);
	 		
	 		System.out.println("lutfen 2 sayi giriniz");
	 		double sy1=scan.nextDouble();
	 		double sy2=scan.nextDouble();
	 		System.out.println("iki sayinin toplami : " +(sy1+sy2));
	 		scan.close();
		}
}
