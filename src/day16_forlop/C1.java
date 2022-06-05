package day16_forlop;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("2 adet pozitif sayi giriniz");
		
		int sy1=scan.nextInt();
		int sy2=scan.nextInt();
		if(sy1<=0 || sy2<=0) {
			System.out.println("pozitif sayi giriniz");
		}else if(sy1<sy2){
			for(int i=sy1 ; i<=sy2 ; i++) {
				System.out.print(i+",");
			}// int i=sy1 ; i<=sy2 ; i++
		}else {
			for(int i=sy2 ; i<=sy1 ; i++) {
				System.out.print(i+",");
		}

	}
		scan.close();
	}}
