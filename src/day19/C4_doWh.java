package day19;

import java.util.Scanner;

public class C4_doWh {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Oyuna hosgeldiniz, bitirmek icin 0' a basiniz");
	int btn=1; 
	int negSy=0;
	int pozSy=0;
	int toplam=0;
	
	
	do {
		System.out.println("tekrar sayi girin...");
		btn=scan.nextInt();
		if (btn>0) {
			toplam+=btn;
			pozSy++;
		} else if(btn<0){
			negSy++;
		}
		
	} while (btn !=0);
	
	System.out.println("GIRILEN POZITIF DEGER SAYISI : "+ pozSy);
	System.out.println("GIRILEN NEGATIF DEGER SAYISI : "+ negSy);
	System.out.println("toplam : "+toplam);
	scan.close();
}
}
