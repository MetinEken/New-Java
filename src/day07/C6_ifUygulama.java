package day07;

import java.util.Scanner;

public class C6_ifUygulama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		double not1 =scan.nextDouble();
		System.out.println("bir sayi daha giriniz");
		double not2 =scan.nextDouble();
	 
		if (not1==0 || not2==0) {
			System.out.println("0 rakami carpmaya gore yutan elemandir");
		} else if(not1>0 && not2>0){
			System.out.println("sayilarin toplami : " + (not1+not2));

		}else if(not1<0 && not2<0) {
			System.out.println("sayilarin carpimi : " +(not1*not2));
		} else {
			System.out.println("farkli isaretlerle islem yapamazsiniz");
		}
		
		scan.close();
	}

}
