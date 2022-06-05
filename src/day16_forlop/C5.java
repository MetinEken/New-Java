package day16_forlop;

import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("100 den kucuk bir tam sayi giriniz");
		
		int sy1=scan.nextInt();
		
		if(sy1>=100) {
			System.out.println("lutfen yuzden kucuk giriniz");
		}else if(sy1<100){
			for (int i = sy1; i < 100; i++) {
				if(i%3==0 && i%5==0) {
					System.out.println("Java Guzeldir");
				}else if((i%3==0) && !(i%5==0)) {
					System.out.println("Java");
				}else if((i%5==0)&& !(i%3==0)) {
					System.out.println("Guzeldir");
				}else {
					System.out.println(i);
				}
				
				
			}
		}
scan.close();
}}
