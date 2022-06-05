package day18_WhileLoop;

import java.util.Scanner;

public class C4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tam sayi giriniz");
		
		
		int sy=scan.nextInt();
		
		int count=1;
		int toplam=0;
		while(count<=sy) {
			if(sy%count==0) {
				toplam++;
				System.out.println(toplam+"- "+count+" ");
			}
			count++;
		}
		System.out.println("");
		System.out.println("sayinin bolenleri "+ toplam+" adettir");
		scan.close();
	}

}
